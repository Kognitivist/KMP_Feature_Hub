package com.kognitivist.moodie.ui.screens._05_Settings


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.touchlab.kermit.Logger
import com.kognitivist.data.Settings
import com.kognitivist.data.models.getLocale
import com.kognitivist.data.models.getTheme
import com.kognitivist.moodie.ui.screens._05_Settings.mvi.SettingsAction
import com.kognitivist.moodie.ui.screens._05_Settings.mvi.SettingsIntent
import com.kognitivist.moodie.ui.screens._05_Settings.mvi.SettingsState
import org.koin.compose.koinInject
import pro.respawn.flowmvi.api.Container
import pro.respawn.flowmvi.dsl.store
import pro.respawn.flowmvi.dsl.updateStateImmediate
import pro.respawn.flowmvi.plugins.init
import pro.respawn.flowmvi.plugins.recover
import pro.respawn.flowmvi.plugins.reduce

class SettingsVM(
	val settingsRepo: Settings
): ViewModel(), Container<SettingsState, SettingsIntent, SettingsAction> {

	override val store = store(initial = SettingsState()) {
		configure {
			name = "Settings"
			parallelIntents = true
		}
		init {
			val settings = settingsRepo.getSettings()
			Logger.i(tag = "SettingsVM") { "init $settings"}
			updateStateImmediate {
				copy(
					selectedTheme = settings?.theme.getTheme(),
					selectedLocale = settings?.language.getLocale()
			) }
		}
		recover {
			Logger.e(tag = "SettingsVM") { it.message.toString() }
			null
		}
		reduce { intent ->
			when (intent) {
				is SettingsIntent.SetTheme -> {
					updateState { copy(selectedTheme = intent.theme) }
					settingsRepo.setTheme(intent.theme)
				}
				is SettingsIntent.SetLocale-> {
					updateState { copy(selectedLocale = intent.locale) }
					settingsRepo.setLocale(intent.locale)
				}
			}
		}
	}

	init {
		store.start(viewModelScope)
	}

}
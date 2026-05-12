package com.kognitivist.moodie.ui.screens._05_Settings.mvi

import com.kognitivist.data.models.Locale
import com.kognitivist.data.models.Theme
import pro.respawn.flowmvi.api.MVIAction
import pro.respawn.flowmvi.api.MVIIntent
import pro.respawn.flowmvi.api.MVIState

data class SettingsState(
	val selectedTheme: Theme = Theme.LIGHT,
	val selectedLocale: Locale = Locale.EN
) : MVIState

sealed interface SettingsIntent : MVIIntent {
	data class SetTheme(val theme: Theme) : SettingsIntent
	data class SetLocale(val locale: Locale) : SettingsIntent
}

sealed interface SettingsAction : MVIAction {

}


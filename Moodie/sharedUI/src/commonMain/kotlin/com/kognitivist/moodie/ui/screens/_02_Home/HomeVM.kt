package com.kognitivist.moodie.ui.screens._02_Home


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kognitivist.moodie.ui.screens._02_Home.mvi.HomeAction
import com.kognitivist.moodie.ui.screens._02_Home.mvi.HomeIntent
import com.kognitivist.moodie.ui.screens._02_Home.mvi.HomeState
import pro.respawn.flowmvi.api.Container
import pro.respawn.flowmvi.dsl.store
import pro.respawn.flowmvi.plugins.recover
import pro.respawn.flowmvi.plugins.reduce

class HomeVM(): ViewModel(), Container<HomeState, HomeIntent, HomeAction> {

	override val store = store(initial = HomeState()) {
		configure {
			name = "Home"
		}
		recover {
			null
		}
		reduce { intent ->
			when (intent) {
				HomeIntent.StartDailyTest -> {}
			}
		}
	}
	init {
		store.start(viewModelScope)
	}
}
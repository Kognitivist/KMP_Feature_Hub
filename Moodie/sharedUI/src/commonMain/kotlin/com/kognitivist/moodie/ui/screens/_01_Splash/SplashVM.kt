package com.kognitivist.moodie.ui.screens._01_Splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kognitivist.moodie.ui.screens._01_Splash.mvi.SplashAction
import com.kognitivist.moodie.ui.screens._01_Splash.mvi.SplashIntent
import com.kognitivist.moodie.ui.screens._01_Splash.mvi.SplashState
import pro.respawn.flowmvi.api.Container
import pro.respawn.flowmvi.dsl.store
import pro.respawn.flowmvi.plugins.recover
import pro.respawn.flowmvi.plugins.reduce


class SplashVM: ViewModel(), Container<SplashState, SplashIntent, SplashAction>  {
	override val store = store(initial = SplashState) {
		configure {
			name = "Splash"
		}
		recover { null }
		reduce { intent -> }
	}
	init {
		store.start(viewModelScope)
	}
}
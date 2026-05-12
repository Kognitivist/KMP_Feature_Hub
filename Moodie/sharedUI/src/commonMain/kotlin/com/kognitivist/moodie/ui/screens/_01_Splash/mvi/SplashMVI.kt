package com.kognitivist.moodie.ui.screens._01_Splash.mvi

import androidx.compose.runtime.Stable
import pro.respawn.flowmvi.api.MVIAction
import pro.respawn.flowmvi.api.MVIIntent
import pro.respawn.flowmvi.api.MVIState

@Stable
data object SplashState : MVIState

sealed interface SplashIntent : MVIIntent {}

sealed interface SplashAction : MVIAction {}
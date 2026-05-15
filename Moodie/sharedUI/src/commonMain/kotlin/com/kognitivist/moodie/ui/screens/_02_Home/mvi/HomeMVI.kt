package com.kognitivist.moodie.ui.screens._02_Home.mvi

import pro.respawn.flowmvi.api.MVIAction
import pro.respawn.flowmvi.api.MVIIntent
import pro.respawn.flowmvi.api.MVIState

data class HomeState(
	val dailyTestIsPassed: Boolean = true
) : MVIState

sealed interface HomeIntent : MVIIntent {
	data object StartDailyTest: MVIIntent
}

sealed interface HomeAction : MVIAction {

}
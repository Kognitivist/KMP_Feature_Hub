package com.kognitivist.common_features.dataBaseRoom.mvi

import pro.respawn.flowmvi.api.MVIAction
import pro.respawn.flowmvi.api.MVIIntent
import pro.respawn.flowmvi.api.MVIState

data class DataBaseState(
	val listTexts: List<String> = listOf()
) : MVIState

sealed interface DataBaseIntent : MVIIntent {

}

sealed interface DataBaseAction : MVIAction {

}
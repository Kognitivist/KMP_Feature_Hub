package com.kognitivist.moodie.ui.screens._03_Collection.mvi

import pro.respawn.flowmvi.api.MVIAction
import pro.respawn.flowmvi.api.MVIIntent
import pro.respawn.flowmvi.api.MVIState

data class CollectionState(
	val dailyTestIsPassed: Boolean = false
) : MVIState

sealed interface CollectionIntent : MVIIntent {

}

sealed interface CollectionAction : MVIAction {

}
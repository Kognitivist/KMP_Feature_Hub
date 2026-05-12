package com.kognitivist.moodie.ui.screens._04_Diary.mvi

import pro.respawn.flowmvi.api.MVIAction
import pro.respawn.flowmvi.api.MVIIntent
import pro.respawn.flowmvi.api.MVIState

data class DiaryState(
	val dailyTestIsPassed: Boolean = false
) : MVIState

sealed interface DiaryIntent : MVIIntent {
}

sealed interface DiaryAction : MVIAction {

}
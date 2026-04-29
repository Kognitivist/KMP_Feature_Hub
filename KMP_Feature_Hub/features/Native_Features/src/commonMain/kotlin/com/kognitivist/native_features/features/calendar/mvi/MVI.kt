package com.kognitivist.native_features.features.calendar.mvi

import androidx.compose.runtime.Stable
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import pro.respawn.flowmvi.api.MVIAction
import pro.respawn.flowmvi.api.MVIIntent
import pro.respawn.flowmvi.api.MVIState
import kotlin.time.Clock

@Stable
data class CalendarState(
	val selectedDay: LocalDateTime = Clock.System.now().toLocalDateTime(TimeZone.UTC)
) : MVIState

sealed interface CalendarIntent : MVIIntent {
	data class SelectDay(val selectedDay: LocalDateTime): CalendarIntent
}

sealed interface CalendarAction : MVIAction {
	data class ShowToast(val selectedDay:LocalDateTime): CalendarAction
}
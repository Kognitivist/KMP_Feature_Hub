package com.kognitivist.native_features.features.calendar

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.kognitivist.native_features.features.calendar.mvi.CalendarIntent
import com.kognitivist.native_features.features.calendar.mvi.CalendarState
import pro.respawn.flowmvi.api.IntentReceiver
import pro.respawn.flowmvi.compose.dsl.subscribe
import pro.respawn.flowmvi.compose.preview.EmptyReceiver

@Composable
fun CalendarScreen(
	container: CalendarViewModel,
) = with(container.store) {

	val state by subscribe { action ->
		when (action) {
			else -> TODO()
		}
	}

	CalendarScreenContent(state)
}

@Composable
private fun IntentReceiver<CalendarIntent>.CalendarScreenContent(
	state: CalendarState,
) {
	NativeCalendar {  }
}

@Composable
@Preview
private fun CalendarScreenPreview() = EmptyReceiver {
	CalendarScreenContent(CalendarState())
}

@Composable
expect fun NativeCalendar(
	onDateSelected: (Long) -> Unit = {}
)

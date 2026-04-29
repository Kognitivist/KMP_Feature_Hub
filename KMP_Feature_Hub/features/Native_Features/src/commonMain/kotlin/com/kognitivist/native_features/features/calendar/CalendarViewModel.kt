package com.kognitivist.native_features.features.calendar

import androidx.lifecycle.ViewModel
import com.kognitivist.native_features.features.calendar.mvi.CalendarAction
import com.kognitivist.native_features.features.calendar.mvi.CalendarIntent
import com.kognitivist.native_features.features.calendar.mvi.CalendarState



import pro.respawn.flowmvi.api.Container
import pro.respawn.flowmvi.dsl.store
import pro.respawn.flowmvi.plugins.recover
import pro.respawn.flowmvi.plugins.reduce



class CalendarViewModel: ViewModel(), Container<CalendarState, CalendarIntent, CalendarAction> {

	override val store = store(initial = CalendarState()) {
		configure {
			name = "Calendar"
		}
		recover {
			null
		}
		reduce { intent ->
			when (intent) {
				else -> TODO()
			}
		}
	}
}
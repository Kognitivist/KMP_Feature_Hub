package com.kognitivist.common_features.dataBaseRoom

import androidx.compose.material3.DatePickerState
import androidx.lifecycle.ViewModel
import com.kognitivist.common_features.dataBaseRoom.mvi.DataBaseAction
import com.kognitivist.common_features.dataBaseRoom.mvi.DataBaseIntent
import com.kognitivist.common_features.dataBaseRoom.mvi.DataBaseState
import pro.respawn.flowmvi.api.Container
import pro.respawn.flowmvi.api.PipelineContext
import pro.respawn.flowmvi.dsl.store
import pro.respawn.flowmvi.dsl.updateState
import pro.respawn.flowmvi.dsl.withState
import pro.respawn.flowmvi.plugins.recover
import pro.respawn.flowmvi.plugins.reduce

class DataBaseViewModel(): ViewModel(), Container<DataBaseState, DataBaseIntent, DataBaseAction> {

	override val store = store(initial = DataBaseState()) {
		configure {
			name = ""
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


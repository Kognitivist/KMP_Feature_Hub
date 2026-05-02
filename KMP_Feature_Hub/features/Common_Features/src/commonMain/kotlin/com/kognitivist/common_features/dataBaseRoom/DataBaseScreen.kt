package com.kognitivist.common_features.dataBaseRoom

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.kognitivist.common_features.dataBaseRoom.mvi.DataBaseIntent
import com.kognitivist.common_features.dataBaseRoom.mvi.DataBaseState
import pro.respawn.flowmvi.api.Container
import pro.respawn.flowmvi.api.IntentReceiver
import pro.respawn.flowmvi.compose.dsl.subscribe
import pro.respawn.flowmvi.compose.preview.EmptyReceiver

@Composable
fun DataBaseScreen(
	container: DataBaseViewModel,
) = with(container.store) {

	val state by subscribe { action ->
		when (action) {
			else -> TODO()
		}
	}

	DataBaseScreenContent(state)
}

@Composable
private fun IntentReceiver<DataBaseIntent>.DataBaseScreenContent(
	state: DataBaseState,
) {
	when (state) {

		else -> TODO()
	}
}

@Composable
@Preview
private fun DataBaseScreenPreview() = EmptyReceiver {
	DataBaseScreenContent(DataBaseState())
}

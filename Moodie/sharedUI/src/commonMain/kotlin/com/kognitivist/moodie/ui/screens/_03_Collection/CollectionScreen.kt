package com.kognitivist.moodie.ui.screens._03_Collection

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.kognitivist.data.models.Theme
import com.kognitivist.moodie.theme.MoodieTheme
import com.kognitivist.moodie.ui.navigation.NavEvents
import com.kognitivist.moodie.ui.screens._03_Collection.mvi.CollectionIntent
import com.kognitivist.moodie.ui.screens._03_Collection.mvi.CollectionState
import org.koin.compose.koinInject
import org.koin.compose.viewmodel.koinViewModel
import pro.respawn.flowmvi.api.IntentReceiver
import pro.respawn.flowmvi.compose.dsl.subscribe
import pro.respawn.flowmvi.compose.preview.EmptyReceiver

@Composable
fun CollectionScreen(
	container: CollectionVM = koinViewModel(),
	onNavEvent: (NavEvents)-> Unit
) = with(container.store) {

	val state by subscribe()

	CollectionScreenContent(state)
}

@Composable
private fun IntentReceiver<CollectionIntent>.CollectionScreenContent(
	state: CollectionState,
) {

}

@Composable
@Preview
private fun HomeScreenPreviewLight() = EmptyReceiver {
	MoodieTheme(theme = Theme.LIGHT) {
		CollectionScreenContent(CollectionState())
	}
}

@Composable
@Preview
private fun HomeScreenPreviewDark() = EmptyReceiver {
	MoodieTheme(theme = Theme.LIGHT) {
		CollectionScreenContent(CollectionState())
	}
}

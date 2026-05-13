package com.kognitivist.moodie.ui.screens._02_Home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.kognitivist.data.models.Theme
import com.kognitivist.moodie.theme.MoodieTheme
import com.kognitivist.moodie.ui.navigation.NavEvents
import com.kognitivist.moodie.ui.screens._02_Home.mvi.HomeIntent
import com.kognitivist.moodie.ui.screens._02_Home.mvi.HomeState
import org.koin.compose.koinInject
import org.koin.compose.viewmodel.koinViewModel
import pro.respawn.flowmvi.api.IntentReceiver
import pro.respawn.flowmvi.compose.dsl.subscribe
import pro.respawn.flowmvi.compose.preview.EmptyReceiver

@Composable
fun HomeScreen(
	container: HomeVM = koinViewModel(),
	onNavEvent: (NavEvents)-> Unit
) = with(container.store) {

	val state by subscribe()

	HomeScreenContent(state)
}

@Composable
private fun IntentReceiver<HomeIntent>.HomeScreenContent(
	state: HomeState,
) {

}

@Composable
@Preview
private fun HomeScreenPreviewLight() = EmptyReceiver {
	MoodieTheme(theme = Theme.LIGHT) {
		HomeScreenContent(HomeState())
	}
}

@Composable
@Preview
private fun HomeScreenPreviewDark() = EmptyReceiver {
	MoodieTheme(theme = Theme.LIGHT) {
		HomeScreenContent(HomeState())
	}
}

package com.kognitivist.moodie.ui.screens._04_Diary

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import com.kognitivist.data.models.Theme
import com.kognitivist.moodie.theme.MoodieTheme
import com.kognitivist.moodie.ui.navigation.NavEvents
import com.kognitivist.moodie.ui.screens._04_Diary.mvi.DiaryIntent
import com.kognitivist.moodie.ui.screens._04_Diary.mvi.DiaryState
import org.koin.compose.koinInject
import pro.respawn.flowmvi.api.IntentReceiver
import pro.respawn.flowmvi.compose.dsl.subscribe
import pro.respawn.flowmvi.compose.preview.EmptyReceiver

@Composable
fun DiaryScreen(
	container: DiaryVM = koinInject(),
	onNavEvent: (NavEvents)-> Unit
) = with(container.store) {

	val state by subscribe()

	DiaryScreenContent(state)
}

@Composable
private fun IntentReceiver<DiaryIntent>.DiaryScreenContent(
	state: DiaryState,
) {

}

@Composable
@Preview
private fun HomeScreenPreviewLight() = EmptyReceiver {
	MoodieTheme(theme = Theme.LIGHT) {
		DiaryScreenContent(DiaryState())
	}
}

@Composable
@Preview
private fun HomeScreenPreviewDark() = EmptyReceiver {
	MoodieTheme(theme = Theme.LIGHT) {
		DiaryScreenContent(DiaryState())
	}
}

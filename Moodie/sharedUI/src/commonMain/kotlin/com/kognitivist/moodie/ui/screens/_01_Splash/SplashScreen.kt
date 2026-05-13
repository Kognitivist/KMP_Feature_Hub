package com.kognitivist.moodie.ui.screens._01_Splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.kognitivist.data.Settings
import com.kognitivist.data.models.Theme
import com.kognitivist.data.theme.getSystemTheme
import com.kognitivist.moodie.theme.darkColorScheme
import com.kognitivist.moodie.theme.lightColorScheme
import com.kognitivist.moodie.ui.navigation.NavEvents
import com.kognitivist.moodie.ui.navigation.NavRoutes
import com.kognitivist.moodie.ui.screens._01_Splash.mvi.SplashIntent
import com.kognitivist.moodie.ui.screens._01_Splash.mvi.SplashState
import kotlinx.coroutines.delay
import org.koin.compose.koinInject
import org.koin.compose.viewmodel.koinViewModel
import pro.respawn.flowmvi.api.IntentReceiver
import pro.respawn.flowmvi.compose.dsl.subscribe
import pro.respawn.flowmvi.compose.preview.EmptyReceiver

@Composable
fun SplashScreen(
	container: SplashVM = koinViewModel(),
	onNavEvent: (NavEvents)-> Unit
) = with(container.store) {
	val state by subscribe()

	LaunchedEffect(true){
		delay(2000)
		onNavEvent(NavEvents.GoHomeWithClearStack)
	}
	SplashScreenContent(state)
}

@Composable
private fun IntentReceiver<SplashIntent>.SplashScreenContent(
	state: SplashState,
) {
	val colors = if (getSystemTheme() == Theme.DARK) darkColorScheme else lightColorScheme

	Box(
		contentAlignment = Alignment.Center,
		modifier = Modifier.fillMaxSize().background(colors.background)
	){
		Text("Splash", fontSize = 55.sp, color = colors.onBackground,)
	}
}

@Composable
@Preview
private fun SplashScreenPreview() = EmptyReceiver {
	SplashScreenContent(SplashState)
}
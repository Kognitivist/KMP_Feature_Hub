package com.kognitivist.app

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.scene.DialogSceneStrategy
import androidx.navigation3.ui.NavDisplay
import com.kognitivist.app.theme.AppTheme
import com.kognitivist.common_features.CommonFeaturesScreen
import com.kognitivist.common_features.dataBaseRoom.data.TextRepository
import com.kognitivist.core.tools.NavigationActions
import com.kognitivist.core.tools.Routes
import com.kognitivist.core.tools.navSavedStateConfiguration
import com.kognitivist.list_features_level_1.ListFeaturesLevel1Screen
import com.kognitivist.native_features.NativeFeaturesScreen
import com.kognitivist.native_features.features.calendar.CalendarScreen
import org.koin.compose.koinInject
import org.koin.compose.viewmodel.koinViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun App(
    onThemeChanged: @Composable (isDark: Boolean) -> Unit = {},
    textRepository: TextRepository = koinInject()
) = AppTheme(onThemeChanged) {
    val texts = textRepository.observeTexts().collectAsStateWithLifecycle(listOf())
    LaunchedEffect(texts.value){
        println(texts.value)
    }


    val backStack = rememberNavBackStack(
        configuration = navSavedStateConfiguration,
        Routes.ListFeaturesLevel1Route
    )
    val dialogStrategy = remember { DialogSceneStrategy<NavKey>() }

    Column {
        TopAppBar(
            title = { Text("Title") }
        )
        NavDisplay(
            modifier = Modifier.windowInsetsPadding(WindowInsets.systemBars),
            backStack = backStack,
            onBack = { backStack.removeLastOrNull() },
            sceneStrategies = listOf(dialogStrategy),
            transitionSpec = {
                fadeIn(animationSpec = tween(220)) togetherWith
                        fadeOut(animationSpec = tween(220))
            },
            entryProvider = entryProvider {
                entry<Routes.ListFeaturesLevel1Route> {
                    ListFeaturesLevel1Screen(koinViewModel()){
                        navigationProcessing(it, backStack)
                    }
                }
                entry<Routes.NativeFeaturesRoute>() { key ->
                    key.platform
                    NativeFeaturesScreen(koinViewModel()){
                        navigationProcessing(it, backStack)
                    }
                }
                entry<Routes.NativeCalendarRoute>() {
                    CalendarScreen(koinViewModel())
                }
                entry<Routes.CommonFeaturesRoute>() {
                    CommonFeaturesScreen(koinViewModel()){

                    }
                }
                entry<Routes.DataBaseRoomRoute>() {
                    Box(modifier = Modifier.fillMaxSize())
                }
            }
        )
    }


}

fun navigationProcessing(action: NavigationActions, backStack: NavBackStack<NavKey>){
    when(action){
			is NavigationActions.NavigationTo -> { backStack.add(action.route) }
		}
}


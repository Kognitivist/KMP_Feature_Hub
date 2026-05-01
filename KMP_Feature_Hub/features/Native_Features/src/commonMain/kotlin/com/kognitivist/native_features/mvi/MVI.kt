package com.kognitivist.native_features.mvi

import androidx.compose.runtime.Stable
import com.kognitivist.core.tools.Routes
import pro.respawn.flowmvi.api.MVIAction
import pro.respawn.flowmvi.api.MVIIntent
import pro.respawn.flowmvi.api.MVIState

@Stable
data class NativeFeaturesState(
	val listFeatures: List<NativeFeatures> = NativeFeatures.entries.toList()
) : MVIState

enum class NativeFeatures(val uiName: String, val route: Routes){
	Calendar("Calendar", Routes.NativeCalendarRoute),
}
sealed interface NativeFeaturesIntent : MVIIntent {}
sealed interface NativeFeaturesAction : MVIAction {
	data class NavigationTo(val route: String)
}
package com.kognitivist.list_features_level_1.mvi

import androidx.compose.runtime.Stable
import com.kognitivist.core.tools.Routes
import com.kognitivist.core.tools.platform
import pro.respawn.flowmvi.api.MVIAction
import pro.respawn.flowmvi.api.MVIIntent
import pro.respawn.flowmvi.api.MVIState

@Stable
data class ListFeaturesLevel1State(
	val listFeatures: List<FeaturesLevel1> = FeaturesLevel1.entries.toList()
) : MVIState

enum class FeaturesLevel1(val uiName: String, val route: Routes){
	NATIVE("Нативные фичи", Routes.NativeFeaturesRoute(platform())),
	COMMON("Общие фичи", Routes.CommonFeaturesRoute),
}

sealed interface ListFeaturesLevel1Intent : MVIIntent {
	data class ClickOnFeature(val feature:FeaturesLevel1): ListFeaturesLevel1Intent
}
sealed interface ListFeaturesLevel1Action : MVIAction {
	data class NavigationTo(val route: Routes): ListFeaturesLevel1Action
}
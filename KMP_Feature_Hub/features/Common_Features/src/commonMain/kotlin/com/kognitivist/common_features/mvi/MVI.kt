package com.kognitivist.common_features.mvi

import androidx.compose.runtime.Stable
import com.kognitivist.core.tools.Routes
import pro.respawn.flowmvi.api.MVIAction
import pro.respawn.flowmvi.api.MVIIntent
import pro.respawn.flowmvi.api.MVIState

@Stable
data class CommonFeaturesState(
	val listFeatures: List<CommonFeatures> = CommonFeatures.entries.toList()
) : MVIState

enum class CommonFeatures(val uiName: String, val route: Routes){
	DataBaseRoom("DataBaseRoom", Routes.DataBaseRoomRoute),
}
sealed interface CommonFeaturesIntent : MVIIntent {}
sealed interface CommonFeaturesAction : MVIAction {
	data class NavigationTo(val route: String)
}
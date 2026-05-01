package com.kognitivist.common_features

import androidx.lifecycle.ViewModel
import com.kognitivist.common_features.mvi.CommonFeaturesAction
import com.kognitivist.common_features.mvi.CommonFeaturesIntent
import com.kognitivist.common_features.mvi.CommonFeaturesState
import pro.respawn.flowmvi.api.Container
import pro.respawn.flowmvi.dsl.store
import pro.respawn.flowmvi.plugins.recover
import pro.respawn.flowmvi.plugins.reduce


class CommonFeaturesViewModel(): ViewModel(), Container<CommonFeaturesState, CommonFeaturesIntent, CommonFeaturesAction> {

	override val store = store(initial = CommonFeaturesState()) {
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


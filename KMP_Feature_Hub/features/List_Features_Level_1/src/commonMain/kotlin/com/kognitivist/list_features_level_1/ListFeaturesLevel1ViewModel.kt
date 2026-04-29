package com.kognitivist.list_features_level_1

import androidx.lifecycle.ViewModel
import com.kognitivist.list_features_level_1.mvi.ListFeaturesLevel1State
import pro.respawn.flowmvi.api.Container
import pro.respawn.flowmvi.dsl.store
import pro.respawn.flowmvi.plugins.recover
import pro.respawn.flowmvi.plugins.reduce


class ListFeaturesLevel1ViewModel(): ViewModel(),
	Container<ListFeaturesLevel1State, Nothing, Nothing> {

	override val store = store(initial = ListFeaturesLevel1State()) {
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


package com.kognitivist.native_features

import androidx.lifecycle.ViewModel
import com.kognitivist.native_features.mvi.NativeFeaturesAction
import com.kognitivist.native_features.mvi.NativeFeaturesIntent
import com.kognitivist.native_features.mvi.NativeFeaturesState
import pro.respawn.flowmvi.api.Container
import pro.respawn.flowmvi.dsl.store
import pro.respawn.flowmvi.plugins.recover
import pro.respawn.flowmvi.plugins.reduce


class NativeFeaturesViewModel(): ViewModel(), Container<NativeFeaturesState, NativeFeaturesIntent, NativeFeaturesAction> {

	override val store = store(initial = NativeFeaturesState()) {
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


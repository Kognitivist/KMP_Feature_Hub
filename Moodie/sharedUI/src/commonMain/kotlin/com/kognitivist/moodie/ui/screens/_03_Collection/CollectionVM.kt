package com.kognitivist.moodie.ui.screens._03_Collection


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kognitivist.moodie.ui.screens._03_Collection.mvi.CollectionAction
import com.kognitivist.moodie.ui.screens._03_Collection.mvi.CollectionIntent
import com.kognitivist.moodie.ui.screens._03_Collection.mvi.CollectionState
import pro.respawn.flowmvi.api.Container
import pro.respawn.flowmvi.dsl.store
import pro.respawn.flowmvi.plugins.recover
import pro.respawn.flowmvi.plugins.reduce

class CollectionVM(): ViewModel(), Container<CollectionState, CollectionIntent, CollectionAction> {

	override val store = store(initial = CollectionState()) {
		configure {
			name = "Collection"
		}
		recover {
			null
		}
		reduce { intent ->
			when (intent) {
				else -> {}
			}
		}
	}
	init {
		store.start(viewModelScope)
	}
}
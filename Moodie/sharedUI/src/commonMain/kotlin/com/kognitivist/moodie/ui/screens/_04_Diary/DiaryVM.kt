package com.kognitivist.moodie.ui.screens._04_Diary


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.kognitivist.moodie.ui.screens._02_Home.mvi.HomeAction
import com.kognitivist.moodie.ui.screens._02_Home.mvi.HomeIntent
import com.kognitivist.moodie.ui.screens._02_Home.mvi.HomeState
import com.kognitivist.moodie.ui.screens._04_Diary.mvi.DiaryAction
import com.kognitivist.moodie.ui.screens._04_Diary.mvi.DiaryIntent
import com.kognitivist.moodie.ui.screens._04_Diary.mvi.DiaryState
import pro.respawn.flowmvi.api.Container
import pro.respawn.flowmvi.dsl.store
import pro.respawn.flowmvi.plugins.recover
import pro.respawn.flowmvi.plugins.reduce

class DiaryVM(): ViewModel(), Container<DiaryState, DiaryIntent, DiaryAction> {

	override val store = store(initial = DiaryState()) {
		configure {
			name = "Diary"
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
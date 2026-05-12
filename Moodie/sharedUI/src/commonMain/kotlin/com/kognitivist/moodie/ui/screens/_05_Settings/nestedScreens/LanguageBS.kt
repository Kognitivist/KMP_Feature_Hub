package com.kognitivist.moodie.ui.screens._05_Settings.nestedScreens

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalBottomSheetProperties
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kognitivist.moodie.ui.navigation.NavEvents

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LanguageBS(
	onNavEvent: (NavEvents) -> Unit
) {
	ModalBottomSheet(
		onDismissRequest = { onNavEvent(NavEvents.GoBack) },
	){
		Spacer(Modifier.height(300.dp))
	}
}
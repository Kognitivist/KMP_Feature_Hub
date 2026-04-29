package com.kognitivist.native_features.features.calendar

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.DatePicker
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
actual fun NativeCalendar(
	onDateSelected: (Long) -> Unit
) {
	val state = rememberDatePickerState()
	DatePicker(
		state = state,
		modifier = Modifier.fillMaxSize()
	)
}
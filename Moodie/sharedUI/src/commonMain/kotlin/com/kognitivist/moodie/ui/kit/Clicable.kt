package com.kognitivist.moodie.ui.kit

import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalHapticFeedback

@Composable

fun Modifier.vibroClickable(
	vibroType:HapticFeedbackType = HapticFeedbackType.Confirm,
	onClick: () -> Unit
): Modifier {
	val haptic = LocalHapticFeedback.current
	return this.clickable{
		haptic.performHapticFeedback(vibroType)
		onClick()
	}
}
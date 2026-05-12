package com.kognitivist.moodie.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import moodie.sharedui.generated.resources.Manrope_Medium
import moodie.sharedui.generated.resources.Manrope_Regular
import moodie.sharedui.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
fun moodieTextStyles(): TextStyles {
	val manropeMedium = FontFamily(Font(Res.font.Manrope_Medium))
	val manropeRegular = FontFamily(Font(Res.font.Manrope_Regular))

	return TextStyles(
		titleMedium22 = TextStyle(
			fontFamily = manropeMedium,
			fontSize = 22.sp,
			),
		captionSmall11 = TextStyle(
			fontFamily = manropeRegular,
			fontSize = 11.sp,
			),
		bodyMedium16 = TextStyle(
			fontFamily = manropeMedium,
			fontSize = 16.sp,
			),
		)
}
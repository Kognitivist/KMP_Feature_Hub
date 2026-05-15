package com.kognitivist.moodie.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import moodie.sharedui.generated.resources.Fraunces_72pt_Soft_Bold
import moodie.sharedui.generated.resources.Fraunces_72pt_Soft_SemiBold
import moodie.sharedui.generated.resources.Fraunces_72pt_SuperSoft_Bold
import moodie.sharedui.generated.resources.Manrope_Medium
import moodie.sharedui.generated.resources.Manrope_Regular
import moodie.sharedui.generated.resources.Manrope_SemiBold
import moodie.sharedui.generated.resources.Res
import org.jetbrains.compose.resources.Font

@Composable
fun moodieTextStyles(): TextStyles {
	val manropeMedium = FontFamily(Font(Res.font.Manrope_Medium))
	val manropeRegular = FontFamily(Font(Res.font.Manrope_Regular))
	val manropeSemiBold= FontFamily(Font(Res.font.Manrope_SemiBold))
	val frauncesBold = FontFamily(Font(Res.font.Fraunces_72pt_Soft_Bold))
	val frauncesSemiBold = FontFamily(Font(Res.font.Fraunces_72pt_Soft_SemiBold))

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
		bodySmall12 = TextStyle(
			fontFamily = manropeMedium,
			fontSize = 12.sp,
		),
		labelLarge16 = TextStyle(
			fontFamily = manropeSemiBold,
			fontSize = 16.sp,
		),
		display36 = TextStyle(
			fontFamily = frauncesBold,
			fontSize = 36.sp,
		),
		display30 = TextStyle(
			fontFamily = frauncesSemiBold,
			fontSize = 30.sp,
		),
	)
}
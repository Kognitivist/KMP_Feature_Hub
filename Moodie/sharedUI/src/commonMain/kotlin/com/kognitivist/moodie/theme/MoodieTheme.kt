package com.kognitivist.moodie.theme

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.kognitivist.data.locale.getSystemLocale
import com.kognitivist.data.models.Locale
import com.kognitivist.data.models.Theme
import com.kognitivist.data.theme.getSystemTheme
import com.kognitivist.moodie.locale.LocalStrings
import com.kognitivist.moodie.locale.enStrings
import com.kognitivist.moodie.locale.ruStrings

@Immutable
data class Colors(
	val background: Color,
	val onBackground: Color,
	val surface1: Color,
	val surface2: Color,
	val primary: Color,
	val accent: Color,
	val hint: Color,
	val stroke1: Color,
	val stroke2: Color,
	val text1: Color,
	val text2: Color,
	val text3: Color,
)

@Immutable
data class Shapes(
	val zero: RoundedCornerShape,
	val smallest: RoundedCornerShape,
	val small: RoundedCornerShape,
	val medium: RoundedCornerShape,
	val large: RoundedCornerShape,
)

@Immutable
data class TextStyles(
	val titleMedium22: TextStyle = TextStyle.Default,
	val captionSmall11: TextStyle = TextStyle.Default,
	val bodyMedium16: TextStyle = TextStyle.Default,
	val bodySmall12: TextStyle = TextStyle.Default,
	val labelLarge16: TextStyle = TextStyle.Default,
	val display36: TextStyle = TextStyle.Default,
	val display30: TextStyle = TextStyle.Default,
)

@Immutable
data class Paddings(
	val zero: Dp,
	val extraSmall: Dp,
	val small: Dp,
	val default: Dp,
	val large: Dp,
	val extraLarge: Dp
)

val LocalColors = staticCompositionLocalOf {
	Colors(
		background = Color.Unspecified,
		onBackground = Color.Unspecified,
		surface1 = Color.Unspecified,
		surface2 = Color.Unspecified,
		primary = Color.Unspecified,
		accent = Color.Unspecified,
		hint = Color.Unspecified,
		stroke1 = Color.Unspecified,
		stroke2 = Color.Unspecified,
		text1 = Color.Unspecified,
		text2 = Color.Unspecified,
		text3 = Color.Unspecified,
	)
}
val LocalTextStyles = staticCompositionLocalOf { TextStyles() }


@Composable
fun MoodieTheme(
	theme: Theme = getSystemTheme(),
	locale: Locale = getSystemLocale(),
	content: @Composable () -> Unit,
) {
	val colors = when(theme){
			Theme.DARK -> darkColorScheme
			Theme.LIGHT -> lightColorScheme
	}
	val strings = when(locale){
		Locale.EN -> enStrings
		Locale.RU -> ruStrings
	}


	CompositionLocalProvider(
		LocalColors provides colors,
		LocalStrings provides strings,
		LocalTextStyles provides moodieTextStyles(),
		LocalIndication provides ripple(color = colors.primary),
		content = content
	)
}
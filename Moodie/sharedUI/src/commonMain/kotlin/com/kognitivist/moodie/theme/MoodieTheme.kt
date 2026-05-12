package com.kognitivist.moodie.theme

import androidx.compose.foundation.shape.RoundedCornerShape
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
	val onBackground: Color
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
	val titleMedium22: TextStyle,
	val captionSmall11: TextStyle,
	val bodyMedium16: TextStyle,
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
	)
}
val LocalTextStyles = staticCompositionLocalOf {
	TextStyles(
		titleMedium22 = TextStyle.Default,
		captionSmall11 = TextStyle.Default,
		bodyMedium16 = TextStyle.Default,
	)
}


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
		content = content
	)
}
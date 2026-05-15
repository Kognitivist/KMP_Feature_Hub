package com.kognitivist.moodie.ui.screens._05_Settings

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.touchlab.kermit.Logger
import com.kognitivist.data.models.Locale
import com.kognitivist.data.models.Theme
import com.kognitivist.moodie.locale.LocalStrings
import com.kognitivist.moodie.theme.LocalColors
import com.kognitivist.moodie.theme.LocalTextStyles
import com.kognitivist.moodie.theme.MoodieTheme
import com.kognitivist.moodie.ui.kit.vectors.AboutAppIcon
import com.kognitivist.moodie.ui.kit.vectors.ArrowRight48
import com.kognitivist.moodie.ui.kit.vectors.HowItWorksIcon
import com.kognitivist.moodie.ui.kit.vectors.LanguageSetIcon
import com.kognitivist.moodie.ui.kit.vectors.LookOnboardingAgainIcon
import com.kognitivist.moodie.ui.kit.vectors.PoliticsIcon
import com.kognitivist.moodie.ui.kit.vectors.SelectedCollection
import com.kognitivist.moodie.ui.kit.vectors.SystemThemeIcon
import com.kognitivist.moodie.ui.kit.vectors.VectorRes
import com.kognitivist.moodie.ui.kit.vibroClickable
import com.kognitivist.moodie.ui.navigation.NavEvents
import com.kognitivist.moodie.ui.navigation.NavRoutes
import com.kognitivist.moodie.ui.screens._05_Settings.mvi.SettingsIntent
import com.kognitivist.moodie.ui.screens._05_Settings.mvi.SettingsState
import org.koin.compose.koinInject
import org.koin.compose.viewmodel.koinViewModel
import pro.respawn.flowmvi.api.IntentReceiver
import pro.respawn.flowmvi.compose.dsl.subscribe
import pro.respawn.flowmvi.compose.preview.EmptyReceiver

@Composable
fun SettingsScreen(
	container: SettingsVM = koinViewModel(),
	onNavEvent: (NavEvents) -> Unit
) = with(container.store) {

	val state by subscribe()

	LaunchedEffect(state) {
		Logger.i(tag = "SettingsState") { state.toString() }
	}

	SettingsScreenContent(state, onNavEvent)
}

@Composable
private fun IntentReceiver<SettingsIntent>.SettingsScreenContent(
	state: SettingsState,
	onNavEvent: (NavEvents) -> Unit
) {
	val scrollState = rememberScrollState()
	val colors = LocalColors.current
	val strings = LocalStrings.current
	val textStyles = LocalTextStyles.current

	Column(
		modifier = Modifier.fillMaxSize().background(colors.background)
			.windowInsetsPadding(WindowInsets.systemBars)
			.padding(20.dp),
	) {
		Spacer(Modifier.height(14.dp))
		Text(
			text = strings.settingsStrings.settingsTitle,
			color = colors.text1,
			style = textStyles.titleMedium22,
			modifier = Modifier.align(Alignment.CenterHorizontally)
		)
		Spacer(Modifier.height(26.dp))
		Column(modifier = Modifier.verticalScroll(scrollState))
		{
			// Внешний вид
			TitleItem(strings.settingsStrings.appearance)
			SettingsItem(
				icon = VectorRes.SystemThemeIcon,
				title = strings.settingsStrings.themeApp,
				text = when(state.selectedTheme){
					Theme.DARK -> strings.settingsStrings.darkTheme
					Theme.LIGHT -> strings.settingsStrings.lightTheme
				},
			) {onNavEvent(NavEvents.NavTo(NavRoutes.ThemeBS))}
			Spacer(Modifier.height(12.dp))
			// Язык
			TitleItem(strings.settingsStrings.language)
			SettingsItem(
				icon = VectorRes.LanguageSetIcon,
				title = strings.settingsStrings.languageApp,
				text = when(state.selectedLocale){
					Locale.EN -> strings.settingsStrings.english
					Locale.RU  -> strings.settingsStrings.russian
				},
			) {onNavEvent(NavEvents.NavTo(NavRoutes.LanguageBS))}
			Spacer(Modifier.height(12.dp))
			// Как это работает
			TitleItem(strings.settingsStrings.howItWorks)
			SettingsItem(
				icon = VectorRes.HowItWorksIcon,
				title = strings.settingsStrings.howItWorks,
				text = strings.settingsStrings.howItWorksText,
			) {}
			SettingsItem(
				icon = VectorRes.LookOnboardingAgainIcon,
				title = strings.settingsStrings.lookOnboardingAgainTitle,
				text = strings.settingsStrings.lookOnboardingAgainText,
			) {}
			Spacer(Modifier.height(12.dp))
			// О приложении
			TitleItem(strings.settingsStrings.aboutAppTitle)
			SettingsItem(
				icon = VectorRes.AboutAppIcon,
				title = strings.settingsStrings.aboutAppTitle,
				text = strings.settingsStrings.aboutAppText,
			) {}
			Spacer(Modifier.height(12.dp))
			// Документы
			TitleItem(strings.settingsStrings.docs)
			SettingsItem(
				icon = VectorRes.PoliticsIcon,
				title = strings.settingsStrings.politics,
				text = "",
			) {}
			Spacer(Modifier.height(100.dp))
		}
	}
}

@Composable
private fun SettingsItem(
	icon: ImageVector,
	title: String,
	text: String,
	onClick: () -> Unit
) {
	val colors = LocalColors.current
	val strings = LocalStrings.current
	val textStyles = LocalTextStyles.current

	Row(
		modifier = Modifier.fillMaxWidth()
			.border(1.dp, colors.stroke2,RoundedCornerShape(12.dp))
			.clip(RoundedCornerShape(12.dp))
			.vibroClickable { onClick() }
			.padding(4.dp)
		,
		verticalAlignment = Alignment.CenterVertically,
		horizontalArrangement = Arrangement.SpaceBetween
	) {
		Row(
			verticalAlignment = Alignment.CenterVertically,
		) {
			Icon(
				imageVector = icon,
				contentDescription = null,
				tint = colors.onBackground
			)
			Column(
				modifier = Modifier.fillMaxHeight(),
				verticalArrangement = if (text.isNotEmpty()) Arrangement.SpaceBetween else Arrangement.Center
			) {
				Text(title, style = textStyles.bodyMedium16, color = colors.text1)
				if (text.isNotEmpty()){
					Text(text, style = textStyles.captionSmall11, color = colors.text2)
				}
			}
		}
		Icon(
			imageVector = VectorRes.ArrowRight48,
			contentDescription = null,
			modifier = Modifier,
			tint = colors.onBackground
		)
	}
	Spacer(Modifier.height(8.dp))
}

@Composable
private fun TitleItem(text: String){
	val colors = LocalColors.current
	val textStyles = LocalTextStyles.current

	Column {
		Text(
			text = text.uppercase(),
			color = colors.text2,
			style = textStyles.captionSmall11,
		)
		Spacer(Modifier.height(10.dp))
	}
}


@Composable
@Preview
private fun HomeScreenPreviewLight() = EmptyReceiver {
	MoodieTheme(theme = Theme.LIGHT) {
		SettingsScreenContent(SettingsState()){}
	}
}

@Composable
@Preview
private fun HomeScreenPreviewDark() = EmptyReceiver {
	MoodieTheme(theme = Theme.LIGHT) {
		SettingsScreenContent(SettingsState()){}
	}
}

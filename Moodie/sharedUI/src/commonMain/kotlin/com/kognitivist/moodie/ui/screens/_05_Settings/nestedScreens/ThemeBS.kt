package com.kognitivist.moodie.ui.screens._05_Settings.nestedScreens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalBottomSheetProperties
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.kognitivist.data.models.Theme
import com.kognitivist.moodie.locale.LocalStrings
import com.kognitivist.moodie.theme.LocalColors
import com.kognitivist.moodie.theme.LocalTextStyles
import com.kognitivist.moodie.ui.kit.vectors.SystemThemeIcon
import com.kognitivist.moodie.ui.kit.vectors.VectorRes
import com.kognitivist.moodie.ui.navigation.NavEvents
import com.kognitivist.moodie.ui.screens._05_Settings.SettingsVM
import com.kognitivist.moodie.ui.screens._05_Settings.mvi.SettingsIntent
import org.koin.compose.viewmodel.koinViewModel
import pro.respawn.flowmvi.compose.dsl.subscribe

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ThemeBS(
	container: SettingsVM = koinViewModel(),
	onNavEvent: (NavEvents) -> Unit
) = with(container.store) {
	val colors = LocalColors.current
	val strings = LocalStrings.current
	val textStyles = LocalTextStyles.current
	val state by subscribe()

	ModalBottomSheet(
		onDismissRequest = { onNavEvent(NavEvents.GoBack) },
		containerColor = colors.background
	){
		Column(
			modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
			horizontalAlignment = Alignment.CenterHorizontally
		) {
			Spacer(Modifier.height(17.dp))
			Text(
				text = strings.settingsStrings.themeApp,
				style = textStyles.titleMedium22,
				color = colors.text1
			)
			Spacer(Modifier.height(34.dp))
			Theme.entries.forEach { theme ->
				ItemTheme(
					isSelected = state.selectedTheme == theme,
					theme = theme,
				){
					intent(SettingsIntent.SetTheme(theme))
				}
			}
		}
		Spacer(Modifier.height(250.dp))
	}
}

@Composable
private fun ItemTheme(
	isSelected: Boolean,
	theme: Theme,
	onClick: () -> Unit
){
	val colors = LocalColors.current
	val strings = LocalStrings.current
	val textStyles = LocalTextStyles.current

	Row(
		modifier = Modifier
			.fillMaxWidth().clip(RoundedCornerShape(12.dp))
			.clickable{onClick()}.padding(vertical = 16.dp),
		horizontalArrangement = Arrangement.SpaceBetween,
		verticalAlignment = Alignment.CenterVertically
	) {
		Row(
			verticalAlignment = Alignment.CenterVertically
		) {
			Icon(
				imageVector = if (isSelected) theme.selectedIcon else theme.unSelectedIcon,
				contentDescription = null,
				tint = if (isSelected) colors.primary else colors.onBackground
			)
			Spacer(Modifier.width(20.dp))
			Text(
				text = when(theme){
					Theme.DARK -> strings.settingsStrings.dark
					Theme.LIGHT -> strings.settingsStrings.light
				},
				style = textStyles.bodyMedium16,
				color = if (isSelected) colors.text1 else colors.text2
			)
		}
		RadioButton(
			selected = isSelected,
			onClick = null,
			colors = RadioButtonDefaults.colors(
				selectedColor = colors.primary,
				unselectedColor = colors.onBackground
			)
		)
	}
}
package com.kognitivist.moodie.ui.kit.navBar

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kognitivist.moodie.locale.LocalStrings
import com.kognitivist.moodie.locale.ruStrings
import com.kognitivist.moodie.theme.LocalColors
import com.kognitivist.moodie.ui.kit.vectors.SelectedCollection
import com.kognitivist.moodie.ui.kit.vectors.SelectedDiary
import com.kognitivist.moodie.ui.kit.vectors.SelectedHome
import com.kognitivist.moodie.ui.kit.vectors.SelectedSettings
import com.kognitivist.moodie.ui.kit.vectors.UnselectedCollection
import com.kognitivist.moodie.ui.kit.vectors.UnselectedDiary
import com.kognitivist.moodie.ui.kit.vectors.UnselectedHome
import com.kognitivist.moodie.ui.kit.vectors.UnselectedSettings
import com.kognitivist.moodie.ui.kit.vectors.VectorRes
import com.kognitivist.moodie.ui.kit.vibroClickable
import com.kognitivist.moodie.ui.navigation.NavEvents
import com.kognitivist.moodie.ui.navigation.NavRoutes
import moodie.sharedui.generated.resources.Res
import moodie.sharedui.generated.resources.ic_dark_mode
import moodie.sharedui.generated.resources.ic_light_mode
import org.jetbrains.compose.resources.painterResource

@Composable
@Preview(showBackground = true)
fun BoxScope.NavBar(
	currentRoute: NavRoutes? = NavRoutes.Home,
	onNavEvent: (NavEvents) -> Unit = {}
) {
	val strings = LocalStrings.current
	val colors = LocalColors.current
	val isVisible = currentRoute == NavRoutes.Home ||
					currentRoute == NavRoutes.Diary ||
					currentRoute == NavRoutes.Collection ||
					currentRoute == NavRoutes.Settings

	AnimatedVisibility(
		visible = isVisible,
		enter = slideInVertically(
			initialOffsetY = { fullHeight -> fullHeight }
		),
		exit = slideOutVertically(
			targetOffsetY = { fullHeight -> fullHeight*3 }
		),
		modifier = Modifier
			.align(Alignment.BottomCenter)
	) {
		Column(
			modifier = Modifier
				.background(colors.background)
				.windowInsetsPadding(WindowInsets.navigationBars)
			) {
			HorizontalDivider(
				thickness = 1.dp,
				color = colors.stroke2
			)
			Spacer(Modifier.height(8.dp))
			Row(
				modifier = Modifier.fillMaxWidth(),
				verticalAlignment = Alignment.CenterVertically,
				horizontalArrangement = Arrangement.SpaceEvenly
			) {
				strings.navBarItems.forEach { entry ->
					NavBarItem(
						name = entry.value,
						navBarItem = entry.key,
						isSelected = currentRoute == entry.key.routes,
						onNavEvent = onNavEvent
					)
				}
			}
		}
	}
}

@Composable
@Preview
fun RowScope.NavBarItem(
	name: String = "",
	navBarItem: NavBarItem = NavBarItem.HOME,
	isSelected: Boolean = false,
	onNavEvent: (NavEvents) -> Unit = {}
) {
	val colors = LocalColors.current
	Column(
		modifier = Modifier.weight(1f).clip(CircleShape)
			.vibroClickable {
				onNavEvent(NavEvents.NavTo(navBarItem.routes))
			},
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.SpaceBetween
	) {
		Icon(
			imageVector = if (isSelected) navBarItem.selectedIcon else navBarItem.unselectedIcon,
			contentDescription = null,
			tint = if (isSelected) colors.primary else colors.onBackground
		)
		Spacer(modifier = Modifier.height(4.dp))
		Text(name, color = if (isSelected) colors.primary else colors.text1)
	}
}

enum class NavBarItem(
	val selectedIcon: ImageVector,
	val unselectedIcon: ImageVector,
	val routes: NavRoutes
){
	HOME(VectorRes.SelectedHome, VectorRes.UnselectedHome, NavRoutes.Home),
	DIARY(VectorRes.SelectedDiary, VectorRes.UnselectedDiary, NavRoutes.Diary),
	COLLECTION(VectorRes.SelectedCollection, VectorRes.UnselectedCollection, NavRoutes.Collection),
	SETTINGS(VectorRes.SelectedSettings, VectorRes.UnselectedSettings, NavRoutes.Settings)
}
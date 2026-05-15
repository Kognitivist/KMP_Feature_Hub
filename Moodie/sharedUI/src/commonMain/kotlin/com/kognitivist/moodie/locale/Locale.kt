package com.kognitivist.moodie.locale

import androidx.compose.runtime.staticCompositionLocalOf
import com.kognitivist.moodie.ui.kit.navBar.NavBarItem
import kotlin.to

data class Strings(
	val appName: String = "",
	val navBarItems: Map<NavBarItem, String> = mapOf(),
	val settingsStrings: SettingsScreenStrings = ruSettingsScreenStrings,
	val homeStrings: HomeScreenStrings = ruHomeScreenStrings
)

val LocalStrings = staticCompositionLocalOf {
	Strings()
}

val enStrings = Strings(
	appName = "Moodie",
	navBarItems = mapOf(
		NavBarItem.HOME to "Today",
		NavBarItem.DIARY to "Diary",
		NavBarItem.COLLECTION to "Collection",
		NavBarItem.SETTINGS to "Settings",
		),
	settingsStrings = enSettingsScreenStrings,
	homeStrings = enHomeScreenStrings

)

val ruStrings = Strings(
	appName = "Moodie",
	navBarItems = mapOf(
		NavBarItem.HOME to "Сегодня",
		NavBarItem.DIARY to "Дневник",
		NavBarItem.COLLECTION to "Коллекция",
		NavBarItem.SETTINGS to "Настройки",
		),
	settingsStrings = ruSettingsScreenStrings,
	homeStrings = ruHomeScreenStrings
)


package com.kognitivist.moodie.locale

import androidx.compose.runtime.staticCompositionLocalOf
import com.kognitivist.moodie.locale.enSettingsScreenStrings
import com.kognitivist.moodie.ui.kit.navBar.NavBarItem
import com.kognitivist.moodie.ui.navigation.NavRoutes
import kotlin.to

data class Strings(
	val text: String = "",
	val navBarItems: Map<NavBarItem, String> = mapOf(),
	val settingsStrings: SettingsScreenStrings = SettingsScreenStrings(),
)

val LocalStrings = staticCompositionLocalOf {
	Strings()
}

val enStrings = Strings(
	text = "text",
	navBarItems = mapOf(
		NavBarItem.HOME to "Today",
		NavBarItem.DIARY to "Diary",
		NavBarItem.COLLECTION to "Collection",
		NavBarItem.SETTINGS to "Settings",
		),
	settingsStrings = enSettingsScreenStrings

)

val ruStrings = Strings(
	text = "Текст",
	navBarItems = mapOf(
		NavBarItem.HOME to "Сегодня",
		NavBarItem.DIARY to "Дневник",
		NavBarItem.COLLECTION to "Коллекция",
		NavBarItem.SETTINGS to "Настройки",
		),
	settingsStrings = ruSettingsScreenStrings
)


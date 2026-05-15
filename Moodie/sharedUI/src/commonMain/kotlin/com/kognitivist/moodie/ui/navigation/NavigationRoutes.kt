package com.kognitivist.moodie.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class NavRoutes(open val name: NavRouteName) {
	@Serializable
	data object Splash: NavRoutes(NavRouteName.SPLASH)
	@Serializable
	data object Home: NavRoutes(NavRouteName.HOME)
	@Serializable
	data object Diary: NavRoutes(NavRouteName.DIARY)
	@Serializable
	data object Collection: NavRoutes(NavRouteName.COLLECTION)
	@Serializable
	data object Settings: NavRoutes(NavRouteName.SETTINGS)
	@Serializable
	data object ThemeBS: NavRoutes(NavRouteName.THEME_BS)
	@Serializable
	data object LanguageBS: NavRoutes(NavRouteName.LANGUAGE_BS)
}

@Serializable
enum class NavRouteName{
	SPLASH,
	HOME,
	DIARY,
	COLLECTION,
	SETTINGS,
	THEME_BS,
	LANGUAGE_BS
}

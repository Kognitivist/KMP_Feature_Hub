package com.kognitivist.moodie.ui.navigation

sealed class NavEvents {
	data class NavTo(val route: NavRoutes): NavEvents()
	data object GoHomeWithClearStack: NavEvents()
	data object GoBack: NavEvents()
}
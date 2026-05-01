package com.kognitivist.core.tools

import androidx.navigation3.runtime.NavKey
import androidx.savedstate.serialization.SavedStateConfiguration
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic

@Serializable
sealed interface Routes: NavKey{
	@Serializable
	data object ListFeaturesLevel1Route: Routes

	@Serializable
	data class NativeFeaturesRoute(val platform: Platform): Routes

	@Serializable
	data object NativeCalendarRoute: Routes

	@Serializable
	data object CommonFeaturesRoute: Routes

	@Serializable
	data object DataBaseRoomRoute: Routes
}



val navSavedStateConfiguration = SavedStateConfiguration {
	serializersModule = SerializersModule {
		polymorphic(NavKey::class) {
			subclass(Routes.ListFeaturesLevel1Route::class, Routes.ListFeaturesLevel1Route.serializer())
			subclass(Routes.NativeFeaturesRoute::class, Routes.NativeFeaturesRoute.serializer())
			subclass(Routes.NativeCalendarRoute::class, Routes.NativeCalendarRoute.serializer())
			subclass(Routes.CommonFeaturesRoute::class, Routes.CommonFeaturesRoute.serializer())
			subclass(Routes.DataBaseRoomRoute::class, Routes.DataBaseRoomRoute.serializer())
		}
	}
}

sealed interface NavigationActions{
	data class NavigationTo(val route: Routes): NavigationActions
}


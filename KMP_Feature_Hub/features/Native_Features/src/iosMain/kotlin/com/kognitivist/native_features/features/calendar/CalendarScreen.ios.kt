package com.kognitivist.native_features.features.calendar

import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.UIKitViewController
import platform.UIKit.UIViewController

typealias IosCalendarFactory = ((Long) -> Unit) -> UIViewController

private var iosFactory: IosCalendarFactory? = null

fun registerIosCalendarFactory(factory: IosCalendarFactory) {
	iosFactory = factory
}

@Composable
actual fun NativeCalendar(onDateSelected: (Long) -> Unit) {
	UIKitViewController(
		factory = {
			requireNotNull(iosFactory) { "Call registerIosCalendarFactory() on iOS startup" }
				.invoke(onDateSelected)
		}
	)
}
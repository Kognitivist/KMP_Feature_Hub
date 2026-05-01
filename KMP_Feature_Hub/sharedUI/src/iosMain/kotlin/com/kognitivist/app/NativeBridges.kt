package com.kognitivist.app

import com.kognitivist.native_features.features.calendar.registerIosCalendarFactory
import platform.UIKit.UIViewController

fun registerNativeCalendarFactory(factory: ((Long) -> Unit) -> UIViewController) {
    registerIosCalendarFactory(factory)
}

package com.kognitivist.core.tools

import kotlinx.serialization.Serializable

expect fun platform(): Platform

@Serializable
enum class Platform {
	IOS, ANDROID
}
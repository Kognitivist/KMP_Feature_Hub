package com.kognitivist.data.models

enum class Locale(val systemName: String) {
	EN("en"), RU("ru")
}

fun String?.getLocale(): Locale{
	return when(this){
		Locale.EN.systemName -> Locale.EN
		Locale.RU.systemName -> Locale.RU
		else -> Locale.EN
	}
}
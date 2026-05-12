package com.kognitivist.data.models

enum class Theme {
	DARK, LIGHT
}

fun String?.getTheme(): Theme{
	return when(this){
		Theme.DARK.name -> Theme.DARK
		Theme.LIGHT.name -> Theme.LIGHT
		else -> Theme.LIGHT
	}
}
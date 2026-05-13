package com.kognitivist.data.models

import androidx.compose.ui.graphics.vector.ImageVector
import com.kognitivist.data.vectors.DarkThemeSelectedIcon
import com.kognitivist.data.vectors.DarkThemeUnselectedIcon
import com.kognitivist.data.vectors.LightThemeSelectedIcon
import com.kognitivist.data.vectors.LightThemeUnselectedIcon
import com.kognitivist.data.vectors.VectorRes

enum class Theme(
	val selectedIcon: ImageVector,
	val unSelectedIcon: ImageVector,
) {
	DARK(VectorRes.DarkThemeSelectedIcon,VectorRes.DarkThemeUnselectedIcon),
	LIGHT(VectorRes.LightThemeSelectedIcon,VectorRes.LightThemeUnselectedIcon)
}

fun String?.getTheme(): Theme{
	return when(this){
		Theme.DARK.name -> Theme.DARK
		Theme.LIGHT.name -> Theme.LIGHT
		else -> Theme.LIGHT
	}
}
package com.kognitivist.moodie.di


import com.kognitivist.data.databaseModule
import com.kognitivist.moodie.ui.screens._01_Splash.SplashVM
import com.kognitivist.moodie.ui.screens._02_Home.HomeVM
import com.kognitivist.moodie.ui.screens._03_Collection.CollectionVM
import com.kognitivist.moodie.ui.screens._04_Diary.DiaryVM
import com.kognitivist.moodie.ui.screens._05_Settings.SettingsVM
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) = startKoin {
	appDeclaration()
	modules(
		viewModelModule, databaseModule
	)
}

val viewModelModule = module {
	viewModelOf(::SplashVM)
	viewModelOf(::HomeVM)
	viewModelOf(::CollectionVM)
	viewModelOf(::DiaryVM)
	viewModelOf(::SettingsVM)
}

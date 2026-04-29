package com.kognitivist.app

import com.kognitivist.list_features_level_1.ListFeaturesLevel1ViewModel
import com.kognitivist.native_features.NativeFeaturesViewModel
import com.kognitivist.native_features.features.calendar.CalendarViewModel
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(appDeclaration: KoinAppDeclaration = {}) = startKoin {
	appDeclaration()
	modules(provideViewModelModule)
}

val provideViewModelModule = module {
	viewModelOf(::ListFeaturesLevel1ViewModel)
	viewModelOf(::NativeFeaturesViewModel)
	viewModelOf(::CalendarViewModel)
}
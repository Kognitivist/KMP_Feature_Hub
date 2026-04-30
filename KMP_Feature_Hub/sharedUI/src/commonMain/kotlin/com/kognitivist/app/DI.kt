package com.kognitivist.app

import com.kognitivist.app.data.AppDatabase
import com.kognitivist.app.data.TextDao
import com.kognitivist.app.data.TextRepository
import com.kognitivist.app.data.createDatabase
import com.kognitivist.list_features_level_1.ListFeaturesLevel1ViewModel
import com.kognitivist.native_features.NativeFeaturesViewModel
import com.kognitivist.native_features.features.calendar.CalendarViewModel
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
	viewModelOf(::ListFeaturesLevel1ViewModel)
	viewModelOf(::NativeFeaturesViewModel)
	viewModelOf(::CalendarViewModel)
}

val databaseModule = module {
	single<AppDatabase> {
		createDatabase(get())
	}

	single<TextDao> {
		get<AppDatabase>().textDao()
	}

	single {
		TextRepository(get())
	}

}
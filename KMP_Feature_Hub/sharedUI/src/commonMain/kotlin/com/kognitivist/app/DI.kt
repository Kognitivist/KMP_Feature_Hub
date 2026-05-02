package com.kognitivist.app

import com.kognitivist.common_features.CommonFeaturesViewModel
import com.kognitivist.common_features.dataBaseRoom.data.AppDatabase
import com.kognitivist.common_features.dataBaseRoom.data.TextDao
import com.kognitivist.common_features.dataBaseRoom.data.TextRepository
import com.kognitivist.common_features.dataBaseRoom.data.createDatabase
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
	viewModelOf(::CommonFeaturesViewModel)
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
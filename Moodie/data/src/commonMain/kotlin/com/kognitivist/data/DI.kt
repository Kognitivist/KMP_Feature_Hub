package com.kognitivist.data

import com.kognitivist.data.local_data_source.settings.AppDatabase
import com.kognitivist.data.local_data_source.settings.SettingsDao
import com.kognitivist.data.local_data_source.settings.createDatabase
import org.koin.dsl.module

val databaseModule = module {
	single<AppDatabase> {
		createDatabase(get())
	}

	single<SettingsDao> {
		get<AppDatabase>().textDao()
	}

	single {
		Settings(get())
	}

}
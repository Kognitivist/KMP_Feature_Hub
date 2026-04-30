package com.kognitivist.app.androidApp

import android.app.Application
import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.kognitivist.app.data.AppDatabase
import com.kognitivist.app.databaseModule
import com.kognitivist.app.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

class App: Application() {

	override  fun  onCreate () {
		super .onCreate()

		initKoin {
			androidContext(this@App)
			modules(
				androidDatabaseModule(applicationContext),
				databaseModule
			)
		}

	}
}

fun androidDatabaseModule(context: Context) = module {
	single<RoomDatabase.Builder<AppDatabase>> {
		val dbFile = context.getDatabasePath("app_database.db")
		Room.databaseBuilder<AppDatabase>(
			context = context.applicationContext,
			name = dbFile.absolutePath
		)
	}
}

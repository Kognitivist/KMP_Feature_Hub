package com.kognitivist.app.androidApp

import android.app.Application
import com.kognitivist.app.initKoin
import org.koin.android.ext.koin.androidContext

class App: Application() {

	override  fun  onCreate () {
		super .onCreate()

		initKoin {
			androidContext(this@App)
		}

	}
}
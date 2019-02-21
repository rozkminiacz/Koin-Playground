package me.rozkmin.koinplayground

import android.app.Application
import org.koin.android.ext.android.startKoin
import timber.log.Timber

/**
 * Created by jaroslawmichalik on 20/02/2019
 */
class App: Application(){
    override fun onCreate() {
        startKoin(this, listOf(appModule, mainModule))

        Timber.plant(Timber.DebugTree())

        super.onCreate()
    }
}
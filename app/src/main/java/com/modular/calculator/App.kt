package com.modular.calculator

import android.app.Application
import com.modular.calculator.di.appComponent
import org.koin.android.ext.android.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        diIni()
    }

    open fun diIni() = startKoin(this, provideComponent())

    open fun provideComponent() = appComponent
}
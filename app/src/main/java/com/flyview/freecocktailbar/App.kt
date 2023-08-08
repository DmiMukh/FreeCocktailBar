package com.flyview.freecocktailbar

import android.app.Application
import android.content.Context
import com.flyview.freecocktailbar.core.ComponentFactory
import com.flyview.freecocktailbar.core.KoinProvider
import org.koin.core.Koin

class App : Application(), KoinProvider {

    override lateinit var koin: Koin
        private set

    override fun onCreate() {
        super.onCreate()
        koin = createKoin()
    }

    private fun createKoin(): Koin {
        return Koin().apply {
            //(allModules)
            declare(this@App as Application)
            declare(this@App as Context)
            declare(ComponentFactory(this))
            createEagerInstances()
        }
    }
}
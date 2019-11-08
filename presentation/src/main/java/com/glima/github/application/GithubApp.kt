package com.glima.github.application

import android.app.Application
import com.glima.github.data.di.DataModule
import com.glima.github.di.ApplicationModule
import com.glima.github.di.PresentationModule
import com.glima.github.domain.di.DomainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class GithubApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@GithubApp)
            this.modules(
                listOf(
                    ApplicationModule.module,
                    PresentationModule.module,
                    DataModule.module,
                    DomainModule.module
                    )
            )
        }
    }
}
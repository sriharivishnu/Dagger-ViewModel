package com.magnitudestudios.playground.di

import com.magnitudestudios.playground.di.auth.AuthViewModelsModule
import com.magnitudestudios.playground.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {
    @ContributesAndroidInjector(
        modules = [AuthViewModelsModule::class]
    )
    abstract fun contributeAuthActivity() : AuthActivity

}
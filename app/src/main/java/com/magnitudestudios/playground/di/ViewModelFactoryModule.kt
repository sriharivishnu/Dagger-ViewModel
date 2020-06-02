package com.magnitudestudios.playground.di

import androidx.lifecycle.ViewModelProvider
import com.magnitudestudios.playground.viewmodels.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(modelProviderFactory: ViewModelProviderFactory) : ViewModelProvider.Factory;
}
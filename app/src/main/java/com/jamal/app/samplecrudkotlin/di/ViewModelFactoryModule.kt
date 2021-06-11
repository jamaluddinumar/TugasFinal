package com.jamal.app.samplecrudkotlin.di

import androidx.lifecycle.ViewModelProvider
import com.rahmat.app.samplecrudkotlin.vmfactory.StudentViewModelFactory

abstract class ViewModelFactoryModule {


    internal abstract fun bindViewModelFactory(vMFactory : StudentViewModelFactory) : ViewModelProvider.Factory
}
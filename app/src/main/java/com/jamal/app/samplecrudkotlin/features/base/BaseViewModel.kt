package com.jamal.app.samplecrudkotlin.features.base

import androidx.lifecycle.ViewModel


abstract class BaseViewModel : ViewModel() {

    override fun onCleared() {
        super.onCleared()
    }

}
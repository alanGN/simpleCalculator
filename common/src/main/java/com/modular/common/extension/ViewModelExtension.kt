package com.modular.common.extension

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun <T : Any, Livedata : LiveData<T>> LifecycleOwner.observe2(liveData: Livedata, observer: Observer<T>) {
    liveData.observe(this, observer)
}

fun <T : Any, Livedata : LiveData<T?>> LifecycleOwner.observe(liveData: Livedata, body: (T?) -> Unit) : Observer<T?> {
    val observer = Observer(body)
    liveData.observe(this, observer)
    return observer
}
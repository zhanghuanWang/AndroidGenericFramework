package com.tanjiajun.androidgenericframework.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

/**
 * Created by TanJiaJun on 2019-08-02.
 */
abstract class BaseViewModel : ViewModel() {

    val title = MutableLiveData<String>()

    protected fun launch(block: suspend () -> Unit,
                         error: suspend (Throwable) -> Unit) =
            viewModelScope.launch {
                try {
                    block()
                } catch (throwable: Throwable) {
                    error(throwable)
                }
            }

}
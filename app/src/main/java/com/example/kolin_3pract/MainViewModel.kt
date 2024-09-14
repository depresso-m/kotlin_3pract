package com.example.kolin_3pract

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _button1Pressed = MutableLiveData<Boolean>()
    val button1Pressed = _button1Pressed

    private val _button2Pressed = MutableLiveData<Boolean>()
    val button2Pressed = _button2Pressed

    fun onButton1Pressed() {
        _button1Pressed.value = true
    }

    fun onButton2Pressed() {
        _button2Pressed.value = true
    }
}
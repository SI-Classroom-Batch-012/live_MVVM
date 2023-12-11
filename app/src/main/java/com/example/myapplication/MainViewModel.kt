package com.example.myapplication

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){


    //Variablen werden nicht von aussen verändert
    private var _counter = 0
    val counter: Int
        get() = _counter


    //Funktionen werden von aussen aufgerufen
    fun increaseCounter(){
        _counter++
        Log.d("counterLog", "$counter")
    }

}
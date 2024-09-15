package com.example.hellokotlin.apps.databindingApp

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

class Vehicle: BaseObservable() {

    var modelYear: String = ""

    /***
     * For implementing @Bindable need to add the below code in app level build.gradle.kts
     * plugins {
     *     id("kotlin-kapt")
     * }
     **/
    @Bindable
    var name: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }
}
package com.example.demoproject

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DemoProject: Application(){

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this);
    }
}
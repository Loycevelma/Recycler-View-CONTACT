package com.example.conctact

import android.app.Application
import android.content.Context

class ContactApp:Application() {
    companion object{
        lateinit var context: Context

    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}
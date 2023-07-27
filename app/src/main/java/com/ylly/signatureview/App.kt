package com.ylly.signatureview

import android.app.Application
import android.content.Context
import android.content.ContextWrapper

/**
 * @Author : Yo-yo
 * @Description :
 */
lateinit var INSTANCE: Application

class App : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        INSTANCE = this
        super.onCreate()
    }

}

object AppContext : ContextWrapper(INSTANCE)
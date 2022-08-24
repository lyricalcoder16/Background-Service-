package com.charles.backgroundservoce

import android.app.Service
import android.content.Intent
import android.content.res.Configuration
import android.os.IBinder
import android.widget.Toast

class MyService : Service() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
        Toast.makeText(applicationContext, "Uploading", Toast.LENGTH_SHORT).show()
        return START_STICKY
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        val intentResatart =  Intent(applicationContext,this.javaClass)
        intentResatart.setPackage("com.charles.backgroundservoce")
        startService(intentResatart)
        super.onTaskRemoved(rootIntent)
    }
}

package com.charles.backgroundservoce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonStart: Button = findViewById(R.id.buttonStart)
        val buttonStop : Button = findViewById(R.id.buttonStop)

        buttonStart.setOnClickListener{
            val intentStart = Intent(this,MyService::class.java)
            startService(intentStart)

        }
        buttonStop.setOnClickListener{
            val intentStart = Intent(this,MyService::class.java)
            stopService(intentStart)
        }

    }

}
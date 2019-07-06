package com.example.yazuyazuya.mykotlinsameactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sendButton = findViewById<Button>(R.id.button1)
        var returnButton = findViewById<Button>(R.id.button2)

        setScreenMain()

        /*
        returnButton.setOnClickListener {
            setContentView(R.layout.activity_sub)
        }

        sendButton.setOnClickListener {
            setContentView(R.layout.activity_main)
        }
        */

    }

    fun setScreenMain() {
        setContentView(R.layout.activity_main)
        var sendButton = findViewById<Button>(R.id.button1)

        sendButton.setOnClickListener{
            setScreenSub()
        }
    }

    fun setScreenSub() {
        setContentView(R.layout.activity_sub)
        var returnButton = findViewById<Button>(R.id.button2)

        returnButton.setOnClickListener{
            setScreenMain()
        }
    }

}

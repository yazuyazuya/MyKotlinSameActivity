package com.example.yazuyazuya.mykotlinsameactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    val sendButton = findViewById<Button>(R.id.button1)
    val returnButton = findViewById<Button>(R.id.button2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setScreenMain()

        returnButton.setOnClickListener {
            setContentView(R.layout.activity_sub)
        }

        sendButton.setOnClickListener {
            setContentView(R.layout.activity_main)
        }

    }

    /*
    fun setScreenMain() {
        setContentView(R.layout.activity_main)

        sendButton.setOnClickListener{
            setScreenSub()
        }
    }

    fun setScreenSub() {
        setContentView(R.layout.activity_sub)

        returnButton.setOnClickListener{
            setScreenMain()
        }
    }
    */

}

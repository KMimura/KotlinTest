package com.example.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val EXTRA_MESSAGE: String = "com.example.kotlintest.MESSAGE"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val intent: Intent = getIntent()
        val message: String = intent.getStringExtra(MainActivity().EXTRA_MESSAGE)
        val textView: TextView = findViewById(R.id.nextText)
        textView.setText(message)
    }
}

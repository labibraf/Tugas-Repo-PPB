package com.example.modul2
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val messageTextView = findViewById<TextView>(R.id.textView)

        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        messageTextView.text = message
    }
}
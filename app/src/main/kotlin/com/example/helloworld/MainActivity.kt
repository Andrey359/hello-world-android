package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    
    private var clickCount = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val textView: TextView = findViewById(R.id.textViewHello)
        val button: Button = findViewById(R.id.buttonClick)
        val counterText: TextView = findViewById(R.id.textViewCounter)
        
        button.setOnClickListener {
            clickCount++
            counterText.text = getString(R.string.click_count, clickCount)
            
            // Изменяем текст приветствия при нажатии
            when (clickCount % 3) {
                0 -> textView.text = getString(R.string.hello_world)
                1 -> textView.text = getString(R.string.hello_android)
                2 -> textView.text = getString(R.string.hello_kotlin)
            }
        }
    }
}
package com.sideproject.go_up_wall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val marqueeButton = findViewById<AppCompatButton>(R.id.marquee_button)
        marqueeButton.isSelected = true
    }
}
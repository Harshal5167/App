package com.example.travel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var button : Button = findViewById(R.id.next)
        button.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@MainActivity3, MainActivity4::class.java)
            startActivity(intent)
            finish()
        })
    }
}
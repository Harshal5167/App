package com.example.travel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button : Button = findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            Toast.makeText( this,"You're Welcome", LENGTH_SHORT).show()
            val intent= Intent(this@MainActivity, MainActivity3::class.java)
            startActivity(intent)
            finish()
        })
    }

}
package com.example.travel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var button1 = findViewById<Button>(R.id.next)
        button1.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@MainActivity4, MainActivity5::class.java)
            startActivity(intent)
            finish()
        })

        var button2 = findViewById<Button>(R.id.next1)
        button2.setOnClickListener(View.OnClickListener {

            val intent= Intent(this@MainActivity4, MainActivity3::class.java)
            startActivity(intent)
            finish()
        })
    }
}
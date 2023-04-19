package com.example.travel

import android.content.Intent
import android.icu.text.MessagePattern.ApostropheMode
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val har = findViewById<EditText>(R.id.har)
        har.text = null
        har.setOnClickListener{
            har.text = null
        }
        button.setOnClickListener{
            val ds :String = har.text.toString()
            if(ds.isEmpty()){
                Toast.makeText(this,"Enter your Roll No.", LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this@MainActivity,MainActivity3::class.java)
                startActivity(intent)
            }
        }
    }

}
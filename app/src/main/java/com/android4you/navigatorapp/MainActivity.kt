package com.android4you.navigatorapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b = findViewById<Button>(R.id.button)
        b.setOnClickListener {
//            Intent(this, Feature1Activity::class.java).apply {
//                startActivity(this)
//            }
        }
    }
}

package com.lidem.cfa.cvkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val titleTextView: TextView = findViewById(R.id.detailedTitle)
        val imageView: ImageView = findViewById(R.id.detailedImage)

//        val intent = intent

        val title = intent.getStringExtra("title")
        val image = intent.getIntExtra("image",0)

        titleTextView.text = title
        imageView.setImageResource(image)
    }
}
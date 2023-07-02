package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.hdodenhof.circleimageview.CircleImageView

class IOT : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iot)

        supportActionBar?.hide()

        val cBtn = findViewById<CircleImageView>(R.id.c)
        val javaBtn = findViewById<CircleImageView>(R.id.java)
        val pythonBtn = findViewById<CircleImageView>(R.id.python)
        val juliaBtn = findViewById<CircleImageView>(R.id.julia)

        cBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/cpp/")
            startActivity(intent)
        }

        javaBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/java-tutorial")
            startActivity(intent)
        }

        pythonBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/python/")
            startActivity(intent)
        }

        juliaBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://julialang.org/learning/")
            startActivity(intent)
        }
    }
}
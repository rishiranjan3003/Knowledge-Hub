package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.hdodenhof.circleimageview.CircleImageView

class MachineLearning : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_machine_learning)

        supportActionBar?.hide()

        val pythonBtn = findViewById<CircleImageView>(R.id.python)
        val javaBtn = findViewById<CircleImageView>(R.id.java)
        val juliaBtn = findViewById<CircleImageView>(R.id.julia)
        val scalaBtn = findViewById<CircleImageView>(R.id.scala)

        pythonBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/python/")
            startActivity(intent)
        }

        javaBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/java-tutorial")
            startActivity(intent)
        }

        juliaBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://julialang.org/learning/")
            startActivity(intent)
        }

        scalaBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.tutorialspoint.com/scala/index.htm")
            startActivity(intent)
        }
    }
}
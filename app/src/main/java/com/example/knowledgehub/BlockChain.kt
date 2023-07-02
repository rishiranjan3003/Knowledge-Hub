package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.hdodenhof.circleimageview.CircleImageView

class BlockChain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_block_chain)

        supportActionBar?.hide()

        val cBtn = findViewById<CircleImageView>(R.id.c)
        val javaBtn = findViewById<CircleImageView>(R.id.java)
        val pythonBtn = findViewById<CircleImageView>(R.id.python)
        val javascriptBtn = findViewById<CircleImageView>(R.id.javascript)

        cBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/cpp/")
            startActivity(intent)
        }

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

        javascriptBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/js/")
            startActivity(intent)
        }

    }
}
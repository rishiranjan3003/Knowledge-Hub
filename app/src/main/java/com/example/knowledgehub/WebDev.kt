package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.hdodenhof.circleimageview.CircleImageView

class WebDev : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_dev)

        supportActionBar?.hide()

        val htmlBtn = findViewById<CircleImageView>(R.id.html)
        val cssBtn = findViewById<CircleImageView>(R.id.css)
        val javascriptBtn = findViewById<CircleImageView>(R.id.javascript)
        val phpBtn = findViewById<CircleImageView>(R.id.php)

        htmlBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/html/")
            startActivity(intent)
        }

        cssBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/css/")
            startActivity(intent)
        }

        javascriptBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/js/")
            startActivity(intent)
        }

        phpBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/php/")
            startActivity(intent)
        }
    }
}
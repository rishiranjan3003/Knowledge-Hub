package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.hdodenhof.circleimageview.CircleImageView

class AndroidApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_app)

        supportActionBar?.hide()

        val kotlinBtn = findViewById<CircleImageView>(R.id.kotlin)
        val javaBtn = findViewById<CircleImageView>(R.id.java)
        val reactBtn = findViewById<CircleImageView>(R.id.react)
        val flutterBtn = findViewById<CircleImageView>(R.id.flutter)

        kotlinBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://developer.android.com/courses/android-basics-kotlin/course?gclid=CjwKCAjwyeujBhA5EiwA5WD7_SWIZZ_dFti0FzXpUAFtfcUWve2wCsvwPZaIUAoYue0S_S2op0gktRoCpKkQAvD_BwE&gclsrc=aw.ds")
            startActivity(intent)
        }

        javaBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/java-tutorial")
            startActivity(intent)
        }

        reactBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.w3schools.com/REACT/DEFAULT.ASP")
            startActivity(intent)
        }

        flutterBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://flutter.dev/learn")
            startActivity(intent)
        }
    }
}
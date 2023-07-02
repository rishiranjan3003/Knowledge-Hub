package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import de.hdodenhof.circleimageview.CircleImageView

class IOSApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iosapp)

        supportActionBar?.hide()

        val swiftBtn = findViewById<CircleImageView>(R.id.swift)
        val objectivecBtn = findViewById<CircleImageView>(R.id.objective)
        val reactBtn = findViewById<CircleImageView>(R.id.react)
        val flutterBtn = findViewById<CircleImageView>(R.id.flutter)

        swiftBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://docs.swift.org/swift-book/documentation/the-swift-programming-language/guidedtour/")
            startActivity(intent)
        }

        objectivecBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.tutorialspoint.com/objective_c/index.htm")
            startActivity(intent)
        }

        reactBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.tutorialspoint.com/react_native/index.htm")
            startActivity(intent)
        }

        flutterBtn.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://flutter.dev/learn")
            startActivity(intent)
        }
    }
}
package com.example.knowledgehub

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class AllCourseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_course)

        val callUs = findViewById<Button>(R.id.btnClick)
        val androidBtn = findViewById<CardView>(R.id.androidApp)
        val webBtn = findViewById<CardView>(R.id.webDev)
        val iosBtn = findViewById<CardView>(R.id.iosApp)
        val mlBtn = findViewById<CardView>(R.id.ml)
        val blockChainBtn = findViewById<CardView>(R.id.blockChain)
        val iotBtn = findViewById<CardView>(R.id.iotTech)

        androidBtn.setOnClickListener {
            intent = Intent(applicationContext, AndroidApp::class.java)
            startActivity(intent)
        }

        webBtn.setOnClickListener {
            intent = Intent(applicationContext, WebDev::class.java)
            startActivity(intent)
        }

        iosBtn.setOnClickListener {
            intent = Intent(applicationContext, IOSApp::class.java)
            startActivity(intent)
        }

        mlBtn.setOnClickListener {
            intent = Intent(applicationContext, MachineLearning::class.java)
            startActivity(intent)
        }

        blockChainBtn.setOnClickListener {
            intent = Intent(applicationContext, BlockChain::class.java)
            startActivity(intent)
        }

        iotBtn.setOnClickListener {
            intent = Intent(applicationContext, IOT::class.java)
            startActivity(intent)
        }

        callUs.setOnClickListener {
//            val callIntent: Intent = Uri.parse("tel:8318782666").let { number ->
//                Intent(Intent.ACTION_DIAL, number)
//            }
//            startActivity(callIntent)
//            2nd method

            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:8318782666")
            startActivity(intent)
        }
    }
}
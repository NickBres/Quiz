package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val correctAns = intent.getIntExtra("result",0)
        val totalQuestions = intent.getIntExtra("total",0)

        val resultText = findViewById<TextView>(R.id.tv_score)
        resultText.text = "$correctAns/$totalQuestions"

        var intent = Intent(this, MainActivity::class.java)
        val restart_btn = findViewById<TextView>(R.id.btn_finish)
        restart_btn.setOnClickListener{
            startActivity(intent)
            finish()
        }
    }
}
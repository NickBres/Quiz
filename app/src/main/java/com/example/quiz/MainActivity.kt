package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Sms.Intents
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn: Button = findViewById<Button>(R.id.start_btn)
        val nameEditText: TextInputEditText = findViewById<TextInputEditText>(R.id.editText)
        startBtn.setOnClickListener{
            if(nameEditText.text?.isEmpty() == true){
                Toast.makeText(this,"Enter Name",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java) // Intent is used to navigate from one activity to another
                startActivity(intent) // startActivity is used to start the activity (not close the current activity)
                finish() // finish() is used to close the current activity
            }
        }
    }
}

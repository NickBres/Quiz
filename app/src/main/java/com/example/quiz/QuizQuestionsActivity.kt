package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import kotlin.properties.Delegates

class QuizQuestionsActivity : AppCompatActivity() {

    val questionsList = Constants.getQuestion()
    val questionsAmount = questionsList.size
    var currQuestion = 0
    var selectedAns  = -1
    var correctAns = -1
    var countCorrect = 0
    var flagSubmitted = false

    var firstAns: TextView? = null
    var secondAns: TextView? = null
    var thirdAns: TextView? = null
    var fourthAns: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        firstAns = findViewById<TextView>(R.id.tv_option_one)
        secondAns = findViewById<TextView>(R.id.tv_option_two)
        thirdAns = findViewById<TextView>(R.id.tv_option_three)
        fourthAns = findViewById<TextView>(R.id.tv_option_four)

        setProgress()
        setQuestion()

        firstAns?.setOnClickListener{
            if(!flagSubmitted) {
                selectedAns = 0
                firstAns?.background = getDrawable(R.drawable.button_back2)
                secondAns?.background = getDrawable(R.drawable.button_back)
                thirdAns?.background = getDrawable(R.drawable.button_back)
                fourthAns?.background = getDrawable(R.drawable.button_back)
            }
        }
        secondAns?.setOnClickListener{
            if(!flagSubmitted) {
                selectedAns = 1
                firstAns?.background = getDrawable(R.drawable.button_back)
                secondAns?.background = getDrawable(R.drawable.button_back2)
                thirdAns?.background = getDrawable(R.drawable.button_back)
                fourthAns?.background = getDrawable(R.drawable.button_back)
            }
        }
        thirdAns?.setOnClickListener{
            if(!flagSubmitted) {
                selectedAns = 2
                firstAns?.background = getDrawable(R.drawable.button_back)
                secondAns?.background = getDrawable(R.drawable.button_back)
                thirdAns?.background = getDrawable(R.drawable.button_back2)
                fourthAns?.background = getDrawable(R.drawable.button_back)
            }
        }
        fourthAns?.setOnClickListener{
            if(!flagSubmitted) {
                selectedAns = 3
                firstAns?.background = getDrawable(R.drawable.button_back)
                secondAns?.background = getDrawable(R.drawable.button_back)
                thirdAns?.background = getDrawable(R.drawable.button_back)
                fourthAns?.background = getDrawable(R.drawable.button_back2)
            }

        }

        val submitBtn = findViewById<TextView>(R.id.btn_submit)
        submitBtn.setOnClickListener{
            if(selectedAns == -1){
                Toast.makeText(this,"Select an answer",Toast.LENGTH_SHORT).show()

            }else {
                when(flagSubmitted){
                    false -> {
                        flagSubmitted = true
                        submitBtn.text = "Next Question"
                        if (selectedAns == correctAns ) {
                            countCorrect++
                            when (selectedAns) {
                                0 -> firstAns?.background = getDrawable(R.drawable.button_back_correct)
                                1 -> secondAns?.background = getDrawable(R.drawable.button_back_correct)
                                2 -> thirdAns?.background = getDrawable(R.drawable.button_back_correct)
                                3 -> fourthAns?.background = getDrawable(R.drawable.button_back_correct)
                            }
                        }else{
                            when (selectedAns) {
                                0 -> firstAns?.background = getDrawable(R.drawable.button_back_incorrect)
                                1 -> secondAns?.background = getDrawable(R.drawable.button_back_incorrect)
                                2 -> thirdAns?.background = getDrawable(R.drawable.button_back_incorrect)
                                3 -> fourthAns?.background = getDrawable(R.drawable.button_back_incorrect)
                            }
                            when (correctAns) {
                                0 -> firstAns?.background = getDrawable(R.drawable.button_back_correct)
                                1 -> secondAns?.background = getDrawable(R.drawable.button_back_correct)
                                2 -> thirdAns?.background = getDrawable(R.drawable.button_back_correct)
                                3 -> fourthAns?.background = getDrawable(R.drawable.button_back_correct)
                            }

                        }
                    }
                    true -> {
                        flagSubmitted = false
                        submitBtn.text = "Submit"
                        if(++currQuestion >= questionsAmount){
                            var intent = Intent(this,ResultActivity::class.java)
                            intent.putExtra("result",countCorrect)
                                  .putExtra("total",questionsAmount)
                            startActivity(intent)
                            finish()
                        }else {
                            setProgress()
                            setQuestion()
                            firstAns?.background = getDrawable(R.drawable.button_back)
                            secondAns?.background = getDrawable(R.drawable.button_back)
                            thirdAns?.background = getDrawable(R.drawable.button_back)
                            fourthAns?.background = getDrawable(R.drawable.button_back)
                            selectedAns = -1
                        }
                    }
                }

            }
        }

    }


    fun setProgress(){
        val progressText = findViewById<TextView>(R.id.tv_progress)
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressText.text = "$currQuestion/$questionsAmount"
        progressBar.max = questionsAmount
        progressBar.progress = currQuestion
    }

    fun setQuestion(){
        val question = questionsList[currQuestion]
        val questionText = findViewById<TextView>(R.id.tv_question)
        questionText.text = question.text
        val questionImage = findViewById<ImageView>(R.id.iv_image)
        if(question.image != 0){
            questionImage.setImageResource(question.image)
            questionImage.visibility = ImageView.VISIBLE
        }else{
            questionImage.visibility = ImageView.GONE
        }

        firstAns?.text = question.firstAns
        secondAns?.text = question.secondAns
        thirdAns?.text = question.thirdAns
        fourthAns?.text = question.fourthAns
        correctAns = question.correctAns
    }
}
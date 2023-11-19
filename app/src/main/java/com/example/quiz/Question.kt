package com.example.quiz

data class Question(
    val id: Int,
    val text: String,
    val image: Int, // Image is an integer because we will be storing the image in the drawable folder and the drawable folder stores images as integers
    val firstAns: String,
    val secondAns: String,
    val thirdAns: String,
    val fourthAns: String,
    val correctAns: Int // 0,1,2,3
)

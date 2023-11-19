package com.example.quiz

object Constants {

    var CORRECT_ANS: Int = 0
    var QUESTIONS: Int = 0

    fun getQuestion(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        // Question 1
        val question1 = Question(
            id = 1,
            text = "What is the capital of France?",
            image = R.drawable.paris_image, // Replace with the actual image resource ID
            firstAns = "Berlin",
            secondAns = "Madrid",
            thirdAns = "Rome",
            fourthAns = "Paris",
            correctAns = 3 // Correct answer is Paris (fourthAns)
        )
        questionsList.add(question1)

        // Question 2
        val question2 = Question(
            id = 2,
            text = "Which planet is known as the Red Planet?",
            image = R.drawable.mars_image, // Replace with the actual image resource ID
            firstAns = "Earth",
            secondAns = "Mars",
            thirdAns = "Venus",
            fourthAns = "Jupiter",
            correctAns = 1 // Correct answer is Mars (secondAns)
        )
        questionsList.add(question2)

        // Question 3
        val question3 = Question(
            id = 3,
            text = "What is the largest mammal on Earth?",
            image = R.drawable.blue_whale_image, // Replace with the actual image resource ID
            firstAns = "Elephant",
            secondAns = "Giraffe",
            thirdAns = "Lion",
            fourthAns = "Blue Whale",
            correctAns = 3 // Correct answer is Blue Whale (fourthAns)
        )
        questionsList.add(question3)

        // Question 4
        val question4 = Question(
            id = 4,
            text = "Which gas do plants absorb from the atmosphere?",
            image = 0, // No image for this question
            firstAns = "Oxygen",
            secondAns = "Carbon Dioxide",
            thirdAns = "Nitrogen",
            fourthAns = "Hydrogen",
            correctAns = 1 // Correct answer is Carbon Dioxide (secondAns)
        )
        questionsList.add(question4)

        // Question 5
        val question5 = Question(
            id = 5,
            text = "Who wrote the play 'Romeo and Juliet'?",
            image = 0, // No image for this question
            firstAns = "Charles Dickens",
            secondAns = "William Shakespeare",
            thirdAns = "Jane Austen",
            fourthAns = "Mark Twain",
            correctAns = 1 // Correct answer is William Shakespeare (secondAns)
        )
        questionsList.add(question5)

        // Question 6
        val question6 = Question(
            id = 6,
            text = "Which gas makes up the majority of Earth's atmosphere?",
            image = 0, // No image for this question
            firstAns = "Oxygen",
            secondAns = "Carbon Dioxide",
            thirdAns = "Nitrogen",
            fourthAns = "Hydrogen",
            correctAns = 2 // Correct answer is Nitrogen (thirdAns)
        )
        questionsList.add(question6)

        // Question 7
        val question7 = Question(
            id = 7,
            text = "What is the chemical symbol for gold?",
            image = 0, // No image for this question
            firstAns = "Au",
            secondAns = "Ag",
            thirdAns = "Fe",
            fourthAns = "Hg",
            correctAns = 0 // Correct answer is Au (firstAns)
        )
        questionsList.add(question7)

        // Question 8
        val question8 = Question(
            id = 8,
            text = "Who painted the Mona Lisa?",
            image = 0, // No image for this question
            firstAns = "Vincent van Gogh",
            secondAns = "Pablo Picasso",
            thirdAns = "Leonardo da Vinci",
            fourthAns = "Rembrandt",
            correctAns = 2 // Correct answer is Leonardo da Vinci (thirdAns)
        )
        questionsList.add(question8)

        // Question 9
        val question9 = Question(
            id = 9,
            text = "What is the largest planet in our solar system?",
            image = R.drawable.mars_image, // Replace with the actual image resource ID
            firstAns = "Earth",
            secondAns = "Mars",
            thirdAns = "Venus",
            fourthAns = "Jupiter",
            correctAns = 3 // Correct answer is Jupiter (fourthAns)
        )
        questionsList.add(question9)

        // Question 10
        val question10 = Question(
            id = 10,
            text = "How many continents are there on Earth?",
            image = 0, // No image for this question
            firstAns = "5",
            secondAns = "6",
            thirdAns = "7",
            fourthAns = "8",
            correctAns = 1 // Correct answer is 6 (secondAns)
        )

        questionsList.add(question10)

        return  questionsList
    }
}
package com.example.appsem04_1_geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var questions: ArrayList<Question>
    var position = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadQuestions()
        setupViews()
    }

    private fun loadQuestions() {
        questions = ArrayList()
        var question = Question("¿Es Lima capital de Peru?", true)
        questions.add(question)
        questions.add(Question("¿Es Lima capital de Chile?", false))
        questions.add(Question("¿Es Tokio capital de China?", false))
        questions.add(Question("¿Peru ira al Mundial?", true))

    }

    private fun setupViews() {
        val btYes = findViewById<Button>(R.id.btYes)
        val btNo = findViewById<Button>(R.id.btNo)
        val btNext = findViewById<Button>(R.id.btNext)
        val tvQuestion = findViewById<TextView>(R.id.tvQuestion)
        btYes.setOnClickListener {
            if (questions[position].answer == true)
                Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "Incorrecto", Toast.LENGTH_LONG).show()
        }
        btNo.setOnClickListener {
            if (questions[position].answer == false)
                Toast.makeText(this, "Correcto", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this, "Incorrecto", Toast.LENGTH_LONG).show()
        }
        tvQuestion.text = questions[position].sentence
        btNext.setOnClickListener{
            position++
            tvQuestion.text = questions[position].sentence
        }
    }
}
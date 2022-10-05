package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_view)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvResult: TextView = findViewById(R.id.tv_result)
        val finishBtn: Button = findViewById(R.id.finish_btn)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)

        tvResult.text = "Your score is $correctAnswer out of $totalQuestions"

        finishBtn.setOnClickListener{

            startActivity(Intent(this,MainActivity::class.java))


        }

    }
}
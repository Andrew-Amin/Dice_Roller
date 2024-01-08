package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var rollBtn: Button
    lateinit var resultImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        rollBtn.setOnClickListener {
            rollDice()
        }

    }

    private fun initViews() {
        rollBtn = findViewById(R.id.roll_btn)
        resultImage = findViewById(R.id.dice_iv)
    }

    private fun rollDice() {
        var randomNumber = Random.nextInt(6) + 1
        val drawableResource = when (randomNumber) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultImage.setImageResource(drawableResource)
    }
}
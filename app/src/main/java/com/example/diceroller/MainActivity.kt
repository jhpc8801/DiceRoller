package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
//import android.widget.TextView
//import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var diceImage : ImageView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)

        val btnRoll : Button = findViewById(R.id.btnRoll)
        //val tvResult : TextView = findViewById(R.id.tvNumber)

        btnRoll.setOnClickListener() {
            //Toast.makeText(applicationContext, "Hello", Toast.LENGTH_LONG).show()

            rollDice()
            //val no : Int = (1..6).random()
            //tvResult.text = no.toString()
        }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()

        val diceImage : ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}
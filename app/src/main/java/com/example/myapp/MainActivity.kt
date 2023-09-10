package com.example.myapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rollButton.setOnClickListener{
        rollDice()
        }

    }

    private fun rollDice() {
        val rand = (1..6).random()

        val randomSide = when(rand){
            1 ->  R.drawable.dice_1
            2 ->  R.drawable.dice_2
            3 ->  R.drawable.dice_3
            4 ->  R.drawable.dice_4
            5 ->  R.drawable.dice_5
            else ->  R.drawable.dice_6
        }
        binding.dicePic.setImageResource(randomSide)
    }
}
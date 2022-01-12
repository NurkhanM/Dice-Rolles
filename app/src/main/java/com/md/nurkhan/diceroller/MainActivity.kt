package com.md.nurkhan.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.md.nurkhan.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnRandom.setOnClickListener {
                val randomInt = (1..6).random()
                val drawableResource = when (randomInt) {
                    1 -> R.drawable.one
                    2 -> R.drawable.two
                    3 -> R.drawable.three
                    4 -> R.drawable.four
                    5 -> R.drawable.five
                    else -> R.drawable.six
                }
                binding.imgDice.setImageResource(drawableResource)
                binding.txtDiceNumber.text = randomInt.toString();
            }
        }
    }
}
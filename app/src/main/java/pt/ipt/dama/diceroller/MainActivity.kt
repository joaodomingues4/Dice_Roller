package pt.ipt.dama.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    // define a 'pointer' to the ImageView
    lateinit var auxDiceImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // find the button
        val auxRollTheDiceButton =findViewById<Button>(R.id.rollTheDiceButton)
        auxRollTheDiceButton.setOnClickListener {
            rollTheDice()
        }

        // initialize the auxImageView variable
        auxDiceImage = findViewById(R.id.diceImageView)
    }

    /**
     * roll the dice
     * ie, add a random value to the textview
     */
    private fun rollTheDice() {
        // get the random value
        val randomValue = Random().nextInt(6)+1 // it will get values from 1 to 6
        // assign the random value to the TextView
        val auxDiceNumberTextView=findViewById<TextView>(R.id.diceNumberTextView)
        auxDiceNumberTextView.text = randomValue.toString()

        // define the image to be used
        val drawableImage = when(randomValue) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        // assign the image to the ImageView
        auxDiceImage.setImageResource(drawableImage)

        }
    }
}
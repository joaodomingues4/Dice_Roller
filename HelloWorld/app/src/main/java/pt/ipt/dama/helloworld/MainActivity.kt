package pt.ipt.dama.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MY TAG","MainActivity: OnCreate" )
            val greetingTextView = findViewById<TextView>(R.id.tvHello)
            val inputField = findViewById<EditText>(R.id.etName)
            val submitButton = findViewById<Button>(R.id.buttonSubmit)
            val offersButton = findViewById<Button>(R.id.buttonOffers)
            var enteredName = ""
            submitButton.setOnClickListener {
                enteredName = inputField.text.toString()

                if (enteredName == ""){
                    offersButton.visibility = INVISIBLE
                    greetingTextView.text = ""
                    Toast.makeText(
                        this@MainActivity,
                        "Please, enter your name!",
                        Toast.LENGTH_LONG
                    ).show()

                }else {
                    val message = "Welcome $enteredName"
                    greetingTextView.text = message
                    inputField.text.clear()
                    offersButton.visibility = VISIBLE
                }
            }

        offersButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("USER", enteredName)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("MY TAG","MainActivity: OnStart" )
    }

    override fun onResume() {
        super.onResume()
        Log.i("MY TAG","MainActivity: OnResume" )
    }

    override fun onPause() {
        super.onPause()
        Log.i("MY TAG","MainActivity: OnPause" )
    }

    override fun onStop() {
        super.onStop()
        Log.i("MY TAG","MainActivity: OnStop" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MY TAG","MainActivity: OnDestroy" )
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MY TAG","MainActivity: OnRestart" )
    }
}
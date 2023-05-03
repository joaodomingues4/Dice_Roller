package pt.ipt.dama.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.i("MY TAG","SecondActivity: OnCreate" )
        val userName = intent.getStringExtra("USER")
        val textView = findViewById<TextView>(R.id.tvOffer)
        val message = "$userName, you will get free access to all the content for one month"
        textView.text = message

    }

    override fun onStart() {
        super.onStart()
        Log.i("MY TAG","SecondActivity: OnStart" )
    }

    override fun onResume() {
        super.onResume()
        Log.i("MY TAG","SecondActivity: OnResume" )
    }

    override fun onPause() {
        super.onPause()
        Log.i("MY TAG","SecondActivity: OnPause" )
    }

    override fun onStop() {
        super.onStop()
        Log.i("MY TAG","SecondActivity: OnStop" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MY TAG","SecondActivity: OnDestroy" )
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("MY TAG","SecondActivity: OnRestart" )
    }
}

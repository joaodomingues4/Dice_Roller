package pt.ipt.dama.oopdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val d = Driver("Tom", 37)
        //d.showDetails()

        val myCar = MyCar()
        myCar.maxSpeed = 890
        myCar.start()
    }
}
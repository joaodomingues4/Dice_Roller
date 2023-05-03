package pt.ipt.dama.oopdemo

import android.util.Log

class MyCar : Car(), SpeedController {
    override fun start() {
        Log.i("MyTag", "this is MyCar starting... Brand id is ${getBrandId()}")
    }

    override fun accelerate() {
    }

    override fun decelerate() {
    }
}
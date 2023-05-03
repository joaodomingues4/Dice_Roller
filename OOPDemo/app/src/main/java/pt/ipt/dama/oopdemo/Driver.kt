package pt.ipt.dama.oopdemo

import android.util.Log

class Driver(var name : String, credit : Int) {
    private var totalCredit = 50
    private val car = Car()


    init {
        totalCredit += credit
        car.maxSpeed = 150
        car.start()
    }

    fun showDetails() {
        Log.i("MyTag", "name of the driver is $name with $totalCredit")

    }
}
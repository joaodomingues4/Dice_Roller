package pt.ipt.dama.oopdemo

interface SpeedController {
    fun accelerate()
    fun decelerate()
    fun getBrandId():String{
        return "ADS2452"
    }
}
package com.example.lesson_15

class ConvertUtils {

    companion object {
        fun convertParrotMeter(parrot: Float): Float = (parrot / 7.6).toFloat()
        fun convertMeterParrot(meter: Float): Float = (meter * 7.6.toFloat())
    }
}
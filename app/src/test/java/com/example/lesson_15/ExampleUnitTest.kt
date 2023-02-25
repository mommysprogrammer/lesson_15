package com.example.lesson_15

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun convertParrotMeterIsCorrect() {
        assertEquals(1f, ConvertUtils.convertParrotMeter(7.6f))
    }

    @Test
    fun convertMeterParrotIsCorrect() {
        assertEquals(7.6f, ConvertUtils.convertMeterParrot(1f))
    }
}
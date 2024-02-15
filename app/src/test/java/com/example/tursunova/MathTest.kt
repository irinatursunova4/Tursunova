package com.example.tursunova

import org.junit.Assert
import org.junit.Test

class MathTest {
    @Test
    fun addTest() {
        Assert.assertEquals(4, 2 + 2)
    }
    @Test
    fun subtraction() {
        Assert.assertEquals(2, 4 - 2)
    }

    @Test
    fun multiplication() {
        Assert.assertEquals(9, 3 * 3)
    }
}
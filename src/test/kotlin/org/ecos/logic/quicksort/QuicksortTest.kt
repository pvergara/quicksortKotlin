package org.ecos.logic.quicksort

import kotlin.test.Test
import kotlin.test.assertEquals

class QuicksortTest {
    @Test
    fun quicksortTest() {
        val unsortedElements = listOf(10,5,7,6,8,9,3,2,4,1)
        val result = Quicksort<Int>().add(unsortedElements).sort()
        val expected = listOf(1,2,3,4,5,6,7,8,9,10)
        assertEquals(result, expected)
    }

    @Test
    fun quicksortTest2() {
        val unsortedElements = listOf(10,9,8,7,6,5,4,3,2,1)
        val result = Quicksort<Int>().add(unsortedElements).sort()
        val expected = listOf(1,2,3,4,5,6,7,8,9,10)
        assertEquals(result, expected)
    }
}
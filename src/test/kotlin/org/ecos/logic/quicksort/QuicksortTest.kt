package org.ecos.logic.quicksort

import kotlin.test.Test
import kotlin.test.assertEquals

class QuicksortTest {
    @Test
    fun quicksortTest() {
        val result = Quicksort().add(unsortedElements).sort();
        assertEquals(result, expected)
    }
}
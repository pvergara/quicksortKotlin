package org.ecos.logic.quicksort.benchmark

import org.ecos.logic.quicksort.Quicksort
import kotlin.random.Random

fun main(){
    val unsortedElements = List(250000) { Random.nextInt(0, 100) }

    val start = System.currentTimeMillis()
    Quicksort<Int>().add(unsortedElements).sort()
    val end = System.currentTimeMillis()

    print("Quicksort:  ${(end-start)}ms")
}
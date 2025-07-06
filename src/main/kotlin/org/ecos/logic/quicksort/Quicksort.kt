package org.ecos.logic.quicksort

class Quicksort<T : Comparable<T>> {
    private val binaryCollection: BinaryCollection<T> = BinaryCollection()

    fun add(itemCollection: Collection<T>): Quicksort<T> {
        for (item in itemCollection) {
            this.binaryCollection.add(item)
        }
        return this
    }

    fun sort():Collection<T> {
        return this.binaryCollection.walkThoughBinaryTreeAndReturnSortedList()
    }

}

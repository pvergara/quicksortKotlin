package org.ecos.logic.quicksort

class BinaryCollection<T : Comparable<T>> {
    private lateinit var element : T
    private lateinit var left : BinaryCollection<T>
    private lateinit var right : BinaryCollection<T>

    fun add(item: T) {
        if(!this::element.isInitialized){
            this.element = item
        }else if(item.compareTo(element) <= 0){
            if(!this::left.isInitialized){
                this.left = BinaryCollection()
            }
            this.left.add(item)
        }else {
            if(!this::right.isInitialized){
                this.right = BinaryCollection()
            }
            this.right.add(item)
        }
    }

    fun walkThoughBinaryTreeAndReturnSortedList(): Collection<T> {
        val result: ArrayList<T> = ArrayList()
        if(!this::left.isInitialized){
            result.add(this.element)
            if(this::right.isInitialized){
                result.addAll(this.right.walkThoughBinaryTreeAndReturnSortedList())
            }
        }else{
            result.addAll(this.left.walkThoughBinaryTreeAndReturnSortedList())
            result.add(this.element)
            if(this::right.isInitialized){
                result.addAll(this.right.walkThoughBinaryTreeAndReturnSortedList())
            }
        }

        return result
    }

}

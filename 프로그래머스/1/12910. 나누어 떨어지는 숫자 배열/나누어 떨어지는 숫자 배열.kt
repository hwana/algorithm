class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer = arr.filter{it % divisor == 0}.sorted()
        return if(answer.isEmpty()) intArrayOf(-1) else answer.toIntArray()
    }
}
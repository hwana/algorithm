
class Solution {
    fun solution(arr: IntArray): IntArray {
        val minNum = arr.minOrNull()
        val answer = arr.filter{it != minNum}
        return if(answer.isEmpty()) intArrayOf(-1) else answer.toIntArray()
    }
}
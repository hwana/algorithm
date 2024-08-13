class Solution {
    fun solution(array: IntArray, height: Int): Int {
        var answer: Int = 0
        for(i in 0 until array.size){
            answer += if(array[i] > height) 1 else 0
        }
        return answer
    }
}
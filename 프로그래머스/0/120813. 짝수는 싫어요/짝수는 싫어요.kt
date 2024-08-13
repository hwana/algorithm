class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = IntArray((n+1)/2){
            it * 2 + 1
        }
        return answer
    }
}
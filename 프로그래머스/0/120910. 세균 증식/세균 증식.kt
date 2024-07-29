class Solution {
    fun solution(n: Int, t: Int): Int {
        var answer: Int = n
        for(i in 1..t)
            answer = answer * 2
        return answer
    }
}
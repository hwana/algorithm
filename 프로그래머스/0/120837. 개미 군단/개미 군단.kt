class Solution {
    fun solution(hp: Int): Int {
        var answer: Int = (hp / 5) + (hp % 5 / 3) + (hp % 5 % 3)
        return answer
    }
}
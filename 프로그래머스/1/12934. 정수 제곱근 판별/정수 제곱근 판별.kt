class Solution {
    fun solution(n: Long): Long {
        val sqrt = Math.sqrt(n.toDouble()).toLong();
        return if(sqrt * sqrt == n){
            (sqrt + 1) * (sqrt + 1)
        }else{
            -1
        }
    }
}
class Solution {
    fun solution(a: Int, b: Int): Long{
        return (minOf(a,b)..maxOf(a,b)).sumOf(){it.toLong()}
    }
}
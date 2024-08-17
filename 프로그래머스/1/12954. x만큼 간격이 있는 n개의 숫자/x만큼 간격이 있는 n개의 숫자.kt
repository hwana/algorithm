class Solution {
    fun solution(x: Int, n: Int) = LongArray(n){ (it.toLong() + 1) * x }
}
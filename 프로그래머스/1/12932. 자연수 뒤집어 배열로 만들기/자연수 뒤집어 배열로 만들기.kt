class Solution {
    fun solution(n: Long): IntArray {
        var str = StringBuilder()
        str.append(n)
        return str.reverse().map{it.digitToInt()}.toIntArray()
    }
}
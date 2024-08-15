class Solution {
    fun solution(my_string: String): String {
        return my_string.map{
            ch -> if(ch.isUpperCase()) ch.toLowerCase() else ch.toUpperCase()
        }.joinToString("")
    }
}
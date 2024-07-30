class Solution {
    fun solution(my_string: String): Int {
       return my_string.sumOf{
           ch -> ch.digitToIntOrNull() ?: 0
       }
    }
}
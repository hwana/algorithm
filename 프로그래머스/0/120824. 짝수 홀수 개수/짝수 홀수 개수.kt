class Solution {
    fun solution(num_list: IntArray) = intArrayOf( 
        num_list.filter{it -> it % 2 == 0}.count(), num_list.filter{it -> it % 2 != 0}.count()
    )
}
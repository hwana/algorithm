class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        return absolutes.mapIndexed{
            index, element -> if(signs[index]) element else -element
        }.sum()
    }
}
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length < 2) return arr;
        
        int i = 2;
        while(arr.length > i){
            i *= 2;
        }
        
        int[] answer = new int[i];
        answer = Arrays.copyOf(arr, i);
            
        return answer;
    }
}
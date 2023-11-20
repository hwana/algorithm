class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] lastDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int count = -1;
        for(int i = 1; i < a; i++){
            count += lastDay[i-1];
        }
        
        return day[(count+b)%7];
    }
}
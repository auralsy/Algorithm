class Solution {
    public String solution(String my_string, int m, int c) {
        // 0, 5,10 0~3/4~7/8~11/12~15
        
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i += m)
        {
            answer += Character.toString(my_string.charAt(i + (c-1)));
        }
        
        return answer;
    }
}
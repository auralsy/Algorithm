class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        // 대문자 -> 65, 소문자 -> 97 기준 = 90
        
        for(int i = 0; i < my_string.length(); i++)
        {
            char c = my_string.charAt(i);
            if(c >= 97)
            {
                answer += (char)(c - 32) + "";
            }
            else
            {
                answer += (char)(c + 32) + "";
            }
        }
        
        return answer;
    }
}
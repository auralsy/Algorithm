class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        for(int i = 0; i < phone_number.length() - 4; i++)
        {
            answer += "*";
        }
        
        for(int i = phone_number.length()-4; i < phone_number.length(); i++)
        {
            char c = phone_number.charAt(i);
            
            answer += String.valueOf(c);
        }
        
        return answer;
    }
}
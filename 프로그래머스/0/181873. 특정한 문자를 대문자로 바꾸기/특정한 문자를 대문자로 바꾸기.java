class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++)
        {
            char c = my_string.charAt(i);
            String str = Character.toString(c);
            
            if(str.equals(alp))
            {
                answer += str.toUpperCase();
            }
            else
            {
                answer += str;
            }
        }
        
        return answer;
    }
}
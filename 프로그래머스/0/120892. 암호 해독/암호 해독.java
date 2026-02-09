class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        int ind = (code-1);
        
        while(ind < cipher.length())
        {
            answer += cipher.charAt(ind) + "";
            
            ind += code;
        }
        
        return answer;
    }
}
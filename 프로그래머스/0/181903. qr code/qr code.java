class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        for(int i = r; i < code.length(); i+=q)
        {
            answer += Character.toString(code.charAt(i));
        }
        
        return answer;
    }
}
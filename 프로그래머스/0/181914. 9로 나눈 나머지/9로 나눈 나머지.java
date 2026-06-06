class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(int i = 0; i < number.length(); i++)
        {
            char c = number.charAt(i);
            
            answer += Character.getNumericValue(c);
        }
        
        answer %= 9;
        
        return answer;
    }
}
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for(int i = 0; i < my_string.length(); i++)
        {
            int t = Character.getNumericValue(my_string.charAt(i));
            
            if(t < 10)
            {
                answer += t;
            }
        }
        
        return answer;
    }
}
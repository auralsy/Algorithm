class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        //65, 97
        for(int i = 0; i < my_string.length(); i++)
        {
            char c = my_string.charAt(i);
            
            if(c >= 97)
            {
                answer[c-71]++;
            }
            else
            {
                answer[c-65]++;
            }
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        String str = Integer.toString(num);
        char check = (char)(k + '0');
        
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == check)
            {
                answer = i + 1;
                break;
            }
        }
        
        return answer;
    }
}
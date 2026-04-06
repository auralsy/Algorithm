class Solution {
    public int solution(int chicken) 
    {
        int answer = 0;
        
        while(chicken >= 10)
        {
            chicken -= 10;
            chicken += 1;
            answer++;
        }
        
        return answer;
    }
}
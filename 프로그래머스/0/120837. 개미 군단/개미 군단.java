class Solution {
    public int solution(int hp) {
        // 장군 -> 5, 병정 -> 3, 일 -> 1
        int answer = 0;
        
        int temp = 0;
        temp = hp%5;
        
        if(temp < 3)
        {
            answer = hp/5;
            answer += (hp%5);
        }
        else if(temp == 3)
        {
            answer = hp/5 + 1;
        }
        else
        {
            answer = hp/5;
            answer += temp/3 + (temp%3);
        }
        
        return answer;
    }
}
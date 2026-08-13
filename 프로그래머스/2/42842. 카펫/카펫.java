// 전체 넗이 = w * h && 노란색 넓이 = (w-2) * (h-2)

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int whole = brown + yellow;
        
        for(int i = 1; i*i <= whole; i++)
        {
            if(whole%i == 0 && (whole/i-2)*(i-2) == yellow)
            {
                answer[0] = whole/i;
                answer[1] = i;
            }
        }
        
        return answer;
    }
}
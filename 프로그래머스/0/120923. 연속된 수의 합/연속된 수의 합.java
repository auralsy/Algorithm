// num이 짝수냐 홀수냐? 

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int start = (total/num) - ((num-1)/2);
        
        for(int i = start; i < start+num; i++)
        {
            answer[i-start] = i;
        }
        
        return answer;
    }
}
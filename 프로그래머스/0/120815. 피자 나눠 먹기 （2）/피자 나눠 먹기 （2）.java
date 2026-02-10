class Solution {
    public int solution(int n) {
        // 사람 수 , 피자 판 수, 피자 조각 수 
        // 피자 판 수 * 6 = 피자 조각 수
        // 피자 조각 수가 사람 수의 배수랑 같아야 하는 것 -> 사람 수 중 6의 배수인 것 / 6
        int answer = 0;
        
        int i = 1;
        
        while(true)
        {
            int check = n*i;
            
            if(check % 6 == 0)
            {
                answer = check/6;
                break;
            }
            
            i++;
        }
        
        return answer;
    }
}
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int st = health; // 현재 체력
        int count = 0; // 연속 성공 횟수
        int last = 1; // 이전 공격 시간 
        
        for(int i = 0; i < attacks.length; i++)
        {
            if(st <= 0)
            {
                answer = -1;
                break;
            }
            
            for(int j = last; j < attacks[i][0]; j++)
            {
                count++;
                
                if(st >= health)
                {
                    if(count == bandage[0])
                    {
                        count = 0;
                        continue;
                    }
                    else
                    {
                        continue;
                    }
                }
                else
                {
                    if(count == bandage[0])
                    {
                        st += bandage[1] + bandage[2];
                        count = 0;
                        
                        if(st > health)
                            st = health;
                    }
                    else
                    {
                        st += bandage[1];
                        
                        if(st > health)
                            st = health;
                    }
                }
            }
            
            st -= attacks[i][1];
            count = 0;
            
            last = attacks[i][0] + 1;
        }
        
        if(st <= 0)
            answer = -1;
        
        if(answer != -1)
            answer = st;
        
        return answer;
    }
}
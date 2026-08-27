class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int r = 1;
        int count = 0;
        int ind = 0;
        int[] rk = new int[3];
        
        while(true)
        {
            if(count == 3)
                break;
            
            for(int i = 0; i < rank.length; i++)
            {
                if(count == 3)
                    break;
                
                if(rank[i] == r && attendance[i] == true)
                {
                    rk[ind] = i;
                    count++;
                    ind++;
                    r++;
                }
                else if(rank[i] == r && attendance[i] == false)
                {
                    r++;
                }
            }
        }
        
        answer = rk[0]*10000 + rk[1]*100 + rk[2];
        
        return answer;
    }
}
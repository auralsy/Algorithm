class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        int max = 0;
        
        for(int i = 0; i < strArr.length; i++)
        {
            int len = strArr[i].length();
            
            if(len > max)
                max = len;
        }
        
        
        int max_count = 0;
        int ind = 1;
        
        for(int i = 0; i < max; i++)
        {
            int c = 0;
            for(int j = 0; j < strArr.length; j++)
            {
                if(strArr[j].length() == ind)
                {
                    c++;
                }
            }
            
            if(c > max_count)
                max_count = c;
            
            ind++;
        }
        
        answer = max_count;
        
        return answer;
    }
}
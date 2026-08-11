class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        int count = 0;
        for(int i = 0; i < intStrs.length; i++)
        {
            String str = "";
            for(int j = s; j < s+l; j++)
            {
                char c = intStrs[i].charAt(j);
                str += String.valueOf(c);
            }
            
            int n = Integer.parseInt(str);
            
            if(n > k)
                count++;
        }
        
        int[] answer = new int[count];
        int ind = 0;
        
        for(int i = 0; i < intStrs.length; i++)
        {
            String str = "";
            for(int j = s; j < s+l; j++)
            {
                char c = intStrs[i].charAt(j);
                str += String.valueOf(c);
            }
            
            int n = Integer.parseInt(str);
            
            if(n > k)
            {
                answer[ind] = n;
                ind++;
            }
        }
        
        return answer;
    }
}
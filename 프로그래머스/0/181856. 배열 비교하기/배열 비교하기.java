class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int len1 = arr1.length;
        int len2 = arr2.length;
        
        if(len1 != len2)
        {
            if(len1 > len2)
                answer = 1;
            else if(len1 < len2)
                answer = -1;
        }
        else
        {
            int n1 = 0;
            int n2 = 0;
            
            for(int i = 0; i < len1; i++)
            {
                n1 += arr1[i];
            }
            
            for(int i = 0; i < len2; i++)
            {
                n2 += arr2[i];
            }
            
            if(n1 > n2)
                answer = 1;
            else if(n1 < n2)
                answer = -1;
        }
        
        return answer;
    }
}
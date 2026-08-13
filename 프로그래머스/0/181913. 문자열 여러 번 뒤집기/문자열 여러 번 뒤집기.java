// 투 포인터 
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        String[] str = my_string.split("");
        
        for(int i = 0; i < queries.length; i++)
        {
            reverse(str, queries[i][0], queries[i][1]);
        }
        
        for(int i = 0; i < str.length; i++)
        {
            answer += str[i];
        }
        
        return answer;
    }
    
    void reverse(String[] str, int left, int right)
    {
        while(left < right)
        {
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            
            left++;
            right--;
        }
        
    }
}
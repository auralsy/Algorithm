class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String[] arr = my_string.split("");
        
        for(int i = 0; i < s; i++)
        {
            answer += arr[i];
        }
        
        for(int i = e; i >= s; i--)
        {
            answer += arr[i];
        }
        
        for(int i = e+1; i < arr.length; i++)
        {
            answer += arr[i];
        }
        
        return answer;
    }
}
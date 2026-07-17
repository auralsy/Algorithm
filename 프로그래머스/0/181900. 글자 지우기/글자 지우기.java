class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] arr = my_string.split("");
        
        for(int i = 0; i < indices.length; i++)
        {
            int n = indices[i];
            
            arr[n] = "";
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            answer += arr[i];
        }
        
        return answer;
    }
}
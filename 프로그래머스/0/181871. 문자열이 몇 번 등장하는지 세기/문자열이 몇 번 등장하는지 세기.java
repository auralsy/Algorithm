class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int len = pat.length();
        
        String[] arr = myString.split("");
        
        for(int i = 0; i <= arr.length-len; i++)
        {
            String str = "";
            for(int j = i; j < i+len; j++)
            {
                str += arr[j];
            }
            
            if(str.equals(pat))
                answer += 1;
        }
        
        return answer;
    }
}
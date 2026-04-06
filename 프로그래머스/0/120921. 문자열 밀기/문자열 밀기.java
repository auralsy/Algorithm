class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int count = 0;
        
        String temp = A;
        
        
        for(int i = 0; i < A.length(); i++)
        {
            if(A.equals(B))
            {
                answer = 0;
                break;
            }
            
            temp = temp.charAt(A.length()-1) + temp.substring(0, A.length()-1);
            count++;
            
            if(temp.equals(B))
            {
                answer = count;
                break;
            }
        }
        
        return answer;
    }
}
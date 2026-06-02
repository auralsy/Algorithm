class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int n = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int m = 2 * a * b;
        
        if(n >= m)
            answer = n;
        else
            answer = m;
        
        return answer;
    }
}
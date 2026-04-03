class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        int min = Math.min(M, N);
        int max = Math.max(M,N);
        
        answer = (max-1) * (min) + (min - 1);
        
        return answer;
    }
}
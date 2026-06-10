class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        
        int j = 0;
        for(int i = k; i <= n;)
        {
            answer[j] = i;
            i += k;
            j++;
        }
        
        return answer;
    }
}
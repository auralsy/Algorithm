class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        int count = 0;
        int t = 0, k = 0;
        
        while(count < num_list.length)
        {
            for(int i = 0; i < n; i++)
            {
                answer[t][i] = num_list[k];
                k++;
            }
            t++;
            count += n;
        }
        
        return answer;
    }
}
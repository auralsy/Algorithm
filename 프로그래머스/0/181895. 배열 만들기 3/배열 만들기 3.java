class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int n = intervals[0][1] - intervals[0][0] + 1 + intervals[1][1] - intervals[1][0] + 1;
        int[] answer = new int[n];
        
        int ind = 0;
        
        for(int i = 0; i < 2; i++)
        {
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++)
            {
                answer[ind] = arr[j];
                ind++;
            }
        }
        
        return answer;
    }
}
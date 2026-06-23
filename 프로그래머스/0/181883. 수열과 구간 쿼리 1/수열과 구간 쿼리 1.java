class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        int n = queries.length;
        
        for(int i = 0; i < n; i++)
        {
            for(int j = queries[i][0]; j <= queries[i][1]; j++)
            {
                arr[j]++;
            }
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}
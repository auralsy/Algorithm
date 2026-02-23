class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        
        int[] answer = new int[n];
        
        int max = emergency[0];
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(emergency[i] < emergency[j])
                    answer[i]++;
            }
            answer[i]++;
        }
        
        return answer;
    }
}
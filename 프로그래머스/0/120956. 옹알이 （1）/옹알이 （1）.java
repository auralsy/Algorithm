class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        int n = babbling.length;
        String[] arr = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(babbling[i].contains(arr[j]))
                    babbling[i] = babbling[i].replace(arr[j], " ");
            }
            if(babbling[i].trim().isEmpty())
                answer++;
        }
        
        
        
        
        return answer;
    }
}
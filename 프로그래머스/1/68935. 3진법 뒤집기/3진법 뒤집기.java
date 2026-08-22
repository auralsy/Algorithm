class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = "";
        int num = n;
        
        // 앞뒤 반전 구하기
        while(true)
        {
            if(num == 0)
                break;
            
            int k = num%3;
            num = num/3;
            str += Integer.toString(k);
        }
        
        // 반전 3진수 -> 10진수
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            int t = 1;
            for(int j = 0; j < str.length()-i-1; j++)
            {
                t *= 3;
            }
            
            answer += Character.getNumericValue(c) * t;
        }
        
        return answer;
    }
}
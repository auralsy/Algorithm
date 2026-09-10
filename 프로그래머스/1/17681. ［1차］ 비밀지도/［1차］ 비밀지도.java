// OR 연산

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
                
        for(int i = 0; i < arr1.length; i++)
        {
            int a = arr1[i];
            int b = arr2[i];
            String firstMap = "";
            String secondMap = "";
            
            while(a != 0)
            {
                firstMap += (a % 2);
                a /= 2;
            }
            
            while(b != 0)
            {
                secondMap += (b % 2);
                b /= 2;
            }
            
            // 자리수 맞추기 
            if(firstMap.length() < n)
            {
                int m = n - firstMap.length();
                
                for(int k = 0; k < m; k++)
                    firstMap += "0";
            }
            
            if(secondMap.length() < n)
            {
                int t = n - secondMap.length();
                
                for(int k = 0; k < t; k++)
                    secondMap += "0";
            }
            
            StringBuffer sb = new StringBuffer(firstMap);
            firstMap = sb.reverse().toString();
            
            sb = new StringBuffer(secondMap);
            secondMap = sb.reverse().toString();
            
            answer[i] = "";
            
            for(int j = 0; j < firstMap.length(); j++)
            {
                if(firstMap.charAt(j) == '1' || secondMap.charAt(j) == '1')
                {
                    answer[i] += "#";
                }
                else
                {
                    answer[i] += " ";
                }
            }
        }
        
        return answer;
    }
}
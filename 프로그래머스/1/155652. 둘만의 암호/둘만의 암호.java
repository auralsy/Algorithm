class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int count = index;
            char c2 = 'a';
            
            for(int j = 1; j <= count; j++)
            {
                // skip 뛰어넘는 기능, z 넘어가면 a로 넘어가는 부분.
                
                char c1 = (char)(c + j);
                if(c1 > 'z')
                {
                    c1 = (char)((c1 - 'z' - 1)%26 + 'a');
                }
                
                String str = String.valueOf(c1);
                
                if(skip.contains(str))
                {
                    count++;
                }
                c2 = c1;
            }
            
            answer += String.valueOf(c2);
        }
        
        return answer;
    }
}
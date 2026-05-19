class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        int len = control.length();
        
        for(int i = 0; i < len; i++)
        {
            String str = Character.toString(control.charAt(i));
            
            if(str.equals("w"))
                n += 1;
            else if(str.equals("s"))
                n -= 1;
            else if(str.equals("d"))
                n += 10;
            else
                n -= 10;
        }
        
        answer = n;
        return answer;
    }
}
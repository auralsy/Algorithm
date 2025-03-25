class Solution {
    public String solution(String my_string) 
    {
        String answer = "";
        
        char[] str = my_string.toCharArray();
        char[] rev = new char[str.length];
        
        for(int i = 0; i < str.length; i++)
        {
            rev[i] = str[str.length - i - 1]; //원소 개수랑 인덱스는 다르다!
        }
        
        answer = new String(rev);
        return answer;
    }
}
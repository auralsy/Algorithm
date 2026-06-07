class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String str = "";
        
        if(my_string.length() >= is_prefix.length())
        {
            for(int i = 0; i < is_prefix.length(); i++)
            {
                char c = my_string.charAt(i);
                str += Character.toString(c);
            }
        }
        
        if(is_prefix.equals(str))
            answer = 1;
        
        return answer;
    }
}
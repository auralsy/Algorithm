class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        int leng = is_suffix.length();
        String str = "";
        
        if(my_string.length() >= leng)
        {
            for(int i = my_string.length() - leng; i < my_string.length(); i++)
            {
                char c = my_string.charAt(i);
                str += Character.toString(c);
            }
        }
        
        if(str.equals(is_suffix))
            answer = 1;
        
        return answer;
    }
}
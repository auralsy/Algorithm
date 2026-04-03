class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int index = (len%n == 0) ? (len/n) : (len/n + 1);
        
        String[] answer = new String[index];
        
        for(int i = 0; i < index; i++)
        {
            int start = i * n;
            int end = Math.min(start+n, len);
            
            answer[i] = my_str.substring(start, end);
        }
        
        return answer;
    }
}
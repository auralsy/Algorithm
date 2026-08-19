class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int ind = 0;
        
        int[] answer = new int[str.length()];
        
        for(int i = str.length()-1; i >= 0; i--)
        {
            char c = str.charAt(i);
            
            answer[ind] = Character.getNumericValue(c);
            ind++;
        }
        
        return answer;
    }
}
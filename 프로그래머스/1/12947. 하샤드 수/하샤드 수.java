class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        int positionNum = 0;
        String str = Integer.toString(x);
        
        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            
            positionNum += Character.getNumericValue(c);
        }
        
        if(x % positionNum == 0)
            answer = true;
        
        return answer;
    }
}
class Solution {
    public String solution(String X, String Y) {
        int[] cntX = new int[10];
        int[] cntY = new int[10];

        for(char c : X.toCharArray()) 
            cntX[c - '0']++;
        for(char c : Y.toCharArray()) 
            cntY[c - '0']++;

        StringBuilder sb = new StringBuilder();
        for(int d = 9; d >= 0; d--) 
        {
            int common = Math.min(cntX[d], cntY[d]);
            
            for(int k = 0; k < common; k++) 
            {
                sb.append(d); 
            }
        }

        if(sb.length() == 0) 
            return "-1";
        if(sb.charAt(0) == '0') 
            return "0"; 

        return sb.toString();
    }
}
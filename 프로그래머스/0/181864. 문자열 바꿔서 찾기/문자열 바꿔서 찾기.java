class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String str1 = myString.replaceAll("A", "x").replaceAll("B", "A").replaceAll("x", "B");
        
        if(str1.contains(pat))
            answer = 1;
        
        return answer;
    }
}
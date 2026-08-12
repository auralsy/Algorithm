class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int last_ind = myString.lastIndexOf(pat);
        
        answer = myString.substring(0, last_ind + pat.length());
        return answer;
    }
}
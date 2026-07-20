class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] str = binomial.split(" ");
        
        answer += Integer.parseInt(str[0]);
        if(str[1].equals("+"))
        {
            answer = answer + Integer.parseInt(str[2]);
        }
        else if(str[1].equals("-"))
        {
            answer = answer - Integer.parseInt(str[2]);
        }
        else
        {
            answer = answer * Integer.parseInt(str[2]);
        }
        
        return answer;
    }
}
class Solution {
    public String[] solution(String myStr) {
        
        String a = myStr.replace("a", " ");
        String b = a.replace("b", " ");
        String k = b.replace("c", " ");
        String[] c = k.trim().split("\\s+");
        
        String[] answer;
        
        if(c.length == 1 && c[0].equals(""))
        {
            answer = new String[1];
            answer[0] = "EMPTY";
        }
        else
        {
            answer = new String[c.length];
            for(int i = 0; i < c.length; i++)
        {
            answer[i] = c[i];
        }
        }
        
        return answer;
    }
}
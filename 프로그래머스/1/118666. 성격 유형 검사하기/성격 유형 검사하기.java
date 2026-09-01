import java.util.*;
// 4기준 크면 뒤에 있는 거 작으면 앞에 있는 거
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> hm = new HashMap<>();
        
        hm.put("R", 0);
        hm.put("T", 0);
        hm.put("C", 0);
        hm.put("F", 0);
        hm.put("J", 0);
        hm.put("M", 0);
        hm.put("A", 0);
        hm.put("N", 0);
        
        for(int i = 0; i < survey.length; i++)
        {
            int num = 0;
            
            switch(choices[i])
            {
                case 1, 7 : 
                    num = 3;
                    break;
                case 2, 6 : 
                    num = 2;
                    break;
                case 3, 5 : 
                    num = 1;
                    break;
            }
            
            if(choices[i] < 4)
            {
                char c = survey[i].charAt(0);
                int n = hm.get(String.valueOf(c));
                
                hm.put(String.valueOf(c), n + num);
            }
            else if(choices[i] > 4)
            {
                char c = survey[i].charAt(1);
                int n = hm.get(String.valueOf(c));
                
                hm.put(String.valueOf(c), n + num);
            }
        }
        
        if(hm.get("R") > hm.get("T"))
        {
            answer += "R";
        }
        else if(hm.get("R") < hm.get("T"))
        {
            answer += "T";
        }
        else
        {
            answer += "R";
        }
        
        if(hm.get("C") > hm.get("F"))
        {
            answer += "C";
        }
        else if(hm.get("C") < hm.get("F"))
        {
            answer += "F";
        }
        else
        {
            answer += "C";
        }
        
        if(hm.get("J") > hm.get("M"))
        {
            answer += "J";
        }
        else if(hm.get("J") < hm.get("M"))
        {
            answer += "M";
        }
        else
        {
            answer += "J";
        }
        
        if(hm.get("A") > hm.get("N"))
        {
            answer += "A";
        }
        else if(hm.get("A") < hm.get("N"))
        {
            answer += "N";
        }
        else
        {
            answer += "A";
        }
        
        return answer;
    }
}
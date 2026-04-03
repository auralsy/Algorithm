class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        polynomial = polynomial.replace(" + ", " ");
        
        String[] str = polynomial.split(" ");
        int count = 0;
        int numValue = 0;
        
        for(int i = 0; i < str.length; i++)
        {
            if(str[i].contains("x"))
            {
                if(str[i].length() > 1)
                {
                    count += Integer.parseInt(str[i].substring(0, str[i].length()-1));
                }
                else
                    count++;
            }
            else
            {
                numValue += Integer.parseInt(str[i]);
            }
        }
        
        String xPart = "";
        xPart = (count == 0) ? "" : ((count == 1) ? "x" : Integer.toString(count) + "x");
    
        String numPart = "";
        numPart = (numValue == 0) ? "" : Integer.toString(numValue);
        
        if(xPart.equals("") || numPart.equals(""))
            answer = xPart + numPart;
        else
            answer = xPart + " + " + numPart;
        
        return answer;
    }
}
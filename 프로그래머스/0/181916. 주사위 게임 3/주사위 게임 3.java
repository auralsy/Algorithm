class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        if(a == b && b == c && c == d) // 4개 다 같을 때
        {
            answer = 1111*a;
        }
        else if(a == b && b == c && c != d) // d만 다를 때
        {
            answer = (10*a + d) * (10*a + d);
        }
        else if(a == b && b == d && b != c) // c만 다를 때
        {
            answer = (10*a + c) * (10*a + c);
        }
        else if(a == c && c == d && b != d) // b만 다를 때
        {
            answer = (10*a + b) * (10*a + b);
        }
        else if(b == c && c == d && a != b) // a만 다를 때
        {
            answer = (10*b + a) * (10*b + a);
        }
        else if(a == b && c == d && a != c) // a = b, c = d
        {
            answer = (a + c) * (Math.abs(a - c));
        }
        else if(a == c && b == d && a != b) // a = c, b = d
        {
            answer = (a + b) * (Math.abs(a - b));
        }
        else if(a == d && b == c && a != c) // a = d, b = c
        {
            answer = (a + c) * (Math.abs(a - c));
        }
        else if(a == b && b != c && b != d && c != d) // a = b, c, d
        {
            answer = c * d;
        }
        else if(a == c && c != b && c != d && b != d) // a = c, b, d
        {
            answer = b * d;
        }
        else if(a == d && d != b && d != c && b != c) // a = d, b, c
        {
            answer = b * c;
        }
        else if(b == c && c != a && c != d && a != c) // b = c, a, d
        {
            answer = a * d;
        }
        else if(b == d && d != a && d != c && a != c) // b = d, a, c
        {
            answer = a * c;
        }
        else if(c == d && d != a && d != b && a != b) // c = d, a, b
        {
            answer = a * b;
        }
        else if(a != b && a != c && a != d && b != c && b != d && c != d) // 달라
        {
            int min = a;
            
            if(min > b)
                min = b;
            
            if(min > c)
                min = c;
            
            if(min > d)
                min = d;
            
            answer = min;
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    Set<Integer> primes = new HashSet<>();
    
    public int solution(String numbers) {
        int answer = 0;
        int[] arr = new int[numbers.length()];
        
        // 숫자들 각각 배열에 저장
        for(int i = 0; i < numbers.length(); i++)
        {
            char c = numbers.charAt(i);
            
            arr[i] = Character.getNumericValue(c);
        }
        
        boolean[] visited = new boolean[arr.length];
        
        makeNum(arr, visited, 0);
        
        answer = primes.size();
        
        return answer;
    }
    
    // 수 제작
    void makeNum(int[] arr, boolean[] visited, int current)
    {
        if(isPrime(current))
        {
            primes.add(current);
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            if(!visited[i])
            {
                visited[i] = true;
                makeNum(arr, visited, current*10 + arr[i]);
                visited[i] = false;
            }
        }
    }
    
    // 소수 판별 
    boolean isPrime(int n)
    {
        if(n < 2)
            return false;
        
        for(int i = 2; i*i <= n; i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
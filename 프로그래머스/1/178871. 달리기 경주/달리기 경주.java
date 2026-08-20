import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < players.length; i++)
        {
            hm.put(players[i], i);
        }
        
        for(String called : callings)
        {
            int i = hm.get(called);
            String s = players[i-1];
            players[i-1] = called;
            players[i] = s;
            
            hm.put(called, i-1);
            hm.put(s, i);
        }
        
        return players;
    }
}
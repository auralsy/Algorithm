class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {

        int len   = toSec(video_len);
        int cur   = toSec(pos);
        int start = toSec(op_start);
        int end   = toSec(op_end);

        if (cur >= start && cur <= end) 
            cur = end;

        for (String cmd : commands) 
        {
            if (cmd.equals("prev")) 
            {
                cur = Math.max(0, cur - 10);
            } 
            else 
            {
                cur = Math.min(len, cur + 10);
            }

            if (cur >= start && cur <= end) 
                cur = end;
        }

        return toTime(cur);
    }

    // 총 초로 계산
    int toSec(String t) {
        int min = Integer.parseInt(t.substring(0, 2));
        int sec = Integer.parseInt(t.substring(3));
        return min * 60 + sec;
    }

    // 형식에 맞게 시간으로 변환
    String toTime(int total) {
        int min = total / 60;
        int sec = total % 60;
        return String.format("%02d:%02d", min, sec);
    }
}
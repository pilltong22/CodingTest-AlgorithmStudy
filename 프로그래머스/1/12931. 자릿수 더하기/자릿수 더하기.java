import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp=n;
        int cnt=0;
        
        while(tmp>0)
        {
            answer+= tmp%10;
            tmp /= 10;
        }
        return answer;
    }
}
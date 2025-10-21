import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = -1;
        int a = 0;
        int cnt =0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int i=0; i<scoville.length; i++) {
            q.offer(scoville[i]);
        }
        
         while(q.size()>=2) {
             if(q.peek()>=K) {  // 종료 조건 모든 원소가 k 이상이다!
                answer=cnt;
                 break;
             }             
            a = q.poll() + q.poll()*2;
            q.offer(a);
              cnt++; 
             
         }
        if(q.peek()>=K)answer=cnt;
        return answer;
        

    }
}
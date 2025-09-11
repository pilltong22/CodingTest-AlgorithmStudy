class Solution {
    public int solution(int a, int b, int n) {  
        int answer = 0;
        int get=0;//한 번의 시행에서 받는 병수 tmp
        int remain=0;  //한 번에 시행에서 마트에 가져가지 않는 남아있는 병 수
        
        while(n>=a)
        {   
            remain = n % a;
            get = (n/a) * b; // n에서 빈병 a 나누고 b 곱하기
            
            answer += get; // 받은 병 수 
            n= get + remain;
            remain =0;
            get = 0; // 한 번의 시행이 끝난 후 초기화
        }
        
        
        return answer;
    }
}
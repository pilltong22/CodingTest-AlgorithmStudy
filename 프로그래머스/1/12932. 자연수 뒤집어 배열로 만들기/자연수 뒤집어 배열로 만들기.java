class Solution {
    public int[] solution(long n) {
        // answer 배열을 바로 초기화하지 않고, 아래에서 cnt를 계산한 후 초기화합니다.
        int[] answer;
        int cnt = 0;
        long tmp = n; // n의 원본 값을 tmp에 복사하여 자릿수 세기에 사용

        // n이 0인 경우는 자연수가 아니므로 문제 조건에 따라 고려하지 않아도 됩니다.
        // 하지만 만약을 위해 추가한다면:
        // if (n == 0) {
        //     return new int[]{0}; // 0의 경우 [0]을 반환
        // }

        // 첫 번째 루프: 자릿수 세기
        // tmp가 0보다 클 때까지 10으로 나누면서 자릿수를 셉니다.
        while (tmp > 0) {
            tmp /= 10;
            cnt++;
        }

        // cnt가 0이 되는 경우는 n이 0일 때 뿐인데,
        // 자연수라는 조건 때문에 n은 1이상입니다.
        // 따라서 cnt는 항상 1이상입니다.

        // answer 배열을 올바른 크기(자릿수)로 초기화
        answer = new int[cnt];
        int i = 0;

        // 두 번째 루프: 각 자릿수를 배열에 저장 (원본 n 사용)
        while (n > 0) {
            // n % 10의 결과는 long 타입이지만, int 배열에 저장하므로 int로 캐스팅
            answer[i++] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }
}
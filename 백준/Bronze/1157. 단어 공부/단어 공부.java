

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        char[] arr = input.toCharArray();

        // 소문자 -> 대문자
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] - ('a' - 'A'));
            }
        }

        Arrays.sort(arr); // 오름차순 정렬

        int max_long = 0;        // 최빈 길이
        int cur_long = 1;        // 현재 구간 길이
        char bestChar = arr[0];  // 최빈 문자
        boolean tie = false;     // 동빈도 여부

        // 인접 비교로 구간 길이 측정
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                cur_long++;
            } else {
                // 현재 구간(arr[i]) 종료 -> 최댓값 갱신/타이 체크
                if (cur_long > max_long) {
                    max_long = cur_long;
                    bestChar = arr[i];
                    tie = false;          // 새로운 최댓값이므로 타이 해제
                } else if (cur_long == max_long) {
                    tie = true;           // 동빈도 발생
                }
                cur_long = 1;             // 다음 문자 구간 시작
            }
        }

        // 마지막 구간(배열 끝 문자) 반영
        if (cur_long > max_long) {
            max_long = cur_long;
            bestChar = arr[arr.length - 1];
            tie = false;
        } else if (cur_long == max_long) {
            tie = true;
        }

        // 출력
        if (tie) System.out.println("?");
        else System.out.println(bestChar);
    }
}

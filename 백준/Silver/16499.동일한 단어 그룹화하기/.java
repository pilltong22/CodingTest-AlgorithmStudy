import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int N;
        int cnt = 0;
        String str;
        String comp;
        char[] arr;
        N=sc.nextInt();

        sc.nextLine();

        for(int i=0;i<N;i++){
            str=sc.nextLine();
            arr =str.toCharArray(); //문자열 -> 문자배열

            Arrays.sort(arr); //오름차순 배열

            String sorted = new String(arr); //문자배열->문자열
            set.add(sorted);
        }

        System.out.println(set.size());
    }
}


import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < T; i++) {
            String line = br.readLine();
            StringBuilder word = new StringBuilder();

            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);

                if (c == ' ') {
                    answer.append(word.reverse()).append(' ');
                    word.setLength(0); // 재사용
                } else {
                    word.append(c);
                }
            }

            // 마지막 단어 처리
            answer.append(word.reverse()).append('\n');
        }

        System.out.print(answer);
    }
}

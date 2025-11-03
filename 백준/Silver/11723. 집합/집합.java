import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            String[] parts = line.split(" ");
            String cmd = parts[0];

            switch (cmd) {
                case "add": {
                    int x = Integer.parseInt(parts[1]);
                    set.add(x);
                    break;
                }
                case "remove": {
                    int x = Integer.parseInt(parts[1]);
                    set.remove(x);
                    break;
                }
                case "check": {
                    int x = Integer.parseInt(parts[1]);
                    out.append(set.contains(x) ? 1 : 0).append('\n');
                    break;
                }
                case "toggle": {
                    int x = Integer.parseInt(parts[1]);
                    if (set.contains(x)) set.remove(x);
                    else set.add(x);
                    break;
                }
                case "all": {
                    set.clear();
                    for (int j = 1; j <= 20; j++) set.add(j);
                    break;
                }
                case "empty": {
                    set.clear();
                    break;
                }
            }
        }

        System.out.print(out.toString());
    }
}

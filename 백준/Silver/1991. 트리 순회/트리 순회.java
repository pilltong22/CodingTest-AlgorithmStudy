
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    /* 설명. 각 노드 객체가 담길 리스트 */
    static List<Node>[] list;
    static int n;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        list = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i <= n; i++) {
            String[] alpha;
            try {
                alpha = br.readLine().split(" ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            int data = alpha[0].charAt(0) - 'A' + 1;

            // '.' 은 0으로 저장 (NULL child)
            int left  = (alpha[1].charAt(0) == '.') ? 0 : (alpha[1].charAt(0) - 'A' + 1);
            int right = (alpha[2].charAt(0) == '.') ? 0 : (alpha[2].charAt(0) - 'A' + 1);

            list[data].add(new Node(left, right));
        }

        preorder(1);
        sb.append("\n");
        inorder(1);
        sb.append("\n");
        postorder(1);

        System.out.print(sb.toString());
    }

    static class Node {
        int left;
        int right;
        public Node(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    private static void preorder(int start) {
        if (start == 0) return;                 // 기저 조건
        if (list[start].isEmpty()) return;

        Node node = list[start].get(0);
        int l = node.left;
        int r = node.right;

        sb.append((char) (start + 'A' - 1));    // 루트
        preorder(l);                             // 왼
        preorder(r);                             // 오
    }

    private static void inorder(int start) {
        if (start == 0) return;
        if (list[start].isEmpty()) return;

        Node node = list[start].get(0);
        int l = node.left;
        int r = node.right;

        inorder(l);                              // 왼
        sb.append((char) (start + 'A' - 1));    // 루트
        inorder(r);                              // 오
    }

    private static void postorder(int start) {
        if (start == 0) return;
        if (list[start].isEmpty()) return;

        Node node = list[start].get(0);
        int l = node.left;
        int r = node.right;

        postorder(l);                            // 왼
        postorder(r);                            // 오
        sb.append((char) (start + 'A' - 1));    // 루트
    }
}

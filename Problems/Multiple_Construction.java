import java.util.*;

public class Multiple_Construction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            StringBuilder out = new StringBuilder();
            int m = 2 * n;
            int[] a = new int[m + 1];       // 1-based array
            boolean[] used = new boolean[m + 1];
            int cur = 1;

            for (int x = n; x >= 1; --x) {
                while (used[cur]) cur++;
                int i = cur;
                int j = i + x;
                while (j <= m && used[j]) j += x;
                a[i] = a[j] = x;
                used[i] = used[j] = true;
            }

            for (int i = 1; i <= m; i++) {
                if (i > 1) out.append(" ");
                out.append(a[i]);
            }
            out.append("\n");
            System.out.println(out);
        }
    }
}

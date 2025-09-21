import java.util.*;
public class Rabbits {
    static boolean solveCase(String s) {
        int n = s.length();
        List<Integer> z = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                z.add(i);
            }
        }
        if (z.isEmpty()) return true;

        boolean[] canL = new boolean[n];
        boolean[] canR = new boolean[n];

        for (int i : z) {
            canL[i] = (i == 0) || (s.charAt(i - 1) == '0')
                    || (i >= 2 && s.charAt(i - 1) == '1' && s.charAt(i - 2) == '0');
            canR[i] = (i == n - 1) || (s.charAt(i + 1) == '0')
                    || (i + 2 < n && s.charAt(i + 1) == '1' && s.charAt(i + 2) == '0');
        }

        int m = z.size();
        int idx = 0;
        while (idx < m) {
            int j = idx;
            while (j + 1 < m && z.get(j + 1) == z.get(j) + 2 && s.charAt(z.get(j) + 1) == '1') {
                j++;
            }

            int first = z.get(idx);
            int cur = (canL[first] ? 1 : 0) | (canR[first] ? 2 : 0);
            if (cur == 0) return false;

            for (int t = idx + 1; t <= j; t++) {
                int i = z.get(t);
                int nxt = 0;
                if ((cur & 1) != 0 && canR[i]) nxt |= 2;
                if ((cur & 2) != 0 && canL[i]) nxt |= 1;
                cur = nxt;
                if (cur == 0) return false;
            }
            idx = j + 1;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner fs=new Scanner(System.in);
        int T = fs.nextInt();
        while (T-- > 0) {
            int n = fs.nextInt();
            String s = fs.next();
            System.out.println(solveCase(s) ? "YES" : "NO");
        }
    }
}



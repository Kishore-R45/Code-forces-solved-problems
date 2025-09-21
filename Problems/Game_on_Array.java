import java.util.*;

public class Game_on_Array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        StringBuilder out =new StringBuilder();
        while (t-- > 0) {
            int n=in.nextInt();
            Map<Long, Long> freq = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long x = in.nextLong();
                freq.put(x, freq.getOrDefault(x, 0L) + 1);
            }

            List<long[]> groups = new ArrayList<>();
            for (Map.Entry<Long, Long> e : freq.entrySet()) {
                groups.add(new long[]{e.getValue(), e.getKey()});
            }
            groups.sort((a, b) -> {
                if (a[0] != b[0]) return Long.compare(b[0], a[0]);
                return Long.compare(b[1], a[1]);
            });

            long A = 0, B = 0;
            int turn = 0;

            for (long[] g : groups) {
                long c = g[0];
                long L = g[1];

                long aliceMoves, bobMoves;
                if (turn == 0) {
                    aliceMoves = (L + 1) / 2;
                    bobMoves = L / 2;
                } else {
                    aliceMoves = L / 2;
                    bobMoves = (L + 1) / 2;
                }

                A += aliceMoves * c;
                B += bobMoves * c;

                if ((L & 1) == 1) {
                    turn ^= 1;
                }
            }
            out.append(A).append(" ").append(B).append("\n");
        }
        System.out.print(out);
    }
}

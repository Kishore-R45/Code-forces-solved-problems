import java.util.*;
public class Modular_Tetration {
    static final int MOD = 998244353;
    static final int LIM = 1_000_000;

    static int[] spf = new int[LIM + 1];
    static int[] invv = new int[LIM + 1];

    static long modPow(long a, long e) {
        long r = 1 % MOD;
        while (e > 0) {
            if ((e & 1) == 1) r = (r * a) % MOD;
            a = (a * a) % MOD;
            e >>= 1;
        }
        return r;
    }

    static void buildSpf() {
        Arrays.fill(spf, 0);
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= LIM; i++) {
            if (spf[i] == 0) {
                spf[i] = i;
                primes.add(i);
            }
            for (int p : primes) {
                if ((long) p * i > LIM) break;
                spf[p * i] = p;
                if (p == spf[i]) break;
            }
        }
        spf[1] = 1;
    }

    static List<int[]> factorizeInt(int n) {
        List<int[]> f = new ArrayList<>();
        if (n <= 1) return f;
        while (n > 1) {
            int p = spf[n];
            int c = 0;
            while (n % p == 0) {
                n /= p;
                c++;
            }
            f.add(new int[]{p, c});
        }
        return f;
    }

    public static void main(String[] args){

        Scanner fs=new Scanner(System.in);
        buildSpf();
        invv[1] = 1;
        for (int i = 2; i <= LIM; i++) {
            invv[i] = (int) (((long) (MOD - MOD / i) * invv[MOD % i]) % MOD);
        }

        int T = fs.nextInt();
        while (T-- > 0) {
            int x = fs.nextInt();
            int y = fs.nextInt();
            int z = fs.nextInt();

            Map<Integer, Integer> cnt = new HashMap<>(32);
            for (int[] pr : factorizeInt(x)) cnt.merge(pr[0], pr[1], Integer::sum);
            for (int[] pr : factorizeInt(y)) cnt.merge(pr[0], pr[1], Integer::sum);
            for (int[] pr : factorizeInt(z)) cnt.merge(pr[0], pr[1], Integer::sum);

            long ans = 1;
            List<Integer> primesM = new ArrayList<>(cnt.keySet());
            for (Map.Entry<Integer, Integer> kv : cnt.entrySet()) {
                int p = kv.getKey(), k = kv.getValue();
                ans = ans * (p - 1) % MOD;
                ans = ans * modPow(invv[p], k) % MOD;
            }

            Map<Integer, Integer> E = new HashMap<>(64);
            for (int p : primesM) {
                int t = p - 1;
                for (int[] pr : factorizeInt(t)) {
                    E.merge(pr[0], pr[1], Integer::sum);
                }
            }

            Set<Integer> pset = new HashSet<>(primesM);
            for (Map.Entry<Integer, Integer> kv : E.entrySet()) {
                int r = kv.getKey(), e = kv.getValue();
                if (pset.contains(r)) {
                    ans = ans * modPow(invv[r], e) % MOD;
                } else {
                    long invr = invv[r];
                    long invrE = modPow(invr, e);
                    long term = (invr + ((1 - invr + MOD) % MOD) * invrE) % MOD;
                    ans = ans * term % MOD;
                }
            }

            System.out.println(ans);
        }
    }
}




import java.util.Arrays;

public class FibonacciMemoTab {
    static long memo(int n, long[] cache) {
        if (n <= 1) return n;
        if (cache[n] != -1) return cache[n];
        // La memoización evita recalcular el mismo subproblema.
        return cache[n] = memo(n - 1, cache) + memo(n - 2, cache);
    }

    static long tabulacion(int n) {
        if (n <= 1) return n;
        long[] dp = new long[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }

    public static void main(String[] args) {
        long[] cache = new long[41]; Arrays.fill(cache, -1);
        System.out.println(memo(40, cache));
        System.out.println(tabulacion(40));
    }
}

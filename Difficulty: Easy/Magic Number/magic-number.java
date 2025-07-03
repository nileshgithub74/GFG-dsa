class Solution {
    static final int MOD = 1000000007;

    static long nthMagicNo(int n) {
        long base = 5;
        long sum = 0;

        while (n != 0) {
            int last = n & 1;
            n = n >> 1;

            if (last == 1) {
                sum = (sum + base) % MOD;
            }

            base = (base * 5) % MOD;
        }

        return sum;
    }
}

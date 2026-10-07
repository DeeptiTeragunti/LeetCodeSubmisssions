class Solution {
    public int numDistinct(String s, String t) {
        int n = s.length(), m = t.length();
        if (m > n) return 0;

        long[] dp = new long[m + 1];
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = Math.min(i + 1, m); j >= 1; j--) {
                if (s.charAt(i) == t.charAt(j - 1)) {
                    // Cap intermediate counts to prevent overflow.
                    // The final answer is guaranteed to fit in an int.
                    dp[j] = Math.min(Integer.MAX_VALUE, dp[j] + dp[j - 1]);
                }
            }
        }
        return (int) dp[m];
    }
}
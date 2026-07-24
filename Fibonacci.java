class Fibonacci {

    // recursion
    static int fibRec(int x) {
        if (x == 1) {
            return 0;
        }
        if (x == 2) {
            return 1;
        }
        return fibRec(x - 1) + fibRec(x - 2);
    }

    // memoization (top to down/ dest to source)
    static int topDownApproach(int x, int[] dp) {
        if (x == 1)
            return 0;
        if (x == 2)
            return 1;

        if (dp[x] != 0) {
            return dp[x];
        }

        dp[x] = topDownApproach(x - 1, dp) + topDownApproach(x - 2, dp);
        return dp[x];
    }

    // tabulation - (source to destination)
    static int bottomUpApproach(int x) {
        if(x==1) return 0;

        int[] dp = new int[x + 1];
        dp[1] = 0;
        dp[2] = 1;
        
        for (int i = 3; i <= x; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[x];
    }

    public static void main(String[] args) {
        System.out.println(fibRec(10));

        System.out.println(topDownApproach(10, new int[26]));

        System.out.println(bottomUpApproach(2));
    }

}
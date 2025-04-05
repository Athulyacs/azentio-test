import java.util.Arrays;

public class lds {
    public static int findLDS(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1); // Each element is an LDS of length 1 by itself

        int maxLDS = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
            maxLDS = Math.max(maxLDS, dp[i]);
        }

        return maxLDS;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 6, 2, 8, 1};
        System.out.println("Length of Longest Decreasing Subsequence: " + findLDS(arr));
    }
}

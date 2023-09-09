
public class CombinationSumIV {
    public int combinationSum4(int[] nums, int target) {
        if (target < 0)
            return 0;
        if (target == 0)
            return 1;

        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= target; i++) {
            int counter = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i - nums[j] >= 0) {
                    counter += dp[i - nums[j]];
                }
            }
            dp[i] = counter;
        }
        return dp[target];
    }
}
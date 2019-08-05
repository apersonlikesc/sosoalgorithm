package nowcoder;

public class solution10_4 {
    public int JumpFloorII(int target) {
        return (int) Math.pow(2, target - 1);
    }
}
//    public int JumpFloorII(int target) {
//        int[] dp = new int[target];
//        Arrays.fill(dp, 1);
//        for (int i = 1; i < target; i++)
//            for (int j = 0; j < i; j++)
//                dp[i] += dp[j];
//        return dp[target - 1];
//    }
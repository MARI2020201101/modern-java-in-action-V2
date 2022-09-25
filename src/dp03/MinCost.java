package dp03;

import java.util.Arrays;

class MinCost {
    static int[][] cost = {
            {0,10,75,94},
            {-1,0,35,50},
            {-1,-1,0,80},
            {-1,-1,-1,0}
    };
    static int[] dp = new int[4];

    static void minCost(){
        dp[0] = cost[0][0];
        dp[1] = cost[0][1];
        for(int i = 2; i < dp.length ; i++){
            int min = Math.min(cost[i - 1][i], cost[i][i - 1]);
            dp[i] = dp[i-1] + min;
        }
        System.out.println(Arrays.toString(dp));
    }

    public static void main(String[] args) {
        minCost();
    }
}

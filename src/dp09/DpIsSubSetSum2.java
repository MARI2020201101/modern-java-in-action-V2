package dp09;

class DpIsSubSetSum2 {
    public static void main(String[] args) {
        isSubSetSum(6);
    }
    static int[] arr = {3,2,7,1};
    static int isSubSetSum(int n){
        int[][] dp = new int[arr.length][n+1];

        for(int i=0; i<dp.length ; i++){
            if(arr[i] <=n) dp[0][arr[i]]=1;
        }
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if(arr[i] <=n) dp[i][arr[i]] = 1;
                if(dp[i-1][j]==1) dp[i][j]=1;
                if(dp[i-1][j]==1 && j+arr[i]<=n) dp[i][j]=1;
            }
        }
        print(dp);
        return 1;
    }
    private static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

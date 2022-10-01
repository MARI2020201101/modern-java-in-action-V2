package dp09;

class DpIsSubSetSum {
    public static void main(String[] args) {
        isSubSetSum(6);
    }
    static int[] arr = {3,2,7,1};
    static int isSubSetSum(int n){
        int[][] dp = new int[arr.length][n+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(arr[i]<n) dp[i][arr[i]]=1;
                if(i>0 && dp[i-1][j]==1){
                    dp[i][j]=1;
                    if(j+arr[i]<=n){
                        dp[i][j+arr[i]] = 1;
                    }
                }
                else dp[i][j]=0;
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

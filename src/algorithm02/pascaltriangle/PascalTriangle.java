package algorithm02.pascaltriangle;

import java.util.Arrays;

class PascalTriangle {
    static long[][] memo = new long[50][50];
    static int FILL = 45;
    static long[] pascalRow = new long[FILL + 1];
    static long[] coins = {10000,5000,2000,1000,500,100,50,10,5,1};
    public static void main(String[] args) {
        setUp();
        for(int i=0; i <= FILL ; i++){
            pascalRow[i] = nCr(FILL,i);
        }
        int coinCount = 0;

        for (int i = 0; i < FILL; i++) {
            int j = 0;
            long remain = -1;
            while(remain != 0){
                long share = Math.abs(pascalRow[i] / coins[j]);
                remain = pascalRow[i] % coins[j];
                coinCount += share;
                j++;
            }
        }
        System.out.println(coinCount);
    }



    static void setUp(){
        for(int i =0; i< memo.length; i++){
            for (int j = 0; j < memo[i].length; j++) {
                memo[i][j] = 0;
            }
        }
        for(int i=0; i< memo.length; i++){
            memo[i][0] = 1;
            memo[i][i] = 1;
        }

    }

    static long nCr(int n, int r){
        if(memo[n][r] != 0) return memo[n][r];
        memo[n][r] = nCr(n-1, r) + nCr(n-1, r-1);
        return memo[n][r];
    }
    static void print(){
        for(int i =0; i< memo.length; i++){
            for (int j = 0; j < memo[i].length; j++) {
                System.out.print(memo[i][j]);
            }
            System.out.println();
        }
    }
}

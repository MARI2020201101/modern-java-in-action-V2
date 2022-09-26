package dp05;

class MemoMinCost {
    static int[][] cost = {
            {1,3,5,8},
            {4,2,1,7},
            {4,3,2,3}
    };
    static int[][] memo = new int[cost.length][cost[0].length];
    public static void main(String[] args) {
        setUp();
        System.out.println(solve(2,3));
    }
    static void setUp(){
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                if(i==0 && j==0) memo[i][j]=cost[i][j];
                else if(i==0) memo[i][j]+=cost[i][j-1] + cost[i][j];
                else if(j==0) memo[i][j]+=cost[i-1][j] + cost[i][j];
                else memo[i][j]=0;
            }
        }
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                System.out.print(memo[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int solve(int p, int q){
        if(memo[p][q]!=0) return memo[p][q];

         memo[p][q] = Math.min(solve(p-1,q), solve(p,q-1)) + cost[p][q];
         return memo[p][q];
    }
}

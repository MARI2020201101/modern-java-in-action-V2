package dp05;

class DpMinCost {
    static int[][] cost = {
            {1,3,5,8},
            {4,2,1,7},
            {4,3,2,3}
    };
    static int[][] memo = new int[cost.length][cost[0].length];
    public static void main(String[] args) {
        System.out.println(solve(2,3));
        print();
    }
    static void print(){
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                System.out.print(memo[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int solve(int p, int q){
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[0].length; j++) {
                if(i==0 && j==0) memo[i][j] = cost[i][j];
                else if(i==0) memo[i][j] += memo[i][j-1] + cost[i][j];
                else if(j==0) memo[i][j] += memo[i-1][j] + cost[i][j];
                else memo[i][j] = Math.min(memo[i][j-1], memo[i-1][j]) + cost[i][j];
            }
        }
        return memo[p][q];
    }
}

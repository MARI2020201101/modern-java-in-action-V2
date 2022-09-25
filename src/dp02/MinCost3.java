package dp02;

class MinCost3 {
    static int[][] cost = {
            {0,10,75,94},
            {-1,0,35,50},
            {-1,-1,0,80},
            {-1,-1,-1,0}
    };
    static int[][] memo = new int[4][4];
    static void setUp(){
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo.length; j++) {
                if(i==j) memo[i][j] = 0;
                else if(i==j-1) memo[i][j] = cost[i][j];
                else memo[i][j] = -1;
            }
        }
    }
    static int minCost(int s, int d){
        if(s==d || s == d-1) return memo[s][d];
        int min = Integer.MAX_VALUE;
        for(int i = s+1; i < d; i++){
            int tmp = minCost(s, i) + minCost(i, d);
            if(tmp < min) min = tmp;
        }
        memo[s][d] = min;
        return memo[s][d];
    }

    public static void main(String[] args) {
        setUp();
        System.out.println(minCost(0,3));
    }
}

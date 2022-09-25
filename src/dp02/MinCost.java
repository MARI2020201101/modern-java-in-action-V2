package dp02;

class MinCost {
    static int[][] cost = {
            {0,10,75,94},
            {-1,0,35,50},
            {-1,-1,0,80},
            {-1,-1,-1,0}
    };

    static int minCost(int s, int d){
        if(s==d || s==d-1) return cost[s][d];

        cost[s][d] = Math.min(cost[s][d - 1], cost[s - 1][d]);

        return minCost(s, d-1);
    }
    public static void main(String[] args) {
        System.out.println(minCost(0, 3));
    }
}

package dp02;

class MinCost2 {
    static int[][] cost = {
            {0,10,75,94},
            {-1,0,35,50},
            {-1,-1,0,80},
            {-1,-1,-1,0}
    };

    static int minCost(int s, int d){
        if(s==d || s == d-1) return cost[s][d];
        int min = Integer.MAX_VALUE;
        for(int i = s+1; i < d; i++){
            int tmp = minCost(s, i) + minCost(i, d);
            if(tmp < min) min = tmp;
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println(minCost(0,3));
    }
}

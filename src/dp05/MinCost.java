package dp05;

class MinCost {
    static int[][] cost = {
        {1,3,5,8},
        {4,2,1,7},
        {4,3,2,3}
    };

    public static void main(String[] args) {
        System.out.println(solve(2,3));
    }
    static int solve(int p, int q){
        System.out.println(String.format("p=%d , q=%d",p,q));
        if(p<=0 && q <=0) return cost[p][q];
        else if(p==0){
            return solve(p,q-1) + cost[p][q];
        }
        else if(q==0){
            return solve(p-1,q) + cost[p][q];
        }
        return Math.min(solve(p-1, q), solve(p, q-1)) + cost[p][q];
    }
}

package algorithm01;

class FactorialWithCombination {
    static int[] memo = new int[100];
    public static void main(String[] args) {
        setUp();
        System.out.println(npr(5,2));
        System.out.println(ncr(5,2));
    }
    static void setUp(){
        memo[0] = 1;
    }
    static int fac(int n){
        if(memo[n] != 0) return memo[n];
        else {
            memo[n] = fac(n-1) * n;
            return memo[n];
        }
    }
    static int npr(int n, int r){
        return fac(n)/fac(n-r);
    }
    static int ncr(int n, int r){
        return npr(n,r)/npr(r,r);
    }
}

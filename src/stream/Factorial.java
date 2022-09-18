package stream;

class Factorial {
    static int[] memo = new int[100];
    public static void main(String[] args) {
        memo[0] = 1;
        System.out.println(fac(5));
    }
    static int fac(int n){
        if(memo[n] != 0) return memo[n];
        else {
            System.out.println("memo["+n+"] = memo["+(n-1)+"] * "+n+" ");
            memo[n] = fac(n-1) * n;
            return memo[n];
        }
    }

}

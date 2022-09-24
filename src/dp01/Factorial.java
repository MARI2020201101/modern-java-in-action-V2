package dp01;

class Factorial {
    static int recurFac(int n){
        return (n<=1 ? 1 : n*recurFac(n-1));
    }
    static int fac(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(recurFac(4));
        System.out.println(fac(4));
    }
}

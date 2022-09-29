package algorithm03.gcd;

class GcdFraction {
    public static void main(String[] args) {
        System.out.println(fraction());
    }
    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    static int N = 1234567;

    static int fraction(){
        int result = 0;
        for (int i = 1; i < N / 2; i++) {
            int j=N-i;
            if(gcd(i,j)==1) result++;
        }
        return result;
    }
}


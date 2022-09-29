package algorithm03.gcd;

class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(86,20));
        System.out.println(gcd(14,9));
    }
    static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}


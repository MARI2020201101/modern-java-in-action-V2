package dp01;

class Pow {
    static int pow(int n, int r){
        if(r<1) return 1;
        return n*pow(n, r-1);
    }
    public static void main(String[] args) {
        System.out.println(pow(2,4));
    }
}

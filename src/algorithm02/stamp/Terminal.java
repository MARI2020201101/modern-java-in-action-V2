package algorithm02.stamp;

class Terminal {
    static int N = 43;
    public static void main(String[] args) {
        System.out.println(pow(1,17));
    }
    static int pow(int a, int b){
        int n = Math.abs(a - b);
        return (1 << (n-1)) + (1 << (N-n-1))-1;
    }
}

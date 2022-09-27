package dp06;

class CountWays {
    public static void main(String[] args) {
        System.out.println(count(5));
    }
    static int count(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        return count(n-1) + count(n-2);
    }
}

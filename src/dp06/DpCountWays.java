package dp06;

class DpCountWays {
    public static void main(String[] args) {
        System.out.println(count(5));
    }
    static int count(int n){
        int prev = 1;
        int curr = 0;
        int next = 0;
        for(int i = 0 ; i < n ; i++){
            next = prev + curr;
            curr = prev;
            prev = next;
        }
        return next;
    }
}

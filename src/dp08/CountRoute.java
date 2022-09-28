package dp08;

class CountRoute {
    public static void main(String[] args) {
        System.out.println(count(2,2));
    }
    static int count(int p, int q){
        if(p==0 && q==0) return 0;
        if(p==0 || q==0) return 1;
        return count(p-1,q) + count(p, q-1);
    }
}

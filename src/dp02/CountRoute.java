package dp02;

class CountRoute {

    static int count(int n, int m){
        //nPn * nPn 으로 구할수도 있나?
        if(n==0&&m==0) return 0;
        if(n==0 || m==0) return 1;
        return count(n-1, m) + count(n, m-1);
    }

    public static void main(String[] args) {
        System.out.println(count(3,3));
    }
}

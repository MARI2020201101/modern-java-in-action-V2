package algorithm01;

class Ncr {

    public static void main(String[] args) {
        System.out.println(ncr(5,2));
    }
    static int ncr(int n, int r){
        int result = 1;
        for(int i = n-(r-1) ; i <= n ; i++){
            result*=i;
        }
        for(int i = 1; i <= r ; i++){
            result/=i;
        }
        return result;
    }
}

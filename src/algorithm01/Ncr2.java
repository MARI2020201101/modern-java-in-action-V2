package algorithm01;

class Ncr2 {
    static int[][] memo = new int[50][50];
    public static void main(String[] args) {
        setUp();
        System.out.println(ncr(5,2));
        print();

    }
    static void setUp(){
        for(int i = 0; i<memo.length; i++){
            memo[i][0] = 1;
            memo[0][i] = 1;
        }
        for(int i = 0 ;i < memo.length ; i++){
            memo[i][i] = 1;
        }
    }
    static void print(){
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                System.out.print(memo[i][j]);
            }
            System.out.println();
        }
    }
    static int ncr(int n , int r){
        if(memo[n][r] != 0) return memo[n][r];
        else{
            memo[n][r] = ncr(n-1, r-1) + ncr(n-1 , r);
            return memo[n][r];
        }
    }
}

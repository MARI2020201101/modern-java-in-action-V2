package stream;

class Memoization {
    static int M = 10;
    static int N = 100;
    static int[][] memo = new int[N+1][M+1];
    public static void main(String[] args) {
        setUp();
        int result = check(N, 2);
        System.out.println("result : " + result);
    }

    static void setUp(){
        for (int i = 0; i < N+1 ; i++) {
            for (int j = 0; j < M+1 ; j++) {
                memo[i][j]= -1;
            }
        }
    }
    static int check(int remain, int pre){

        if(remain < 0) return 0;
        else if(remain == 0) return 1;
        else if(memo[remain][pre] != -1) return memo[remain][pre];
        else{
            int cnt = 0;
            for(int i = pre; i <= M; i++){
                System.out.println("check(reamin-"+i+", "+i+") ");
                cnt += check(remain-i, i);
            }
            memo[remain][pre] = cnt;
            return memo[remain][pre];
        }
    }
}

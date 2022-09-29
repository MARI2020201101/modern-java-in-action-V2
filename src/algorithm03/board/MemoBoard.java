package algorithm03.board;

class MemoBoard {
    public static void main(String[] args) {
        System.out.println(board(32,6));
    }
    static long result = 0;
    static int N = 32;
    static int LIMIT = 6;
    static int[][] memo = new int[N][LIMIT];
    static long board(int n, int limit){
        for(int i=0; i<limit; i++){
            memo[0][i] = 1;
        }
        if(n==0) return memo[n][limit];

        for(int i = 1; i <= limit ; i++){
            if(n-i>=0) memo[n-i][i]+=board(n-i, limit);
        }
        return result;
    }
}


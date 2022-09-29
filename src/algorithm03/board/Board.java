package algorithm03.board;

class Board {
    public static void main(String[] args) {
        System.out.println(board(32,6));
    }
    static long result = 0;
    static long board(int n, int limit){
        if(n==0) return 1;

        for(int i = 1; i <= limit ; i++){
            if(n-i>=0) result+=board(n-i, limit);
        }
        return result;
    }
}


package algorithm03.board;

class Board {
    public static void main(String[] args) {
        System.out.println(board(5,3));
    }
    static long board(int n, int limit){
        if(n==0) return 1;
        int result = 0;
        for(int i = 1; i <= limit ; i++){
            System.out.println(String.format("board(%d , %d)",n-i,limit));
            if(n-i>=0) result+=board(n-i, limit);
        }
        return result;
    }
}


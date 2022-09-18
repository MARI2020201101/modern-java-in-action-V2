package stream;

class DynamicProgramming {
    static int M = 10;
    static int N = 100;
    static int[][] memo = new int[N+1][M+1];
    public static void main(String[] args) {
        setUp();
        check();
        print();
    }

    static void print(){
        for (int i = 0; i < N+1 ; i++) {
            for (int j = 0; j < M+1 ; j++) {
                System.out.print(memo[i][j]);
            }
            System.out.println();
        }
    }
    static void setUp(){
        for (int i = 0; i < N+1 ; i++) {
            for (int j = 0; j < M+1 ; j++) {
                if(j == 0) memo[i][j] = 1;
                else memo[i][j] = 0;
            }

        }
    }
    static void check(){
        for (int i = 1; i < N+1; i++) {
            for (int j = 2; j < M + 1; j++) {
                if(i>=2&&j>=i) memo[i][j] = memo[i][j-1];
                if(i > 2) memo[i][j]+=memo[i-1][j];
            }
        }
    }
}

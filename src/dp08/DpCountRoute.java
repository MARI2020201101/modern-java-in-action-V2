package dp08;

class DpCountRoute {
    public static void main(String[] args) {
        count(3,4);
    }
    static void count(int p, int q){
        int[][] arr = new int[p + 1][q + 1];

        for(int i = 0; i< p ;i++){
            for (int j = 0; j < q; j++) {
                if(i==0 && j==0) arr[i][j] = 0;
                else if(i==0 || j==0) arr[i][j]=1;
                else arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        for(int i = 0; i< p ;i++){
            for (int j = 0; j < q; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
}

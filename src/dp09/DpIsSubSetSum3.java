package dp09;

class DpIsSubSetSum3 {
    static int[] arr = {3,2,7,1};

    public static void main(String[] args) {
        isSubSetSum(6);
    }
    static boolean isSubSetSum(int n){
        boolean[][] subsum = new boolean[arr.length+1][n + 1];
        for (int i = 0; i < subsum.length; i++) {
            for (int j = 0; j < subsum[0].length; j++) {
                subsum[i][j]=false;
            }
        }
        for(int i = 0; i < subsum.length ; i++){
            subsum[i][0]=true;
        }
        for (int i = 1; i <= n; i++) {
            if(arr[0] == i) subsum[0][i] = true;
            else subsum[0][i] = false;
        }
        for(int i = 1; i<subsum.length; i++){
            int v = arr[i-1];
            for (int j=1; j <=n ; j++){
                if(j < v) subsum[i][j] =subsum[i-1][j];
                else if(subsum[i-1][j]) subsum[i][j] = true;
                else subsum[i][j] = subsum[i-1][j-v];
            }
        }
        print(subsum);
        return subsum[subsum.length-1][subsum[0].length-1];
    }
    private static void print(boolean[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]) System.out.print("T ");
                else System.out.print("F ");
            }
            System.out.println();
        }
    }
}

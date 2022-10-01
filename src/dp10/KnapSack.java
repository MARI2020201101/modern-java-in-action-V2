package dp10;

class KnapSack {
    static int[] weight = {0,2,3,4,5};
    static int[] value = {0,3,4,5,6};
    static int capacity = 5;

    public static void main(String[] args) {
        knapSack();
    }
    static int knapSack(){
        int objectCnt = weight.length;
        int[][] arr = new int[objectCnt][capacity+1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length;  j++) {
                arr[i][j] = 0;
            }
        }


        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if(weight[i] <= j){
                    int x = j - weight[i];
                    arr[i][j] = Math.max(arr[i][j], value[i]+arr[i-1][x]);
                }
                else arr[i][j] = arr[i-1][j];
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[0].length;  j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr[objectCnt-1][capacity-1];
    }
}

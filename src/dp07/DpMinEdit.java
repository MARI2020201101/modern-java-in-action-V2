package dp07;

class DpMinEdit {
    public static void main(String[] args) {
        System.out.println(minEdit("SUNDAY", "SATURDAY"));

    }
    static int minEdit(String a, String b){
        int[][] arr = new int[a.length() + 1][b.length() + 1];
        for(int i = 0; i < arr.length;i++){
            arr[i][0] = i;
        }
        for(int i=0; i<arr[0].length ; i++){
            arr[0][i] = i;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if(a.charAt(i-1) == b.charAt(j-1)) {
                    arr[i][j]=Math.min(arr[i-1][j-1], Math.min(arr[i-1][j],arr[i][j-1]));
                }else{
                    arr[i][j]=Math.min(arr[i-1][j-1], Math.min(arr[i-1][j],arr[i][j-1])) + 1;
                }
            }

        }

        print(arr);
        return arr[a.length()][b.length()];
    }

    private static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

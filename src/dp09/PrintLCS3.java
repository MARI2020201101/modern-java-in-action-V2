package dp09;

class PrintLCS3 {
    public static void main(String[] args) {
        System.out.println(lcs("ABCDE", "ABQDS"));
        System.out.println(lcs("AGTTACG", "ABBTG"));

    }
    static int lcs(String a, String b){
        int[][] arr = new int[a.length()+1][b.length()+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 0;
        }
        for (int i = 0; i < arr[0].length; i++) {
            arr[0][i] = 0;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if(a.charAt(i-1)==b.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1] + 1;
                }
                else arr[i][j] =  Math.max(arr[i-1][j],arr[i][j-1]);
            }
        }
        print(a,b,arr);
        return arr[a.length()][b.length()];
    }
    static void print(String a, String b, int[][] arr){
        int lcsLength = arr[a.length()+1][b.length()+1];
        char[] chars = new char[lcsLength];

    }
}

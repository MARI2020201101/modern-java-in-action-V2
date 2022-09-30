package dp09;

class DpInterleaving {
    public static void main(String[] args) {
        interleaving("bcc","bbca", "bbcbcac");

    }

    static boolean interleaving(String a, String b, String c){
        boolean[][] arr = new boolean[a.length()+1][b.length()+1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = false;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i][0] = a.charAt(i-1) == c.charAt(i-1);
        }
        for(int i=1; i<arr[0].length; i++){
            arr[0][i] = b.charAt(i-1) == c.charAt(i-1);
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if(c.charAt(i+j-2) == a.charAt(i-1)){
                    arr[i][j] = arr[i-1][j];
                }
                if(c.charAt(i+j-2) == b.charAt(j-1)){
                    arr[i][j] = arr[i][j-1];
                }
                if(c.charAt(i+j-2)  == a.charAt(i-1) && c.charAt(i+j-2) == b.charAt(j-1)){
                    arr[i][j] = (arr[i-1][j] || arr[i][j-1]);
                }
            }
        }

        print(arr);
        return false;
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

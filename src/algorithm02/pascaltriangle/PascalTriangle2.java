package algorithm02.pascaltriangle;

import java.util.Arrays;

class PascalTriangle2 {
    public static void main(String[] args) {
        setArr(10);
    }

    static int count(int n){
        int[] coins={10000,5000,2000,1000,500,100,50,10,5,1};
        int result=0;
        for(int i =0; i< coins.length; i++){
            result+=n/coins[i];
            n=n%coins[i];
        }
        return result;
    }
    static void setArr(int n){
        int[] arr = new int[n+1];
        arr[0] = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("arr["+j+"]+=arr["+(j-1)+"] ");
                arr[j] += arr[j-1];
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}

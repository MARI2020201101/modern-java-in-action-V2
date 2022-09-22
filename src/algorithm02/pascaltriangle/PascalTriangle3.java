package algorithm02.pascaltriangle;

import java.util.Arrays;

class PascalTriangle3 {
    static int N = 45;
    public static void main(String[] args) {
        long[] arr = setArr(N);
        int total = 0;
        for(int i=0; i <= N; i++){
            total+=count(arr[i]);
        }
        System.out.println("total : "+ total);
    }

    static long count(long n){
        int[] coins={10000,5000,2000,1000,500,100,50,10,5,1};
        long result=0;
        for(int i = 0; i < coins.length; i++){
            result += n / coins[i];
            n = n % coins[i];
        }
        return result;
    }
    static long[] setArr(int n){
        long[] arr = new long[n+1];
        arr[0] = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j > 0 ; j--) {
                arr[j] += arr[j-1];
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

}

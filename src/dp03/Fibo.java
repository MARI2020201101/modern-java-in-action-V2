package dp03;

import java.util.Arrays;

class Fibo {
    static void fibo(){
        long[] arr = new long[50];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i <arr.length ; i++){
            arr[i]= arr[i-1] + arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        fibo();
    }
}

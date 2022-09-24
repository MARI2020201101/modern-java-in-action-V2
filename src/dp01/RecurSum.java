package dp01;

import java.util.Arrays;

class RecurSum {
    static int[] result = new int[6];
    static int[] recurSum(int[] arr, int i){
        if(i < 1) return result;

        recurSum(arr, i-1);
        result[i] = arr[i] + result[i-1];
        return result;
    }
    static int[] sum(int[] arr){
        int len = arr.length;
        int[] result = new int[len];
        for(int i = 0; i < len; i++){
            result[i]=arr[i];
        }
        for(int j = 1; j < len; j++){
                result[j]+=result[j-1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        int[] sum = sum(arr);
        System.out.println(Arrays.toString(sum));

        result[0] = arr[0];
        int[] recurSum = recurSum(arr, arr.length - 1);
        System.out.println(Arrays.toString(recurSum));
    }
}

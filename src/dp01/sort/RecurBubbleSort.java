package dp01.sort;

import java.util.Arrays;

class RecurBubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,9,1,5,8};
        int[] sort = sort(arr, arr.length);
        System.out.println(Arrays.toString(sort));
    }
    static void swap(int[] arr,int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    static int[] sort(int[] arr, int n){
        if(n==0) return arr;
        for(int i = 0; i < n-1 ; i++){
            if(arr[i] > arr[i+1]) swap(arr, i, i+1);
        }
        return sort(arr, n-1);
    }
}

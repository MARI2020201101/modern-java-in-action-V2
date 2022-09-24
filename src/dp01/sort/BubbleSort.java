package dp01.sort;

import java.util.Arrays;

class BubbleSort {

    public static void main(String[] args) {
        int[] sort = sort(new int[]{3, 5, 9, 1, 2});
        System.out.println(Arrays.toString(sort));
    }

    static int[] sort(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr,int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}

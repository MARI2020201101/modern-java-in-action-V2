package dp09;

import java.util.Arrays;

class isSubSetSum {
    static int[] arr = {3,2,7,1};
    static int length = arr.length;

    public static void main(String[] args) {
        System.out.println(isSubsetSum(arr,0,6));
    }
    static boolean isSubsetSum(int[] arr, int n, int x){
        if(x==0) return true;
        if(n == length) return false;
        int[] newArr = Arrays.copyOfRange(arr, n, length);
        return (isSubsetSum(newArr, n+1,x) || isSubsetSum(newArr,n+1,x-arr[n]));
    }
}

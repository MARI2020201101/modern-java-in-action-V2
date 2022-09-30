package dp09;

import java.util.Arrays;

class isSubSetSum {
    static int[] arr = {3,2,7,1};

    public static void main(String[] args) {
        System.out.println(isSubSetSum(6, 0));
    }
    static boolean isSubSetSum(int n, int m){
        if(n==0) return true;
        if(n<0) return false;

        for (int i = m; i < arr.length; i++) {
            return isSubSetSum(n-arr[m], m+1) || isSubSetSum(n, m+1);
        }
        return false;
    }

}

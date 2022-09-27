package dp06;

class MaxSumRecur {
    static int[] arr = {-2,-3,4,-1,-2,1,5,-3};

    public static void main(String[] args) {
        System.out.println(maxSum(arr.length-1));
    }
    static int maxSum(int n){
        if(n==0) return Math.max(arr[0] , 0);
        return Math.max(maxSum(n-1) + arr[n], arr[n]);
    }
}

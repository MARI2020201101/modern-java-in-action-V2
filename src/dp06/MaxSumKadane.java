package dp06;

class MaxSumKadane {
    static int[] arr = {-2,-3,4,-1,-2,1,5,-3};

    public static void main(String[] args) {
        System.out.println(maxSum());
    }
    static int maxSum(){
        int maxSum = 0;
        int tmpSum = 0;
        for(int i = 0; i < arr.length ; i++){
            tmpSum+=arr[i];
            System.out.println("tmpSum = "+ tmpSum);
            if(tmpSum < 0) tmpSum = 0;
            maxSum = Math.max(maxSum, tmpSum);
        }
        return maxSum;
    }
}

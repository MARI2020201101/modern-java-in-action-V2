package dp06;

class MaxSums {
    static int[] arr = {-2,-3,4,-1,-2,1,5,-3};

    public static void main(String[] args) {
        System.out.println(maxSum());
    }
    static int maxSum(){
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int tmpMax = 0;
            for(int j = i ; j < arr.length ; j++){
                tmpMax+=arr[j];
                max = Math.max(max, tmpMax);
            }
        }
        return max;
    }
}

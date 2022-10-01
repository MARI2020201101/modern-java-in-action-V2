package dp10;

class Coin {
    public static void main(String[] args) {
        System.out.println(count(arr,arr.length, 65));
    }

    static int[] arr = {50, 20, 10, 5, 2, 1};
    static int count(int[] arr,int n, int wons){
        if(wons==0) return 1;
        int result=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] <= wons){
                int count = count(arr, n, wons - arr[i]);
                System.out.println("count "+count);
                result = Math.min(count,result);
            }
        }
        return result;
    }
}

package dp10;

import java.util.Arrays;

class MemoSplitSteal {
    public static void main(String[] args) {
        System.out.println(maxValue(4));
    }

    static int[] value = {0,1,5,8,9,10,17,17,20};
    static int N = 4;
    static int[] result = new int[N+1];


    static int maxValue(int n){
        if(n<=0) return 0;
        for(int i = 1; i <= n ; i++){
            if(result[i] != 0) return result[i];
            else result[i] = Math.max(result[i], value[i] + maxValue(n-i));
        }
        System.out.println(Arrays.toString(result));
        return result[n];
    }
}

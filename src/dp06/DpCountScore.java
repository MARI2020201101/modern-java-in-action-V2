package dp06;

import java.util.Arrays;

class DpCountScore {
    public static void main(String[] args) {
        System.out.println(count(13));
    }
    static int count(int n){
        int[] result = new int[n+1];
        result[0] = 1;
        for (int i = 0; i <= n; i++) {
            if(i-3>=0) result[i]+=result[i-3];
            if(i-5>=0) result[i]+=result[i-5];
            if(i-10>=0) result[i]+=result[i-10];
        }
        System.out.println(Arrays.toString(result));
        return result[n];
    }
}

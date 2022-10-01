package dp10;

import org.w3c.dom.ls.LSOutput;

class SplitSteal {
    public static void main(String[] args) {
        System.out.println(maxValue(4));
    }

    static int[] value = {0,1,5,8,9,10,17,17,20};
    static int N = 4;
    static int maxValue(int n){
        if(n<=0) return 0;
        int price = Integer.MIN_VALUE;
        for(int i = 1; i <= n ; i++){
            System.out.println(String.format("value[%d] + maxValue(%d)", i,n-i));
            price = Math.max(price, value[i] + maxValue(n-i));
        }
        return price;
    }
}

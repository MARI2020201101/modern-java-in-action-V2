package algorithm02.cardreverse;

import java.util.Arrays;

class CardReverse {
    static int[] cards = {0,1,2,3,4,5,6,7,8,9};
    static int N = 5;
    static void reverse(int start){
        int end = cards[start];
        String str = "";
        int idx = end;
        for(int i=start; i < start+end; i++){
            str += cards[i];
        }
        System.out.println(str);
        String reversed = Arrays.stream(str.split(""))
                .reduce("", (a, b) -> b + a);
        System.out.println(reversed);
        reversed.split("");

//        for(int i = start+end-1 ; i >=start ; i--){
//            cards[i] = sum/idx ;
//            sum-=cards[i];
//            idx--;
//        }
    }
    public static void main(String[] args) {
        reverse(3);
        System.out.println(Arrays.toString(cards));

    }
}

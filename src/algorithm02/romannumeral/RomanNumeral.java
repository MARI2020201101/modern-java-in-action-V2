package algorithm02.romannumeral;

import java.util.Arrays;

class RomanNumeral {
    static String[] romanNum = {"I", "V", "X", "L", "C", "D", "M" };
        // 1, 5, 10, 50, 100, 500, 1000
    public static void main(String[] args) {
        toRomanNum(115);
    }
    static void toRomanNum(int n){
        int[] roman = new int[17];
        int i = 0;
        while(n!=0){
            int remain = n%5;
            n/=5;
            roman[i++] = remain;
        }
        System.out.println(Arrays.toString(roman));
    }
}

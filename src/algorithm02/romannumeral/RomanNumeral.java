package algorithm02.romannumeral;

import java.util.Arrays;

class RomanNumeral {
    static String[] romanNum =
        {"I", "V", "X", "L", "C", "D", "M" };
        //1,   5,  10,  50,  100, 500, 1000
    public static void main(String[] args) {
        System.out.println(toRoman(3888));
    }
    static String convert(int n, String i, String v, String x){
        String result = "";
        if(n == 9) {
            result += i + x ;
        }
        else if (n == 4) {
            result += i + v;
        }
        else{
            for(int j = 0 ; j < n/5 ; j++){
                result += v;
            }
            n %= 5;
            for(int j=0; j< n; j++){
                result += i;
            }
        }
        return result;
    }
    static String toRoman(int n){
        int m = n/1000;
        n %= 1000;
        int c = n/100;
        n %= 100;
        int x = n/10;
        n %= 10;
        String result = "";
        for(int i = 0; i < m ; i++){
            result += "M";
        }
        result += convert(c, "C", "D", "M");
        result += convert(x, "X", "L", "C");
        result += convert(n, "I", "V", "X");
        return result;
    }
}

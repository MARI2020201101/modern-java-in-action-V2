package dp04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class MaxSubString2 {
    public static void main(String[] args) {
        char[] chars = "9430723".toCharArray();
        System.out.println(maxSubString2(chars));
        List<String> strings = "9430723".chars().mapToObj(c -> String.valueOf(c)).collect(Collectors.toList());
        System.out.println(maxSubString(strings));
    }
    static int maxSubString(List<String> chars){
        int max=0;
        for (int i = 0; i < chars.size(); i++) {
            for (int j = i+1; j < chars.size(); j+=2) {
                int len = j-i+1;
                if(len<=max) continue;

                int lSum=0;
                int rSum=0;
                for (int k = 0; k < len / 2; k++) {

                    lSum+=Integer.parseInt(String.valueOf(chars.get(i)));
                    rSum+=Integer.parseInt(String.valueOf(chars.get(i+k+len/2)));
                }
                if(lSum == rSum) max = len;
            }
        }
        return max;
    }
    static int maxSubString2(char[] chars){
        int max=0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j < chars.length; j+=2) {
                int len = j-i+1;
                if(len<=max) continue;

                int lSum=0;
                int rSum=0;
                for (int k = 0; k < len / 2; k++) {
                    System.out.println(String.format("l=%c, r=%c", chars[k],chars[k+len/2]));
                   lSum+=Integer.parseInt(String.valueOf(chars[k]));
                   rSum+=Integer.parseInt(String.valueOf(chars[k+len/2]));
                }
                if(lSum == rSum) max = len;
            }
        }
        return max;
    }
}

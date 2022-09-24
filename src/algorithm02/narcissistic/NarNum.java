package algorithm02.narcissistic;

import java.util.Arrays;

class NarNum {
    static int N = 8;
    static String[] narNums = new String[N];
    public static void main(String[] args) {
        int index = 0;
        for(int num = 8; index < N ; num++){
            String octaNum = Integer.toOctalString(num);
            String[] octaNums = octaNum.split("");
            int sum = 0;
            for (String s : octaNums) {
                sum += Math.pow(Integer.parseInt(s), octaNums.length);
            }
            String check = Integer.toOctalString(sum);
            if(check.equals(octaNum)){
                narNums[index++]=check;
            }
        }
        System.out.println(Arrays.toString(narNums));
    }
}

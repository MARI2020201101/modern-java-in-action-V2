package dp04;

class MaxSubString3 {

    public static void main(String[] args) {
        System.out.println(maxSubString("9430723"));
    }
    static int maxSubString(String str){
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j+=2) {
                int len = j-i+1;
                System.out.println(String.format("target : %s",str.substring(i,j+1)));
                if(len <= max) continue;

                int lSum = 0; int rSum=0;
                for (int k = 0; k < len/2; k++) {
                    lSum+=str.charAt(i+k) - '0';
                    rSum+=str.charAt(i+k+len/2) - '0';
                    System.out.println(String.format("lSum=%d, rSum=%d", lSum, rSum));
                }
                if(lSum == rSum) max = len;
            }
        }
        return max;
    }
    static int sum(String str){
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            num += (str.charAt(i) - '0');
        }
        return num;
    }
}

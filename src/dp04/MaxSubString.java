package dp04;

class MaxSubString {
    public static void main(String[] args) {
        System.out.println(maxSubStringLength("9430723"));
    }
    static int maxSubStringLength(String str){
        int max = 0;
        int length = str.length();
        for (int l = 0; l < length; l++) {
            for (int r = l+1; r < length ; r+=2) {
                int len = r-l+1;
                if(len <= max) continue;
                int lSum = 0; int rSum = 0;
                for(int k = 0; k < len/2; k++){

                    String lsub = str.substring(l, l + k);
                    String rsub = str.substring(l + k, l + k + len / 2);
                    System.out.println(String.format("lsub=%s, rsub=%s", lsub,rsub));


                    lSum += Integer.parseInt(str.substring(l,l+k)=="" ? "0" :lsub);
                    rSum += Integer.parseInt(str.substring(l+k,l+k+len/2) == ""? "0" :rsub);

                }
                if(lSum==rSum) max = len;

            }
        }
        return max;
    }
}

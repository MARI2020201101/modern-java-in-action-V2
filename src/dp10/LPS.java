package dp10;

class LPS {
    public static void main(String[] args) {
        System.out.println(lps("BBABCBCAB", 0, "BBABCBCAB".length()-1));
    }
    static int lps(String str, int start, int end){
        if(start > end) return 0;
        if(start==end) return 1;
        if(str.charAt(start) == str.charAt(end)){
            return lps(str, start+1, end-1) +2;
        }else{
            int left = lps(str, start + 1, end);
            int right = lps(str, start, end - 1);
            return Math.max(left, right);
        }
    }
}

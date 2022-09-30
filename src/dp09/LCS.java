package dp09;

class LCS {

    public static void main(String[] args) {
        System.out.println(lcs("ABCDE", "ABQDS"));
        System.out.println(lcs("AGTTACG", "ABBTG"));
    }
    static int lcs(String a, String b){
        if(a.isEmpty() || b.isEmpty()) return 0;

        if(a.charAt(a.length()-1) == b.charAt(b.length()-1)){
            return lcs(a.substring(0,a.length()-1), b.substring(0, b.length()-1)) +1;
        }
        return Math.max(lcs(a.substring(0, a.length()-1), b) , lcs(a, b.substring(0, b.length()-1)));
    }

}

package dp10;

class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("BBABCBCAB",0));
        System.out.println("max =" +max);
    }
    static int max = 0;
    static int palindrome(String a, int n){
        if(a.isEmpty()) return 0;
        for(int i=n; i< a.length(); i++){
            palindrome(a, n + 1);
            palindrome(a.substring(1), n + 1);
        }

        StringBuffer sb = new StringBuffer(a);
        String reverse = sb.reverse().toString();
        System.out.println(reverse);
        if(a.equals(reverse)) return a.length();
        else return 0;

    }
}

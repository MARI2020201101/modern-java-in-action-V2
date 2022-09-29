package dp09;

class Interleaving {


    public static void main(String[] args) {
        System.out.println(interleaving("bcc","bbca", "bbcbcac"));
        System.out.println(interleaving("yz","abcd", "abyczd"));
    }
    static boolean interleaving(String a, String b, String c){
        if(a.length() + b.length() != c.length()) return false;
        if(a.isEmpty() && b.isEmpty() && c.isEmpty()) return true;
        boolean result1 = false;
        boolean result2 = false;

        if(! a.isEmpty() && (a.charAt(0) == c.charAt(0))) {
            result1 = interleaving(a.substring(1), b, c.substring(1));
        }
        if(! b.isEmpty() && (b.charAt(0) == c.charAt(0))) {
            result2 = interleaving(a, b.substring(1), c.substring(1));
        }
        return (result1 || result2);
    }
}

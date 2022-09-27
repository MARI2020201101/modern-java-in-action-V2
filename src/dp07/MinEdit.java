package dp07;

class MinEdit {
    public static void main(String[] args) {
        System.out.println(minEdit("COMPUTER", "COMMUTER"));

        System.out.println(minEdit("SUNDAY", "SATURDAY"));
    }
    static int minEdit(String a, String b){
        if (a.isEmpty() && !b.isEmpty()) return b.length();
        if (! a.isEmpty() && b.isEmpty()) return a.length();
        if(a.isEmpty() && b.isEmpty()) return 0;

        if(a.charAt(0) == b.charAt(0)) return minEdit(a.substring(1), b.substring(1));
        else{
            int delete = minEdit(a.substring(1), b) + 1;
            int insert = minEdit(a, b.substring(1))+1;
            int convert = minEdit(a.substring(1), b.substring(1)) + 1;
            int min = Math.min(insert, Math.min(delete, convert));
            return min;
        }
    }
}

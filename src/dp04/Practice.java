package dp04;

class Practice {
    public static void main(String[] args) {
        String str ="9430723";
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            System.out.println("str.charAt("+i+") "+str.charAt(i));
            num += (str.charAt(i) - '0');
        }
        System.out.println(num);
    }
}

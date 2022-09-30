package dp09;

class PrintInterleaving2 {
    public static void main(String[] args) {
        print("AB", "XY");
    }
    static String str ="";
    static void print(String a, String b){
        if(a.isEmpty() && b.isEmpty()) {
            System.out.println(str);
        }
        if(! a.isEmpty()) {
            str+=a.substring(0,1);
            print(a.substring(1), b);
            str=str.substring(0, str.length()-1);
        }
        if(! b.isEmpty()){
            str+=b.substring(0,1);
            print(a, b.substring(1));
            str=str.substring(0, str.length()-1);

        }
    }
}

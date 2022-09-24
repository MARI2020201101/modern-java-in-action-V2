package dp01;

class Gugudan {
    public static void main(String[] args) {
        print(3);
        System.out.println("===");
        recurPrint(3,9);
    }
    static void print(int n){
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%d * %d = %d", n,i,(n*i)));
        }
    }
    static void recurPrint(int n, int r){
        if(r<0) return;
        recurPrint(n, r-1);
        System.out.println(String.format("%d * %d = %d", n,r,(n*r)));
    }
}

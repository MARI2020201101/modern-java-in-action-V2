package algorithm02.perimeter;

class Perimeter {
    static int N =11;
    static int q = 1;
    static int PI = Integer.parseInt("314159265358".substring(0,N+1));
    static int pow = (int) Math.pow(10, N);

    public static void main(String[] args) {
        while (true){
            if(q * PI / pow != q * (PI + 1) /pow){
                if(q * (PI +1)%pow > 0){
                    System.out.println(q);
                    break;
                }
            }
            q++;
        }
    }
}

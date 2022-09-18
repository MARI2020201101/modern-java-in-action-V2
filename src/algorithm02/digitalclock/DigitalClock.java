package algorithm02.digitalclock;

class DigitalClock {

    static int CLOCK = 6;
    public static void main(String[] args) {
        System.out.println(count(CLOCK, 10));

    }
    static int count(int n, int remain){
        if(remain < 0) return 0;
        else if(remain == 0) return 1;
        else{
            int cnt = 0;
            if(n==0 || n== 2 || n==5){
                for(int i = 0; i < 10; i++){
                    cnt+= count(n-1, remain-i);
                }
            }else if(n==1 || n==3){
                for(int i = 0; i < 5; i++){
                    cnt+= count(n-1, remain-i);
                }
            }else{
                for(int i = 0; i < 2; i++){
                    cnt+= count(n-1, remain-i);
                }
            }
            return cnt;
            }
        }
}


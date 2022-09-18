package algorithm02.digitalclock;

class DigitalClock2 {
    static int[] clock = {6,2,5,5,4,5,6,3,7,6};
    public static void main(String[] args) {
        System.out.println(solve(30));
    }
    static int count(int n){
        return clock[n/10] + clock[n%10];
    }
    static int solve(int n){
        int cnt = 0;
        for(int h = 0; h < 24; h++){
            for(int m = 0; m < 60; m++){
                for(int s = 0; s < 60; s++){
                    if(count(h) + count(m) + count(s) == n)
                        cnt++;
                }
            }
        }
        return cnt;
    }
}


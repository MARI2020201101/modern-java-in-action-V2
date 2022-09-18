package algorithm02.rockscissorspaper;

class LeftRightRSP {
    public static void main(String[] args) {
        System.out.println(rsp(100));
    }
    static int rsp(int n){
        int cnt = 0;
        for(int left = 0 ; left<=n ; left++){
            for(int right = 0 ; right <= (n-left) ; right++){
                int remain = n-left-right;
                if(left > right && left > remain){
                    cnt++;
                }
                else if(right > left && right > remain){
                    cnt++;
                }
                else if(remain > left && remain > right){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

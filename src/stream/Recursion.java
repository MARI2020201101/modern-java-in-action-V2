package stream;

class Recursion {
    static int M = 10;
    static int N = 100;
    public static void main(String[] args) {
        int result = check(N, 2);
        System.out.println("result : " + result);
    }

    //최소 2명 최대 10명
    static int check(int remain, int pre){
        if(remain < 0) return 0;
        else if(remain == 0) return 1; //카운트를 세므로 리턴값은 0아니면 1이다
        else{
            int cnt = 0;
            for(int i = pre; i <= M; i++){
                System.out.println("check(reamin-"+i+", "+i+") ");
                cnt += check(remain-i, i);
            }
            return cnt;
        }
    }
}

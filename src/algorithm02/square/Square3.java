package algorithm02.square;

class Square3 {

    public static void main(String[] args) {
        System.out.println(check20Square());
    }
    static int N = 20;
    static int check20Square(){
        int count = 0;
        for(int l = 1000; l > 0; l--){
            for(int s = l; s > 0 ; s--){
                if(countSquare(l,s,N)) count++;
            }
        }
        return count;
    }
    static boolean countSquare(int l, int s, int n){
        if(l == s) return false;
        if(n == 0) return true;
        else{
            if(l < s){
                int tmp = s;
                s = l;
                l = tmp;
            }
            int share = l/s;
            int remain = l%s;
            n = n-share;
            if(remain!=0) {
                return countSquare(s,remain,n);
            }
            return false;
        }
    }
}

package algorithm02.square;

class Square2 {

    public static void main(String[] args) {
        System.out.println(check20Square());
    }

    static int check20Square(){
        int count = 0;
        for(int l = 1000; l > 0; l--){
            for(int s = l; s > 0 ; s--){
                if(countSquare(l,s) == 20) count++;
            }
        }
        return count;
    }
    static int countSquare(int l, int s){
        if(l==s) return 1;
        int result = 0;
        if(l < s){
            int tmp = s;
            s = l;
            l = tmp;
        }
        int share = l/s;
        int remain = l%s;
        result += share;
        if(remain != 0) result += countSquare(s, remain);
        return result;
    }
}

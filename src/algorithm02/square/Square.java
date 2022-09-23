package algorithm02.square;

class Square {

    public static void main(String[] args) {
        System.out.println(check20Square());
    }

    static int check20Square(){
        int count = 0;
        for(int l = 1000; l > 0; l--){
            for(int s = l-1; s > 0 ; s--){
                if(countSquare(l,s)==20) count++;
            }
        }
        return count;
    }
    static int countSquare(int l, int s){
        int result = 1;
        while(l!=s){
            result++;
            int next = l - s;
            if(next < s){
                int tmp = s;
                s = next;
                next = tmp;
            }
            l = next;
        }
        return result;
    }
}

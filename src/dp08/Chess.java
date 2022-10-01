package dp08;

class Chess {
    static int[] X = {1,1,0,-1,-1,-1,0,1,1,1,-1,-1,2,2,-2,-2};
    static int[] Y = {0,-1,-1,-1,0,1,1,1,2,-2,2,-2,1,-1,1,-1};
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        System.out.println(count(3,4,7,7));
    }
    static int count(int s1, int s2, int e1, int e2){
        if(s1 == e1 && s2 == e2){
            return min;
        }
        int tmp = 0;
        for (int i = 0; i < X.length ; i ++){

            if(s1+X[i] >= 0 && s2+Y[i] >= 0 && s1+X[i] <= 7 && s2+Y[i] <= 7){
                tmp += count(s1+X[i], s2+Y[i],e1,e2);
                min=Math.min(tmp,min);
            }
        }

        return min;
    }
}

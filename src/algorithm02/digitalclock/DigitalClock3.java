package algorithm02.digitalclock;

public class DigitalClock3 {
    static int[] clock = {6,2,5,5,4,5,6,3,7,6};
    static int[] memo = new int[60];

    public static void main(String[] args) {
        System.out.println(solve(30));
    }
    static int countLights(int time){
        return clock[time / 10] + clock[time % 10];
    }
    static int solve(int targetLights){
        for(int i = 0; i< memo.length; i++){
            memo[i] = countLights(i);
        }
        int result = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    if(memo[h]+ memo[m]+ memo[s] == targetLights) result++;
                }
            }
        }
        return result;
    }
}

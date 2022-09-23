package algorithm02.narcissistic;

public class NarcissisticNumber {

    public static void main(String[] args) {
        System.out.println(toEightDigit(22));
        System.out.println(toTenDigit("26"));

        checkNarcissistic();
    }

    private static void checkNarcissistic() {
        int count=0;
        for(int i = 1; i < 8 ; i++){
            for (int j = 0; j < 8; j++) {
                int num = (int) (Math.pow(i,2) + Math.pow(j,2));

                String eightDigit = toEightDigit(num);
                if(eightDigit.equals(i+j+"")) {
                    System.out.println(eightDigit);
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    static int toTenDigit(String num){
        int oxta = Integer.parseInt(num);
        int result = 0;
        int digit = 0;
        int remain = 0;
        while(oxta!=0){
            remain = oxta % 10;
            result+= Math.pow(8,digit) * remain;
            digit++;
            oxta /= 10;
        }
        return result;
    }
    static String toEightDigit(int num){
        int share = num / 8;
        int remain = num % 8;
        String result = "";
        while(share != 0){
            result += String.valueOf(share);
            share = remain;
            share/=8;
        }
        result+=remain;
        return result;

    }
}

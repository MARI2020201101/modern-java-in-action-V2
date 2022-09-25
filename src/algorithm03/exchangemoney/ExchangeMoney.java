package algorithm03.exchangemoney;

class ExchangeMoney {
    static int[] wons={50000, 10000, 5000, 1000, 500, 100, 50, 10};

    public static void main(String[] args) {
        int result = 0;
        int dollar = 456780;

        while(dollar!=0){
            for(int i = 0; i < wons.length; i++){
                int share = dollar/wons[i];
                int remain = dollar%wons[i];
                result+=share;
                dollar=remain;
                }
            }
        System.out.println(result);
        }
}


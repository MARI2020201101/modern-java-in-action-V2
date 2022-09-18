package algorithm02.rockscissorspaper;

class RockScissorsPaper {
    public static void main(String[] args) {
        System.out.println(fight(100));
    }
    static int fight(int n){
        int cnt = 0;
        for(int rock =0; rock <= n ; rock++){
            for(int scissors = 0; scissors<=(n-rock) ; scissors++){
                int paper = n-rock-scissors;

                if(rock > scissors && rock > paper){
                    cnt++;
                }
                else if(scissors > rock && scissors > paper){
                    cnt++;
                }
                else if(paper > rock && paper > scissors){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

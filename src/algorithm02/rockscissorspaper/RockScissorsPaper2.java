package algorithm02.rockscissorspaper;

class RockScissorsPaper2 {
    public static void main(String[] args) {
        System.out.println(fight(100));
    }
    static int fight(int n){
        return (n+1)*n / 2;
    }
}

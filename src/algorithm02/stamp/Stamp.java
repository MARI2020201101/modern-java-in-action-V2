package algorithm02.stamp;

class Stamp {
    public static void main(String[] args) {
        int prev = 0;
        int curr = 1;
        int next = 0;

        for(int i = 0; i < 16; i ++){
            next = curr + prev;
            prev = curr;
            curr = next;
            System.out.println("i=" +i+" , "+ next);
        }
    }
}

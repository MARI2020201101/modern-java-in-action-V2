package dp06;

class CountScore {
    public static void main(String[] args) {
        System.out.println(count(13));
    }
    static int count(int score){
        if(score < 0) return 0;
        if(score == 0) return 1;
        return count(score-3) + count(score-5) + count(score-10);
    }
}


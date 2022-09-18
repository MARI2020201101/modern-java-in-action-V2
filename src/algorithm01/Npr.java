package algorithm01;

class Npr {
    public static void main(String[] args) {
        System.out.println(npr(5,3));
    }
    static int npr(int n, int r){
        int result = 1;
        for(int i = (n-(r-1)); i <= n ; i++){
            result*=i;
        }
        return result;
    }
}

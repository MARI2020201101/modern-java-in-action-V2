package prime;

class Eratosthenes {
    public static void main(String[] args) {
        prime(50);
    }
    static void prime(int n){
        int[] result = new int[n + 1];
        int i = 2;
        while(i <= Math.sqrt(n)){
            for (int j = 2; j <= n; j++) {
                if(i*j <= n) result[i*j] = -1;
            }
            i++;
        }
        print(result);
    }
    static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!= -1) System.out.print(i + ",");
        }
    }
}

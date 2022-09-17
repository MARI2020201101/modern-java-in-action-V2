package function;

import java.util.function.BiFunction;
import java.util.function.Function;

class Integrate {
    public static void main(String[] args) {
        Integer result = integrate((x) -> x + 10, 3, 7);
        System.out.println(result);
    }
    static Integer integrate(Function<Integer,Integer> bf, Integer a, Integer b){
        int x;
        int y;
        if(a.compareTo(b)>0){
            x = b; y = a;
        }else{
            x = a ; y = b;
        }
        return (bf.apply(y) + bf.apply(x)) * (y-x) / 2;
    }
}

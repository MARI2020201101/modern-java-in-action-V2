package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

class Pythagoras {
    public static void main(String[] args) {
        List<int[]> pythagorasInt = IntStream.rangeClosed(1, 100)
                .boxed()
                .flatMap(a ->
                        IntStream.rangeClosed(a, 100)
                                .filter(b -> Math.sqrt((a * a) + (b * b)) % 1 == 0)
                                .mapToObj(b -> new int[]{a, b, (int) Math.sqrt((a * a) + (b * b))})
                ).collect(toList());
        for (int[] p : pythagorasInt){
            System.out.println(p[0]+ " , "+ p[1] +" , "+ p[2]);
        }

    }
}
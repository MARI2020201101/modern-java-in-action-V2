package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Fibo {
    public static void main(String[] args) {
        List<int[]> fibo20 = Stream.iterate(new int[]{0, 1}
                        , n -> new int[]{n[1], n[0] + n[1]})
                .limit(20)
                .collect(toList());
        for (int[] p : fibo20){
            System.out.println(p[0]+ " , "+ p[1]);
        }
        System.out.println("----------------");
        List<Integer> fibos = Stream.iterate(new int[]{0, 1}
                        , n -> new int[]{n[1], n[0] + n[1]})
                .limit(20)
                .map(n -> n[0])
                .collect(toList());
        for(Integer i : fibos){
            System.out.print(i + " , ");
        }


    }
}

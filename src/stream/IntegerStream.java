package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class IntegerStream {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(0, 10).limit(3).boxed().collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("---");

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4);

        List<int[]> pairList = list1.stream()
                .flatMap(a -> list2
                        .stream()
                        .map(b -> new int[]{a, b}))
                .collect(Collectors.toList());

        for(int i = 0; i < pairList.size(); i++){
            int[] ints = pairList.get(i);
            System.out.println(ints[0] + " , " + ints[1]);
        }

        System.out.println("---");
        List<Integer> integerList = IntStream.range(0, 100).limit(3).boxed().collect(Collectors.toList());
        integerList.stream().forEach(System.out::println);


    }
}

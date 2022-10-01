package subset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Subset {
    public static void main(String[] args) {
        List<List<Integer>> subset = subset(List.of(1, 2, 3));
        int size = subset.size();
        System.out.println(size);
        subset.stream().forEach(System.out::println);
    }

    static List<List<Integer>> subset(List<Integer> list){
        if(list.size()==0) {
            List<List<Integer>> answer = new ArrayList<>();
            List<Integer> empty = new ArrayList<>();
            answer.add(empty);
            return answer;
        }
        Integer first = list.get(0);
        List<Integer> rest = list.subList(1, list.size());
        List<List<Integer>> listA = subset(rest);
        List<List<Integer>> listB = insertAll(first, listA);
        return concat(listA, listB);
    }

    private static List<List<Integer>> concat(List<List<Integer>> listA, List<List<Integer>> listB) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.addAll(listA);
        answer.addAll(listB);
        return answer;

    }

    private static List<List<Integer>> insertAll(Integer first, List<List<Integer>> lists) {
        List<List<Integer>> result = new ArrayList<>();
        for(List<Integer> list : lists){
            List<Integer> copy = new ArrayList<>();
            copy.add(first);
            copy.addAll(list);
            result.add(copy);
        }
        return result;
    }
}

package factory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Filter {
    public static void main(String[] args) {
        List<String> list = List.of("aaa", "bbbb","ccc", "dd","eeeee","fff");
        List<String> filteredList = filter(list, (s) -> s.getBytes().length == 3);
        filteredList.forEach(System.out::println);
    }

    static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> newList = new ArrayList<>();
        for(T element : list){
            if(p.test(element)){
                newList.add(element);
            }
        }
        return newList;
    }
}

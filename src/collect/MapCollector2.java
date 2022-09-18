package collect;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

class MapCollector2 {
    static List<Dish2> dishes;
    static{
        dishes = List.of(new Dish2("salmon", DishType2.FISH, 230 , false)
                , new Dish2("bream", DishType2.FISH, 200, false)
                , new Dish2("shrimp", DishType2.FISH, 180, false)
                , new Dish2("walnut", DishType2.NUT, 600, false)
                , new Dish2("almond", DishType2.NUT, 500, false)
                , new Dish2("cashew", DishType2.NUT, 560, false)
                , new Dish2("coffee", DishType2.DRINK, 10, true)
                , new Dish2("greentea", DishType2.DRINK, 15, true)
                , new Dish2("water", DishType2.DRINK, 0, true)
                , new Dish2("blacktea", DishType2.DRINK, 5, true));
    }

    public static void main(String[] args) {

        Map<Boolean, List<Dish2>> isVegiDish = dishes.stream()
                .collect(Collectors.partitioningBy(d -> d.isDrink));

        isVegiDish.forEach((key, value) -> System.out.println(key + " : " +value));


        System.out.println("----");


        Map<CaloriesType, Set<Dish2>> caloriesTypeDish = dishes.stream()
                .collect(groupingBy(
                        d -> {
                            if (d.calories > 400) return CaloriesType.HIGH;
                            else if (d.calories > 200) return CaloriesType.MED;
                            else return CaloriesType.LOW;
                        }
                        , Collectors.toSet()));

        caloriesTypeDish.forEach((key, value)->  System.out.println(key + " : " +value));


        System.out.println("----");


        Map<DishType2, Long> dishTypeCount = dishes.stream()
                .collect(groupingBy(Dish2::getDishType, counting()));

        dishTypeCount.forEach((key, value)->  System.out.println(key + " : " +value));
        //grouping 분할 함수 , collector
    }
}
enum CaloriesType{
    LOW, MED, HIGH
}
class Dish2{
    String name;
    DishType2 dishType;
    int calories;
    boolean isDrink;


    @Override
    public String toString() {
        return "Dish2{" +
                "name='" + name + '\'' +
                ", dishType=" + dishType +
                ", calories=" + calories +
                ", isDrink=" + isDrink +
                '}';
    }

    public DishType2 getDishType() {
        return dishType;
    }

    public int getCalories() {
        return calories;
    }

    public Dish2(String name, DishType2 dishType, int calories, boolean isDrink) {
        this.name = name;
        this.dishType = dishType;
        this.calories = calories;
        this.isDrink = isDrink;
    }
}

enum DishType2{
    FISH, NUT, DRINK
}

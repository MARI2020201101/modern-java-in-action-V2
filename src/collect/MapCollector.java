package collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

class MapCollector {
    static List<Dish> dishes;
    static{
        dishes = List.of(new Dish("salmon", DishType.FISH, 230)
                , new Dish("bream", DishType.FISH, 200)
                , new Dish("shrimp", DishType.FISH, 180)
                , new Dish("walnut", DishType.NUT, 600)
                , new Dish("almond", DishType.NUT, 500)
                , new Dish("cashew", DishType.NUT, 560)
                , new Dish("coffee", DishType.DRINK, 10)
                , new Dish("greentea", DishType.DRINK, 15)
                , new Dish("water", DishType.DRINK, 0)
                , new Dish("blacktea", DishType.DRINK, 5));
    }

    public static void main(String[] args) {
        Map<DishType, List<Dish>> dishtypesDish = dishes.stream()
                .collect(groupingBy(Dish::getDishType));
        for( DishType key : dishtypesDish.keySet() ){
            List<Dish> value = dishtypesDish.get(key);
            for(Dish d : value){
                System.out.println(key +" : "+ d);
            }
        }


    }
}
class Dish{
    String name;
    DishType dishType;
    int calories;

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", dishType=" + dishType +
                ", calories=" + calories +
                '}';
    }

    public DishType getDishType() {
        return dishType;
    }

    public int getCalories() {
        return calories;
    }

    public Dish(String name, DishType dishType, int calories) {
        this.name = name;
        this.dishType = dishType;
        this.calories = calories;
    }
}
enum DishType{
    FISH, NUT, DRINK
}

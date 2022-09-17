package factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

class Demo {

    static Map<String, Function<AppleColor, Apple>> appleFactory = new HashMap<>();
    static {
        appleFactory.put("RED", Apple::new);
        appleFactory.put("GREEN", Apple::new);
    }
    public static void main(String[] args) {
        Apple red = appleFactory.get("RED").apply(AppleColor.RED);
        System.out.println(red);

    }
}
class Apple{
    AppleColor color;

    public Apple(AppleColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color=" + color +
                '}';
    }
}
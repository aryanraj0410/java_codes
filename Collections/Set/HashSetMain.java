package Collections.Set;
import java.util.*;


public class HashSetMain {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();

        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("Mercedes"); //duplicate
        cars.add("Mazda");
        
        System.out.println(cars.contains("Volvo"));
        System.out.println(cars);
    }
}

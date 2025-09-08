package Collections.Map;
import java.util.*;


public class LinkedHashMapMain {
    public static void main(String[] args) {
        LinkedHashMap<String, String> cars = new LinkedHashMap<>();

        cars.put("Volvo", "X90");
        cars.put("Mahindra", "Thar");
        cars.put("Toyota", "Innova");
        cars.put("BMW", "M4");

        for(String i : cars.keySet()){
            System.out.print(i + " ");
        }
    }
}

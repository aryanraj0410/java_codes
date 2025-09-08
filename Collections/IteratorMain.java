package Collections;
import java.util.*;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Mahindra");

        Iterator<String> it = cars.iterator();

        while(it.hasNext()){
            String name = it.next();
            System.out.println(name);
        
        if(name.equals("Toyota")){
            it.remove();
        }
    }
    System.out.println("After removal: "+ cars);
    }
}

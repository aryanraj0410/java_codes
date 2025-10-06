package Collections.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> cars1 = new ArrayList<Integer>();

        cars.add("BMW");
        cars.add("Volve");
        cars.add("Mercedes");
        cars.add("Ford");
        
        cars.add(0, "Mahindra");

        cars.set(3,"TVS");
            System.out.println(cars);
        
        //cars.remove(3); to remove form point
        //cars.clear(); to remove all elements
        System.out.println(cars.size());

        //System.out.println(cars.get(2));
        Collections.sort(cars);

        // for( String i : cars){
        //     System.out.println(i);
        // }

        // for(int i = 0; i<cars.size(); i++){
        //     System.out.print(cars.get(i)+" ");
        // }

        Iterator <String> it = cars.iterator();
        System.out.println(it.next());
        
    }
}

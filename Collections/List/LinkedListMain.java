package Collections.List;
import java.util.*;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> bikes = new LinkedList<String>();

        bikes.add("Dominar");
        bikes.add("Pulser");
        bikes.add("GS 1250");
        bikes.add("Glamour");

        bikes.addFirst("Luna");
        bikes.addLast("Mopet");
        bikes.removeLast();

        for(String i : bikes){
            System.out.print(i + " ");
        }
    }
}

package Collections.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetMain {
    public static void main(String[] args) {
        LinkedHashSet<String> bikes = new LinkedHashSet<String>();

        bikes.add("Dominar");
        bikes.add("Bullet");
        bikes.add("Glamour");
        bikes.add("Pulser");

        for(String i : bikes){
            System.out.println(i);
        }
        
    }
}

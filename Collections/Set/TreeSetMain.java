package Collections.Set;

import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        TreeSet<String> bikes = new TreeSet<String>();

        bikes.add("Dominar");
        bikes.add("Bullet");
        bikes.add("Glamour");
        bikes.add("Hayabusa");

        for(String i : bikes){
            System.out.print(i+" ");
        }
    }
}

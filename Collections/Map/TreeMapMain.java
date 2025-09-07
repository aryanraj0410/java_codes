package Collections.Map;
import java.util.*;


public class TreeMapMain {
    public static void main(String[] args) {
        TreeMap<String, Integer> Employee = new TreeMap<>();

        Employee.put("Aryan", 556826653);
        Employee.put("Ayush", 548587458);
        Employee.put("Raj", 755526254);
        Employee.put("Ranjan", 775855555);

        for(int i : Employee.values()){
            System.out.print(i+ " ");
        }
    }
}

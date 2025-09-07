package Collections.Map;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();

        student.put(101, "Aryan");
        student.put(102, "Ayush");
        student.put(103, "Pratham");
        student.put(104, "Raj");

        student.put(104,"Aryan");

        

        for(int i : student.keySet()){
            System.out.println("Roll no. of " + student.get(i) + " is: " + i);
        }
    }
}

package Generics;

import java.util.*;
public class GenericCollection {
    public static void main(String[] args) {
        ArrayList<Integer> rollno = new ArrayList<Integer>();
        rollno.add(101);
        rollno.add(102);
        rollno.add(103);

        ArrayList<String> names = new ArrayList<String>();
        names.add("Aryan");
        names.add("Ayush");
        names.add("Raj");

        System.out.println(names);
        System.out.println(rollno);

    }
}

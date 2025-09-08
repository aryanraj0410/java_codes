package Generics;
import java.util.*;

class Box<T>{
    private T value;

    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Box<String> names = new Box<>();
        names.setValue("Aryan");
        System.out.println(names.getValue());


        Box<Integer> number = new Box<>();
        number.setValue(23442233);
        System.out.println(number.getValue());
    }
}

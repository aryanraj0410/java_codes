package Practice;

interface Animal{
    public void AnimalSound();
    public void sleep();
}

class Dog implements Animal{
    public void sleep(){
        System.out.println("Pig makes sound: ");
    }
    public void AnimalSound(){
        System.out.println("ZZzzzz");
    }
}


public class interfaceMain {
    public static void main(String[] args) {
        Dog myPig = new Dog();

        myPig.AnimalSound();
        myPig.sleep();
    }
}

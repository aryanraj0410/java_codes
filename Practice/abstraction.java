package Practice;

abstract class abstraction {
    public abstract void  AnimalSound();

    public void sleep(){
        System.out.println("Zzzzzz");
    }
}

class Pig extends abstraction{
    public void AnimalSound(){
        System.out.println("The Pig says: ");
    }
}

class main{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.AnimalSound();
        myPig.sleep();
    }
}


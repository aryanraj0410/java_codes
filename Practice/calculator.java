package Practice;

public class calculator {
    public static void main(String[] args) {
        int a = 5 ,b = 10;
        String operation = "Sub";

        switch(operation){
        case "Add":
            System.out.println(a+b);
            break;
        case "Sub":
            System.out.println(a-b);
            break;
        case "Mul":
            System.out.println(a*b);
            break;
        case "Div":
            System.out.println(a/b);
            break;
        }
    }    
}

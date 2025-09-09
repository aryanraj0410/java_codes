package Practice;

public class elementAtEvenOrOdd {
    public static void main(String ss[]){
        String[] elements = {"Java", "Selenium", "TestNG", "Maven", "Jenkins",
                            "Docker"};
        int evenIndex = 0, oddIndex = 1;
        int n = elements.length;
        //String[] even = new String[];
        for(int i=0 ; i<elements.length/2;i++){
            System.out.println(elements[evenIndex]);
            evenIndex = evenIndex + 2;
        }
        for(int i=0 ; i<elements.length/2;i++){
            System.out.println(elements[oddIndex]);
            oddIndex += 2;
        }
    }
}

// class Student{
//     String name;
//     int age;

//     public void printInfo(){
//     System.out.println(this.name);
//     System.out.println(this.age);
// }}

// public class learn {
//     public static void main(String args[]){
//         Student s1 = new Student();
//         s1.name = "Aryan";
//         s1.age = 21;

//         s1.printInfo();


//     }
// }

public class Employee{
    private String name;
    private float salary;


    //construter
    public Employee(String name, float salary){
        this.name = name;
        this.salary = salary;  
    }

    //getter
    public String getName(){
        return name;
    }
    public float getSalary(){
        return salary;
    }

    //setter
    public void displayDetails(){
        System.out.println("Employee: " +name);
        System.out.println("Salary: "+salary);
    }

    public static void main(String args[]){
        Employee e1 = new Employee("Aryan", 100000.0f);
        e1.displayDetails();
    }
}




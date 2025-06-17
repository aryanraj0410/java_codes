 package OOPS;


 public class Student{
        String name;
        int rno;
        String subject;
    
        public int getRno(){
            return rno;
        }

        public void setRno(int rno){
            this.rno = rno;
        }

        public Student(String name, int rno, String subject){
            this.name = name;
            this.rno = rno;
            this.subject = subject;
        }
 }
    


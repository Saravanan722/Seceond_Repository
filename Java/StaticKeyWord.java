import java.security.Principal;

public class StaticKeyWord {
    public static void main(String[] args) {
        student saravanan = new student();
        saravanan.rollNumber = 123456;
       saravanan.age = 16;
       saravanan.name = "Sravanan";
       System.out.println(saravanan.rollNumber);
       student suresh = new student();
       suresh.age=17;
       suresh.rollNumber = 1234567;
       suresh.name = "suresh";
       
              System.out.println(student.principal);
              System.out.println(student.course);


        
    }
    
}
class student{
    int rollNumber;
    String name;
    int age;
   static String course;
   static String principal;
    static{
        principal = "Anandu";
        course = "BE";
    }

    public student(){
        

    }
}

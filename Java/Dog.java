public class Dog {
    //Constructor
    public static void main(String[] args) {
        Jony dog1 = new Jony();
    
        System.out.println(dog1.color);

        
    }
    
}
class Jony{
    String breed ;
    int age ;
    String size;
    String color; 
    Jony(){
        breed ="jimy";
        age = 12;
        size = "Small";
        color = "Block";
        System.out.println("default constructor");
    }
    Jony( int a, String s){
        age = a;
        size = s;
        System.out.println("second constructor");

    }
    Jony(String b,String c){
        breed = b;
        color = c;
        System.out.println(" third constructor");

        
    }
    void sleeping(){
        System.out.println("dog is deep sleeping");
    }
    int eating( int age){
        return age;
    }
}

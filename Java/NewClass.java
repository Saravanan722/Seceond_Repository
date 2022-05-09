public class NewClass {
    public static void main(String[] args) {
        Hello obeject = new Hello(); 
    obeject.useMe(); 
    System.out.println(obeject.sub(10,10));
        
    }
    
}
class Hello{
void useMe(){
    System.out.println( "This Class is working perfectly");

      }
      int sub(int num,int num1){
          return num+num1;

      }
}
//OUT PUT
//This Class is working perfectly
//20
// class, object, method 

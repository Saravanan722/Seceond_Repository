public class AccesModifier {
    //public
    //private
    // protecte
    public static void main(String[] args) {
        methodOne();
       System.out.println(methodTwo(6,3,3)); 
       System.out.println(methedThree(3));
        
    }
   protected static void methodOne(){
        System.out.println("Saravanan Well Coding god work");
    }
    static int methodTwo(int number ,int number1,int number2){
        return number -number1 + number2;
    }
    private static double methedThree(double number){
        return number*number;
    }
    
}
// OUTPUT
//Saravanan Well Coding god work
//6
//9.0




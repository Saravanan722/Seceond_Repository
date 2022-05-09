public class ThisKeyword {
    public static void main(String[] args) {
        This obj = new This();
        
        obj.This1(1);
        
    }
    
}
 class This{
    int number;
     void This1(int number){
     this.number = number;
       System.out.println(number);
       

    }
}

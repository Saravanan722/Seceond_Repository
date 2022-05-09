// public class StarPattern2{
//     public static void main(String[] args) {
//         int alphabet = 65;
//         for(int row = 0; row <= 5; row++)
//         {
//             for(int column = 0; column <= row; column++){
//                 System.out.print((char)(alphabet)+" ");
//             }
//             alphabet++;
//             System.out.println();
//         }
        
        
//     }
// }


 public class StarPattern2{
         public static void main(String[] args) {
         int alphabet = 65;
         for(int row = 0; row <= 5; row++)
         {
             for(int column = 0; column <= row; column++){  

                 System.out.print((char)(alphabet ) + " ");
                 alphabet++;
             }
            
            System.out.println();
       }
        
        
  }
 }


// output
// A 
// B B 
// C C C 
// D D D D 
// E E E E E

// output
// A 
// B C 
// C D E 
// D E F G 
// E F G H I 
// F G H I J K 

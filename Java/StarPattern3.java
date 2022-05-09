public class StarPattern3 {
    
    public static void main(String[] args) {
            int alphabet = 65;
            for(int row = 0; row <= 5; row++)
            {
                for(int column = 0; column <= row; column++){
                    System.out.print((char)(alphabet + column)+" ");
                }
            
                System.out.println();
            }
            
            
                    int alphabet1 = 65;
                    for(int row = 5; row >= 0; row--)
                    {
                        for(int column = 0; column <= row-1; column++){
                            System.out.print((char)(alphabet1 +column)+" ");
                        }
                        
                        System.out.println();
                    }
                    
                    
                
            
        }
    }
    
        
    // output
// A
// A B 
// A B C 
// A B  C D 
// A B C D E 
// A B C D E F 
// A B C D E 
// A B C D 
// A B C 
// A B 
// A 



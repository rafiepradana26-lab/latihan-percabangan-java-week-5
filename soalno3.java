import java.util.Scanner;

public class soalno3 {
    public static void main(String[] args) {
        String grade; 
         Scanner in = new Scanner(System.in); 
         System.out.println("masukan nilai = ");
         double  nilai = in.nextDouble();

         if (nilai >= 85) 
            { grade = "A";
                System.out.println("status lulus");
            }else if (nilai >= 70)  
            { grade = "B"; 
                System.out.println("status lulus");
            }else if (nilai >= 55)  
            { grade = "C";
                System.out.println("status tidak lulus");
             } else if (nilai >= 40) 
                { grade = "D"; 
                System.out.println("status tidak lulus");
             }
             } 

         
        

    }


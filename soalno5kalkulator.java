import java.util.Scanner;
public class soalno5kalkulator {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
        System.out.println("masukan angka pertama = ");
        double a = in.nextDouble();

        System.out.println("Operational =");
        char op = in.next().charAt(0);


        System.out.println("masukan angka kedua= ");
        double b = in.nextDouble();

        switch (op) {
            case'+' :
            System.out.println("hasil =" + (a + b));
            break;
            case'-' :
            System.out.println("Hasil = " + (a - b));
            break;
            case'*' : 
            System.out.println("Hasil = " + (a * b));
            break;
            case'/' :
            if (b == 0) {
                System.out.println("tidak bisa dibagi dengan nol");

            }    else{
                System.out.println("Hasil = " + (a / b));
                break;
            }        

                
        
            default:
                break;
        }
    }
}

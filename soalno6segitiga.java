import java.util.Scanner;

public class soalno6segitiga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("masukan nilai =");
        int tempat = in.nextInt();
        System.out.println("masukan nilai =");
        int tempat2 = in.nextInt();
        System.out.println("masukan nilai =");
        int tempat3 = in.nextInt();

        if (tempat == tempat2 && tempat2 == tempat3) {
            System.out.println("segitiga sama sisi");    
        }  else if (tempat == tempat2 || tempat2 == tempat3 || tempat == tempat3) {
              System.out.println("segitiga sama kaki");
        }  else if (tempat != tempat2 || tempat2 != tempat2 || tempat != tempat3) {
            System.out.println("segitiga sembarang"); 
        } else {
            System.out.println("bukan segitiga");
        }
           

        


    }
}   


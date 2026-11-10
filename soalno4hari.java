import java.util.Scanner;
public class soalno4hari {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        System.out.println("masukan nama hari ke = ");
        int hari = in.nextInt();

        switch (hari) {
            case 1: System.out.println("senin");
            break;
            case 2: System.out.println("selasa");
            break; 
            case 3: System.out.println("rabu");
            break;
            case 4: System.out.println("kamis");
            break;
            case 5: System.out.println("jumat");
            break;
            case 6: System.out.println("sabtu");
            break;
            case 7: System.out.println("minggu");
            break;
                
        }

    }
    
}

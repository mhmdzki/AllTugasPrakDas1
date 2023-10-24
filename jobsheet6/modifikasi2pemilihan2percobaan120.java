<<<<<<< HEAD
import java.util.Scanner;

public class modifikasi2pemilihan2percobaan120 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int tahun;
        System.out.println("Masukkan Tahun");
        tahun = input20.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
             } else if ((tahun % 100) == 0) {
            if ((tahun % 400) == 0) {
                System.out.println("Tahun Kabisat");
            }else
            System.out.println("Bukan Tahun Kabisat");
            }
        
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    } 
=======
import java.util.Scanner;

public class modifikasi2pemilihan2percobaan120 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int tahun;
        System.out.println("Masukkan Tahun");
        tahun = input20.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
             } else if ((tahun % 100) == 0) {
            if ((tahun % 400) == 0) {
                System.out.println("Tahun Kabisat");
            }else
            System.out.println("Bukan Tahun Kabisat");
            }
        
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    } 
>>>>>>> 951467dd7adf033ced2063218a8a8a4dbcdeba33
}
import java.util.Scanner;
/**
 * pemilihan2percobaan220
 */
public class pemilihan2percobaan220 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Masukkan sudut1 : ");
        sudut1 = input20.nextFloat();
        System.out.print("Masukkan sudut2 : ");
        sudut2 = input20.nextFloat();
        System.out.print("Masukkan sudut3 : ");
        sudut3 = input20.nextFloat();

           totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180){
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90 ))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else 
            System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else
        System.out.println("Bukan Segitiga");
    }
}
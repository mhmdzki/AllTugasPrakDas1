import java.util.Scanner;
/**
 * ForKelipatan18
 */
public class WhileKelipatan20 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int kelipatan;
        int jumlah=0;
        int counter=0;

        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan=input.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah +=i;
                counter++;

              
            }
            i++;
        }

        double rataRata = (double) jumlah / counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan,counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan,jumlah);
        System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %.2f\n", kelipatan,rataRata);
    }
}
import java.util.Scanner;
import java.util.Random;

/**
 * Quiz20
 */
public class QuizModifikasi220 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu = 'y';
        do {
            int number = random.nextInt(10) +1;
            boolean succsess = false;
            do {
                System.out.println("tebak angka (1-10):");
                int answer = input.nextInt();
                input.nextLine();
                succsess = (answer==number);           

                if (answer < number) {
                    System.out.println("lebih besar dari " + answer);
                } else if (answer > number){
                    System.out.println("lebih kecil dari" + answer);
                } else {
                    succsess = true;
                }
            
            } while (!succsess);
            System.out.println("apakah anda ingin mengulang permainan(y/n)?");
            menu=input.nextLine().charAt(0);

            if (menu == 'n' || menu == 'n') {
                System.out.println("keluar dari permainan");
                break;
            }
        } while (menu=='y'|| menu=='Y');
    }
}
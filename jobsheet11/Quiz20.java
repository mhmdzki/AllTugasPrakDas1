import java.util.Scanner;
import java.util.Random;

/**
 * Quiz20
 */
public class Quiz20 {

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
            
            } while (!succsess);
            System.out.println("apakah anda ingin mengulang permainan(Y/y)?");
            menu=input.nextLine().charAt(0);
        } while (menu=='y'|| menu=='Y');
    }
}
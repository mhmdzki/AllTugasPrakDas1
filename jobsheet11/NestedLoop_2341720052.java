import java.util.Scanner;

/**
 * NestedLoop_2341720052
 */
public class NestedLoop_2341720052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temps[][] = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("hari ke-" + (j+1) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        } 
        
        for (int i = 0; i < temps.length; i++) {
                System.out.print("kota ke-" + (i + 1) + ": ");
            for (int j = 0; j < temps.length; j++) {
                System.out.print(temps[i][j] + " ");
            }            
            System.out.println();
        }
    }
}
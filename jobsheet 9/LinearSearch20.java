import java.util.Scanner;

/**
 * LinearSearch20
 */
public class LinearSearch20 {

    public static void main(String[] args) {
        int[] arrayaInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int hasil = 0;

        for (int i = 0; i < arrayaInt.length; i++) {
            if (arrayaInt[i] == key) {
                hasil = i;
                break;
            }
            
        }
        System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
    }
}
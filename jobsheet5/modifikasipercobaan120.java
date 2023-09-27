import java.util.Scanner;

public class modifikasipercobaan120 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input20.nextInt();
        input20.close();

        String hasilString = angka %2 == 0 ? "genap" : "ganjil";    
        System.out.println("Angka " + angka + " bilangan " + hasilString);
    
    }

}

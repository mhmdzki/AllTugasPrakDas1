import java.util.Scanner;

/**
 * ArrayNilai20
 */
public class ModifikasiArrayNilai20 {

    public static void main(String[] args) {
        int [] nilaiAkhir = new int [10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Masukkan nilai akhir ke-"+i+" : ");
            nilaiAkhir[i] = sc.nextInt();
            
           
            }
            
        for (int j = 0; j < nilaiAkhir.length; j++) {
            if (nilaiAkhir[j] > 70){
                System.out.println("Nilai akhir ke-" +j+ " adalah lulus!");
            }else if (nilaiAkhir[j] < 70){
                System.out.println("Nilai akhir ke-" +j+ " adalah tidak lulus");
                }
            
            
        }
    }
}
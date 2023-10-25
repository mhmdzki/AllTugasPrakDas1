import java.util.Scanner;

/**
 * ArrayRataNilai20
 */
public class ArrayRataNilai20 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Masukkan jumlah mhs = ");
      int jumlahMahasiswa = sc.nextInt();

      int [] nilaiMhs= new int[10];
      double totalLulus = 0;
      double totalTidakLulus = 0;
      double rata2Lulus;
      double rata2TdkLulus = 0;

      int jumlahMahasiswaLulus = 0;
      int jumlahMahasiswaTdkLulus =0;


      for (int i = 0; i < nilaiMhs.length; i++) {
        System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilaiMhs[i] = sc.nextInt();
        
      }for (int i = 0; i < nilaiMhs.length; i++) {
      
        if (nilaiMhs[i]>70){
          totalLulus+=nilaiMhs[i];
          jumlahMahasiswaLulus++;
        }else totalTidakLulus += nilaiMhs[i];
              totalTidakLulus++;
        }
        rata2Lulus = (jumlahMahasiswaLulus > 0) ? totalLulus / jumlahMahasiswaLulus : 0;
        rata2TdkLulus = (jumlahMahasiswaTdkLulus > 0) ? totalTidakLulus / jumlahMahasiswaTdkLulus : 0;
        System.out.println("rata rata nilai lulus" + rata2Lulus);
        System.out.println("rata rata nilai tidak lulus = "+ rata2TdkLulus);   
            
    }
}

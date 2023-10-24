import  java.util.Scanner;
public class ModifikasiWhileGaji20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahKaryawan,jumlahJamLembur;
        double gajiLembur=0;
        double totalGajiLembur=0;
        String jabatan;

        System.out.println("Masukkan jumlah karyawan : ");
        jumlahKaryawan = input.nextInt();
        
        int i = 0;

        while (i < jumlahKaryawan) {

        System.out.println("Pilihan jabatan Direktur, Manajer, karyawan"); 
        System.out.print("Masukkan jabatan karyawan ke-" + (i+1)+": ");
        jabatan = input.next();
        System.out.print("Masukkan jumlah jam lembur : "); 
        jumlahJamLembur = input.nextInt(); 
        i++;

        if (jabatan.equalsIgnoreCase("direktur")) {
            continue;
        } else if (jabatan.equalsIgnoreCase("manajer")) { 
            gajiLembur = jumlahJamLembur * 100000;
        }
        else if (jabatan.equalsIgnoreCase("karyawan")) {
            gajiLembur = jumlahJamLembur * 75000;
        } else { i--;
            System.out.println("jabatan invalid"); continue;

        }

        totalGajiLembur += gajiLembur;
    }
    System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
}
package Java;
import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        System.out.print("Masukkan Nama Mahasiswa: ");
        Scanner scanner = new Scanner(System.in);
        String nama = scanner.nextLine();

        System.out.print("Masukkan Nilai Asli: ");
        int nilai_asli = scanner.nextInt();

        System.out.print("Masukkan Durasi: ");
        int durasi = scanner.nextInt();

        double nilai_akhir;
        if (durasi < 60) 
            nilai_akhir = 1.2 * nilai_asli;
        else if (durasi >= 60 && durasi <= 70)
            nilai_akhir = nilai_asli;
        else if (durasi > 70 && durasi < 90)
            nilai_akhir = 0.75 * nilai_asli;
        else if (durasi >= 90 && durasi <= 100)
            nilai_akhir = 0.5 * nilai_asli;
        else
            nilai_akhir = 0.2 * nilai_asli;

        System.out.println(nama + " mendapatkan nilai akhir " + nilai_akhir);

        scanner.close();
    }
}

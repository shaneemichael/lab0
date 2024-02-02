package Java;
import java.util.Scanner;

public class pangkat_factorial {
    public static void main(String[] args) {
        System.out.print("masukkan bilangan utama (n): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("masukkan pemangkatan (m): ");
        int m = scanner.nextInt();

        int hasil_fact = 1;
        int temp_n = n;
        while(temp_n >= 1) {
            hasil_fact = hasil_fact * temp_n;
            temp_n--;
        }

        int hasil_pangkat = 1;
        for(int i = 0; i < m; i++)
            hasil_pangkat = hasil_pangkat * n;

        System.out.println("n factorial = " + hasil_fact);
        System.out.println("n pangkat m = " + hasil_pangkat);

        scanner.close();
    }
}

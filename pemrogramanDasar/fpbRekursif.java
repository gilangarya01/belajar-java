
package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fpbRekursif {
    public static int fpb(int bil1, int bil2) {
        if (bil2 == 0) {
            return bil1;
        } else {
            return fpb(bil2, bil1 % bil2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bil1, bil2, hasil;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Menghitung Nilai FPB dengan rekursif");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukaan bilangan 1 = ");
        bil1 = Integer.parseInt(br.readLine());
        System.out.print("Masukaan bilangan 2 = ");
        bil2 = Integer.parseInt(br.readLine());

        hasil = fpb(bil1, bil2);
        System.out.println("FPB dari " + Integer.toString(bil1) + " dan " + Integer.toString(bil2) + " adalah "
                + Integer.toString(hasil));
    }
}

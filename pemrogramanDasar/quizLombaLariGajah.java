
package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quizLombaLariGajah {
    public static void main(String[] args) throws IOException {
        BufferedReader inputan = new BufferedReader(new InputStreamReader(System.in));
        int jmlGajah = 0;

        System.out.print("Jumlah Peserta Lomba Lari Gajah : ");
        jmlGajah = Integer.parseInt(inputan.readLine());

        // Variabel array
        int[] nomorGajah = new int[jmlGajah];
        String[] namaGajah = new String[jmlGajah];
        int[] usiaGajah = new int[jmlGajah];
        int[] beratGajah = new int[jmlGajah];
        String[] kategori = new String[jmlGajah];
        int[] jarak = new int[jmlGajah];

        for (int i = 0; i < jmlGajah; i++) {
            System.out.print("Nomor Gajah : ");
            nomorGajah[i] = Integer.parseInt(inputan.readLine());
            System.out.print("Nama Gajah : ");
            namaGajah[i] = inputan.readLine();
            System.out.print("Usia Gajah (bulan) : ");
            usiaGajah[i] = Integer.parseInt(inputan.readLine());
            System.out.print("Berat Badan Gajah (kg) : ");
            beratGajah[i] = Integer.parseInt(inputan.readLine());
            System.out.println("");
        }

        System.out.println("=====OUTPUT=====");
        for (int i = 0; i < jmlGajah; i++) {
            System.out.println("");
            System.out.println("Nomor Gajah : " + nomorGajah[i]);
            System.out.println("Nama Gajah : " + namaGajah[i]);
            System.out.println("Usia Gajah (bulan) : " + usiaGajah[i]);
            System.out.println("Berat Badan Gajah (kg) : " + beratGajah[i]);

            // Mencari kategori lari
            if (usiaGajah[i] < 10 && beratGajah[i] < 500) {
                kategori[i] = "Jarak Pendek";
            } else if (usiaGajah[i] >= 10 && usiaGajah[i] < 15 && beratGajah[i] >= 500 && beratGajah[i] < 1000) {
                kategori[i] = "Jarak Menengah";
            } else if (usiaGajah[i] >= 15 && beratGajah[i] >= 1000) {
                kategori[i] = "Jarak Panjang";
            }

            System.out.println("Kategori Lari : " + kategori[i]);
            System.out.print("Jarak yang berhasil ditempuh Gajah : ");
            jarak[i] = Integer.parseInt(inputan.readLine());
        }

        // Mencari jarak terpendek
        int terpendek = 99999;
        for (int a = 0; a < jarak.length; a++) {
            if (jarak[a] < terpendek) {
                terpendek = jarak[a];
            }
        }
        System.out.println("");
        System.out.println("Jarak terpendek yang di tempuh Gajah : " + terpendek);
    }
}

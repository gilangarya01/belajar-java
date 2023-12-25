
package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quizPencatatanKesehatanGajah {
    public static void main(String[] args) throws IOException {
        BufferedReader inputan = new BufferedReader(new InputStreamReader(System.in));
        // Variabel
        int nomorGajah = 0, usiaGajah = 0, beratGajah = 0, bbIdeal = 0, selisih = 0;
        String namaGajah = null, keluhanGajah = null, tglCek = null, kategoriGajah = null;

        System.out.println("=====PENCATATAN KESEHATAN GAJAH=====");
        System.out.print("Nomor Gajah : ");
        nomorGajah = Integer.parseInt(inputan.readLine());
        System.out.print("Nama Gajah : ");
        namaGajah = inputan.readLine();
        System.out.print("Usia Gajah (tahun) : ");
        usiaGajah = Integer.parseInt(inputan.readLine());
        System.out.print("Berat badan Gajah (kg) : ");
        beratGajah = Integer.parseInt(inputan.readLine());
        System.out.print("Tanggal check rutin : ");
        tglCek = inputan.readLine();
        System.out.print("Keluhan Gajah : ");
        keluhanGajah = inputan.readLine();

        // Menghitung BB Ideal
        bbIdeal = usiaGajah / 5 * 650;

        // Mencari Kategori
        selisih = beratGajah - bbIdeal;
        if (selisih < 50) {
            kategoriGajah = "Kurus";
        } else if (selisih == 50) {
            kategoriGajah = "Sedang";
        } else if (selisih > 50) {
            kategoriGajah = "Gemuk";
        }

        System.out.println("");
        System.out.println("=====OUTPUT=====");
        System.out.println("Nomor Gajah : " + nomorGajah);
        System.out.println("Nama Gajah : " + namaGajah);
        System.out.println("Usia Gajah (tahun) : " + usiaGajah);
        System.out.println("Berat badan Gajah (kg) : " + beratGajah);
        System.out.println("Tanggal check rutin : " + tglCek);
        System.out.println("Keluhan Gajah : " + keluhanGajah);
        System.out.println("Berat Badan Ideal Gajah : " + bbIdeal);
        System.out.println("Kategori Gajah : " + kategoriGajah);

    }
}


package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class quizPengelolaanKandangGajah {
    public static void main(String[] args) throws IOException {
        BufferedReader inputan = new BufferedReader(new InputStreamReader(System.in));
        // Variabel
        int nomorKandang = 0, jmlGajah = 0, biayaPerawatan = 0, biayaPakan = 0, biayaPelatihan = 0;
        String namaKandang = null, bakatGajah = null;

        System.out.println("======PENGELOLAAN KANDANG GAJAH=====");
        System.out.print("Nomor Kandang : ");
        nomorKandang = Integer.parseInt(inputan.readLine());
        System.out.print("Nama Kandang : ");
        namaKandang = inputan.readLine();
        System.out.print("Jumlah Gajah dalam 1 kandang : ");
        jmlGajah = Integer.parseInt(inputan.readLine());
        System.out.print("Bakat Gajah dalam 1 kandang : ");
        bakatGajah = inputan.readLine();
        System.out.print("Biaya perawatan kandang per minggu : ");
        biayaPerawatan = Integer.parseInt(inputan.readLine());
        System.out.print("Biaya pakan Gajah per minggu : ");
        biayaPakan = Integer.parseInt(inputan.readLine());
        System.out.print("Biaya pelatihan bakat Gajah per minggu : ");
        biayaPelatihan = Integer.parseInt(inputan.readLine());

        System.out.println("");
        System.out.println("=====OUPUT=====");
        System.out.println("Nomor Kandang : " + nomorKandang);
        System.out.println("Nama Kandang : " + namaKandang);
        System.out.println("Jumlah Gajah dalam 1 kandang : " + jmlGajah);
        System.out.println("Bakat Gajah dalam 1 kandang : " + bakatGajah);
        System.out.println("Biaya perawatan kandang per minggu : " + biayaPerawatan);
        System.out.println("Biaya pakan Gajah per minggu : " + biayaPakan);
        System.out.println("Biaya pelatihan bakat Gajah per minggu : " + biayaPelatihan);
        System.out.println("");
        System.out.println("=====TOTAL BIAYA=====");
        System.out.println("Total Biaya Perawatan Kandang per bulan : " + biayaPerawatan * 4);
        System.out.println("Total Biaya Pakan Gajah per bulan : " + biayaPakan * 4);
        System.out.println("Total Biaya Pelatihan Bakat Gajah per bulan : " + biayaPelatihan * 4);
    }
}

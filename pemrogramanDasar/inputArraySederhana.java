
package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputArraySederhana {
    public static void main(String[] args) throws IOException {
        BufferedReader inputan = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Jumlah Transaksi : ");
        int jml = Integer.parseInt(inputan.readLine());

        String[] noTrans = new String[jml];
        String[] tgl = new String[jml];
        String[] nama = new String[jml];
        String[] alamat = new String[jml];
        String[] noTelp = new String[jml];
        int[] banyak = new int[jml];
        int[] lama = new int[jml];
        int[] harga = new int[jml];
        int[] total = new int[jml];
        int[] diskon = new int[jml];
        int[] bayar = new int[jml];

        for (int i = 0; i < jml; i++) {
            System.out.print("Nomor Transaksi : ");
            noTrans[i] = inputan.readLine();
            System.out.print("Tanggal Transaksi : ");
            tgl[i] = inputan.readLine();
            System.out.print("Nama : ");
            nama[i] = inputan.readLine();
            System.out.print("Alamat : ");
            alamat[i] = inputan.readLine();
            System.out.print("Nomor Telepon : ");
            noTelp[i] = inputan.readLine();
            System.out.print("Banyak sewa kandang : ");
            banyak[i] = Integer.parseInt(inputan.readLine());
            System.out.print("Lama sewa kandang (bulan) : ");
            lama[i] = Integer.parseInt(inputan.readLine());
            System.out.print("Harga sewa kandang : ");
            harga[i] = Integer.parseInt(inputan.readLine());
            System.out.println("");
        }

        for (int i = 0; i < jml; i++) {
            System.out.println("Nomor Transaksi : " + noTrans[i]);
            System.out.println("Tanggal Transaksi : " + tgl[i]);
            System.out.println("Nama : " + nama[i]);
            System.out.println("Alamat : " + alamat[i]);
            System.out.println("Nomor Telepon : " + noTelp[i]);
            System.out.println("Banyak sewa kandang : " + banyak[i]);
            System.out.println("Lama sewa kandang (bulan) : " + lama[i]);
            System.out.println("Harga sewa kandang : " + harga[i]);
            total[i] = banyak[i] * lama[i] * harga[i];
            System.out.println("Harga total : " + total[i]);

            if (lama[i] < 3) {
                diskon[i] = 0;
            } else if (lama[i] >= 3 && lama[i] < 5) {
                diskon[i] = 10;
            } else if (lama[i] >= 5) {
                diskon[i] = 20;
            }

            System.out.println("Diskon : " + diskon[i] + "%");
            bayar[i] = total[i] * (diskon[i] / 100);
            System.out.println("Total bayar : " + bayar[i]);
        }
    }
}

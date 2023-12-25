
package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class penyewaanMobil_Array2D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] daftarMobil = {
                { "K001", "Toyota" },
                { "K002", "Kijang" },
                { "K003", "Honda" },
                { "K004", "Suzuki" }
        };
        int[] hargaMobil = { 200000, 250000, 275000, 300000 };

        String[][] dataPenyewa = new String[10][4];
        int[][] dataMobilSewa = new int[10][3];
        float[][] dataPembayaran = new float[10][4];

        String kode;
        int pilih = 0, penyewa = 0, indeks = 0;

        while (true) {

            System.out.println("=====PENYEWAAN MOBIL=====");
            System.out.println("");
            System.out.println("1. Input Data");
            System.out.println("2. Output Data");
            System.out.println("3. Keluar");
            System.out.println("");

            System.out.print("Masukkan pilihan (1/2/3) : ");
            pilih = Integer.parseInt(br.readLine());
            System.out.println("");

            switch (pilih) {
                case 1:

                    System.out.print("Masukkan jumlah penyewa : ");
                    penyewa = Integer.parseInt(br.readLine());
                    System.out.println("");
                    System.out.println("Daftar Mobil :");
                    System.out.println("|------------|---------------------|--------------|");
                    System.out.println("| Kode Mobil | Merk Mobil          | Harga        |");
                    System.out.println("|------------|---------------------|--------------|");
                    System.out.println("| K001       | Toyota              | Rp. 200000   |");
                    System.out.println("| K002       | Kijang              | Rp. 250000   |");
                    System.out.println("| K003       | Honda               | Rp. 275000   |");
                    System.out.println("| K004       | Suzuki              | Rp. 300000   |");
                    System.out.println("|------------|---------------------|--------------|");

                    for (int i = 0; i < penyewa; i++) {

                        System.out.println("");
                        System.out.println(">>> Data ke-" + (i + 1));
                        System.out.print("Input nama penyewa           : ");
                        dataPenyewa[i][0] = br.readLine();
                        System.out.print("Input alamat penyewa         : ");
                        dataPenyewa[i][1] = br.readLine();

                        while (true) {

                            boolean ketemu = false;
                            System.out.print("Input Kode Mobil             : ");
                            kode = br.readLine().toUpperCase();

                            for (int j = 0; j < daftarMobil.length; j++) {
                                if (daftarMobil[j][0].equals(kode)) {
                                    indeks = j;
                                    ketemu = true;
                                }
                            }

                            if (ketemu == true) {
                                dataPenyewa[i][2] = daftarMobil[indeks][0];
                                dataPenyewa[i][3] = daftarMobil[indeks][1];
                                dataMobilSewa[i][0] = hargaMobil[indeks];
                                System.out.println("Merk Mobil   : " + dataPenyewa[i][3]);
                                System.out.println("Harga Mobil  : Rp." + dataMobilSewa[i][0]);
                                System.out.print("Input jumlah mobil sewa      : ");
                                dataMobilSewa[i][1] = Integer.parseInt(br.readLine());
                                System.out.print("Input lama waktu sewa (HARI) : ");
                                dataMobilSewa[i][2] = Integer.parseInt(br.readLine());
                                break;
                            } else {
                                System.out.println("");
                                System.out.println("Kode Mobil tidak ditemukan!");
                                System.out.println("");
                            }

                        }

                        if (dataMobilSewa[i][2] < 3) {
                            dataPembayaran[i][0] = 0;
                            dataPembayaran[i][1] = dataMobilSewa[i][0] * dataMobilSewa[i][1] * dataMobilSewa[i][2];
                            dataPembayaran[i][3] = dataPembayaran[i][1];
                        } else if (dataMobilSewa[i][2] >= 3 && dataMobilSewa[i][2] < 5) {
                            dataPembayaran[i][0] = 10;
                            dataPembayaran[i][1] = dataMobilSewa[i][0] * dataMobilSewa[i][1] * dataMobilSewa[i][2];
                            dataPembayaran[i][2] = dataPembayaran[i][1] * (dataPembayaran[i][0] / 100);
                            dataPembayaran[i][3] = dataPembayaran[i][1] - dataPembayaran[i][2];
                        } else if (dataMobilSewa[i][2] >= 5) {
                            dataPembayaran[i][0] = 20;
                            dataPembayaran[i][1] = dataMobilSewa[i][0] * dataMobilSewa[i][1] * dataMobilSewa[i][2];
                            dataPembayaran[i][2] = dataPembayaran[i][1] * (dataPembayaran[i][0] / 100);
                            dataPembayaran[i][3] = dataPembayaran[i][1] - dataPembayaran[i][2];
                        }
                    }

                    break;
                case 2:

                    System.out.println("=====OUTPUT=====");

                    for (int i = 0; i < penyewa; i++) {

                        System.out.println(">>> Penyewa ke-" + (i + 1));
                        System.out.println("Nama penyewa             : " + dataPenyewa[i][0]);
                        System.out.println("Alamat penyewa           : " + dataPenyewa[i][1]);
                        System.out.println("Kode Mobil               : " + dataPenyewa[i][2]);
                        System.out.println("Merk Mobil               : " + dataPenyewa[i][3]);
                        System.out.println("Harga Mobil              : Rp." + dataMobilSewa[i][0]);
                        System.out.println("Jumlah Mobil yang disewa : " + dataMobilSewa[i][1]);
                        System.out.println("Lama waktu sewa (HARI)   : " + dataMobilSewa[i][2]);
                        System.out.println("Total                    : Rp." + dataPembayaran[i][1]);
                        System.out.println("Diskon                   : " + dataPembayaran[i][0] + "%");
                        System.out.println("Harga setelah diskon     : Rp." + dataPembayaran[i][3]);
                        System.out.println("");

                    }

                    break;
                case 3:

                    System.out.println("Program selesai!");
                    System.exit(0);

                    break;
                default:

                    System.out.println("");
                    System.out.println("Inputan anda salah!");
                    System.out.println("");

                    break;
            }
        }

    }
}

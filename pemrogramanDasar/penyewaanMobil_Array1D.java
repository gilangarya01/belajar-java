
package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class penyewaanMobil_Array1D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int pilih = 0, penyewa = 0;

        int[] kategori = new int[100];
        int[] harga = new int[100];
        String[] nama = new String[100];
        String[] merk = new String[100];
        int[] lama = new int[100];
        int[] jml = new int[100];
        double[] diskon = new double[100];
        double[] total = new double[100];
        double[] nodiskon = new double[100];
        double[] bayar = new double[100];

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
                    for (int i = 0; i < penyewa; i++) {

                        System.out.println("Pilihan Mobil :");
                        System.out.println("------------------------");
                        System.out.println("| 1 | Toyota  | 200000 |");
                        System.out.println("| 2 | Kijang  | 250000 |");
                        System.out.println("| 3 | Honda   | 275000 |");
                        System.out.println("| 4 | Suzuki  | 300000 |");
                        System.out.println("------------------------");
                        System.out.println("");
                        System.out.print("Masukkan pilihan (1/2/3/4) : ");
                        kategori[i] = Integer.parseInt(br.readLine());
                        System.out.println("");

                        if (kategori[i] == 1) {
                            merk[i] = "Toyota";
                            harga[i] = 200000;
                            System.out.println("Merk Mobil : " + merk[i]);
                            System.out.println("Harga sewa per hari : " + harga[i]);
                            System.out.print("Nama Penewa : ");
                            nama[i] = br.readLine();
                            System.out.print("Masukkan Jumlah mobil yang disewa : ");
                            jml[i] = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan lama waktu sewa (hari) : ");
                            lama[i] = Integer.parseInt(br.readLine());
                            System.out.println("");
                        } else if (kategori[i] == 2) {
                            merk[i] = "Kijang";
                            harga[i] = 250000;
                            System.out.println("Merk Mobil : " + merk[i]);
                            System.out.println("Harga sewa per hari : " + harga[i]);
                            System.out.print("Nama Penewa : ");
                            nama[i] = br.readLine();
                            System.out.print("Masukkan Jumlah mobil yang disewa : ");
                            jml[i] = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan lama waktu sewa (hari) : ");
                            lama[i] = Integer.parseInt(br.readLine());
                            System.out.println("");
                        } else if (kategori[i] == 3) {
                            merk[i] = "Honda";
                            harga[i] = 275000;
                            System.out.println("Merk Mobil : " + merk[i]);
                            System.out.println("Harga sewa per hari : " + harga[i]);
                            System.out.print("Nama Penewa : ");
                            nama[i] = br.readLine();
                            System.out.print("Masukkan Jumlah mobil yang disewa : ");
                            jml[i] = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan lama waktu sewa (hari) : ");
                            lama[i] = Integer.parseInt(br.readLine());
                            System.out.println("");
                        } else if (kategori[i] == 4) {
                            merk[i] = "Suzuki";
                            harga[i] = 300000;
                            System.out.println("Merk Mobil : " + merk[i]);
                            System.out.println("Harga sewa per hari : " + harga[i]);
                            System.out.print("Nama Penewa : ");
                            nama[i] = br.readLine();
                            System.out.print("Masukkan Jumlah mobil yang disewa : ");
                            jml[i] = Integer.parseInt(br.readLine());
                            System.out.print("Masukkan lama waktu sewa (hari) : ");
                            lama[i] = Integer.parseInt(br.readLine());
                            System.out.println("");
                        }

                        if (lama[i] < 3) {
                            diskon[i] = 0;
                            total[i] = jml[i] * harga[i];
                            bayar[i] = total[i];
                        } else if (lama[i] >= 3 && lama[i] < 5) {
                            diskon[i] = 10;
                            total[i] = jml[i] * harga[i];
                            nodiskon[i] = total[i] * (diskon[i] / 100);
                            bayar[i] = total[i] - nodiskon[i];
                        } else if (lama[i] >= 5) {
                            diskon[i] = 20;
                            total[i] = jml[i] * harga[i];
                            nodiskon[i] = total[i] * (diskon[i] / 100);
                            bayar[i] = total[i] - nodiskon[i];
                        }

                    }

                    break;
                case 2:
                    System.out.println("====NOTA PENYEWAAN====");
                    for (int i = 0; i < penyewa; i++) {
                        System.out.println("Nama penyewa             : " + nama[i]);
                        System.out.println("Merk Mobil               : " + merk[i]);
                        System.out.println("Harga sewa per hari      : " + harga[i]);
                        System.out.println("Jumlah mobil yang disewa : " + jml[i]);
                        System.out.println("Lama waktu sewa per hari : " + lama[i]);
                        System.out.println("Total                    : " + total[i]);
                        System.out.println("Diskon                   : " + diskon[i] + "%");
                        System.out.println("Harga setelah diskon     : " + bayar[i]);
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Program Selesai");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Inputan salah");
            }

        }

    }
}

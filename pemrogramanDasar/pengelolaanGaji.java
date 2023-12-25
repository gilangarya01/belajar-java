
package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pengelolaanGaji {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static String[] nama = new String[10];
    private static char[] gol = new char[10];
    private static int[] jamKerja = new int[10];
    private static int[][] gaji = new int[10][3];

    private static int jumlah = 0, upah_perJam = 0, pilih = 0;

    public static void main(String[] args) throws IOException {

        while (true) {
            menu();
            switch (pilih) {
                case 1:
                    Input();
                    break;
                case 2:
                    Output();
                    break;
                case 3:
                    System.out.println("Program selesai");
                    System.exit(0);
                default:
                    System.out.println("Inputan salah");
                    break;
            }
        }
    }

    private static void menu() throws IOException {
        System.out.println("=====PENGELOLAAN GAJI=====");
        System.out.println("");
        System.out.println("1. Input Data");
        System.out.println("2. Output Data");
        System.out.println("3. Keluar");
        System.out.println("");
        System.out.print("Masukkan pilihan (1/2/3) : ");
        pilih = Integer.parseInt(br.readLine());
        System.out.println("");
    }

    private static void Input() throws IOException {
        System.out.print("Masukkan jumlah karyawan : ");
        jumlah = Integer.parseInt(br.readLine());
        System.out.println("");

        for (int i = 0; i < jumlah; i++) {
            System.out.println(">>> Data ke-" + (i + 1));
            System.out.print("Input Nama karyawan      : ");
            nama[i] = br.readLine();
            while (true) {
                System.out.print("Input Golongan (A/B/C/D) : ");
                gol[i] = br.readLine().charAt(0);
                gaji[i][0] = golongan(gol[i]);
                if (upah_perJam > 0) {
                    System.out.print("Input Jam Kerja (Minggu) : ");
                    jamKerja[i] = Integer.parseInt(br.readLine());
                    gaji[i][1] = uangLembur(jamKerja[i]);
                    break;
                } else {
                    System.out.println("");
                    System.out.println("Golongan tidak diketahui");
                    System.out.println("");
                }
            }
            gaji[i][2] = Perhitungangaji(jamKerja[i], gaji[i][0], gaji[i][1]);
            System.out.println("");
        }
    }

    private static int uangLembur(int jamKerja) {
        int lembur;
        if (jamKerja >= 48) {
            lembur = (jamKerja - 48) * 4000;
        } else {
            lembur = 0;
        }
        return lembur;
    }

    private static int golongan(char gol) {
        switch (gol) {
            case 'A':
                upah_perJam = 5000;
                break;
            case 'B':
                upah_perJam = 7000;
                break;
            case 'C':
                upah_perJam = 8000;
                break;
            case 'D':
                upah_perJam = 10000;
                break;
            default:
                upah_perJam = 0;
                break;
        }
        return upah_perJam;
    }

    private static int Perhitungangaji(int jamKerja, int upah_perJam, int lembur) {
        int gaji = (jamKerja * upah_perJam) + lembur;
        return gaji;
    }

    private static void Output() {
        System.out.println("=====OUTPUT=====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println(">>> Data ke-" + (i + 1));
            System.out.println("Nama Karyawan      : " + nama[i]);
            System.out.println("Golongan           : " + gol[i]);
            System.out.println("Jam Kerja (Minggu) : " + jamKerja[i]);
            System.out.println("Gaji Karyawan      : " + gaji[i][2]);
            System.out.println("");
        }

    }

}

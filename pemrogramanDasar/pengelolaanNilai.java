
package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pengelolaanNilai {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static String[][] dataMahasiswa = new String[10][3];
    private static double[] nilai = new double[10];
    private static char[] hasilGrade = new char[10];

    private static int jumlah = 0, pilih = 0;

    private static void menu() throws IOException {
        System.out.println("=====PENGELOLAAN NILAI=====");
        System.out.println("");
        System.out.println("1. Input Data");
        System.out.println("2. Output Data");
        System.out.println("3. Keluar");
        System.out.println("");
        System.out.print("Masukkan pilihan (1/2/3) : ");
        pilih = Integer.parseInt(br.readLine());
        System.out.println("");
    }

    private static double nilaiAkhir(int uts, int tugas, int uas) {
        double nilaiAkhir = (0.3 * uts) + (0.4 * tugas) + (0.3 * uas);
        return nilaiAkhir;
    }

    private static char perhitunganGrade(double nilaiAkhir) {
        char grade = 0;
        if (nilaiAkhir < 40) {
            grade = 'E';
        } else if (nilaiAkhir <= 40 && nilaiAkhir > 55) {
            grade = 'D';
        } else if (nilaiAkhir <= 55 && nilaiAkhir > 65) {
            grade = 'C';
        } else if (nilaiAkhir <= 65 && nilaiAkhir > 80) {
            grade = 'B';
        } else if (nilaiAkhir >= 80) {
            grade = 'A';
        }
        return grade;
    }

    private static void Input() throws IOException {
        int[][] dataNilai = new int[10][3];

        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlah = Integer.parseInt(br.readLine());

        for (int i = 0; i < jumlah; i++) {
            System.out.println("");
            System.out.println(">>> Data ke-" + (i + 1));
            System.out.print("Input NIM mahasiswa            : ");
            dataMahasiswa[i][0] = br.readLine();
            System.out.print("Input nama mahasiswa           : ");
            dataMahasiswa[i][1] = br.readLine();
            System.out.print("Input alamat mahasiswa         : ");
            dataMahasiswa[i][2] = br.readLine();
            System.out.print("Input nilai UTS                : ");
            dataNilai[i][0] = Integer.parseInt(br.readLine());
            System.out.print("Input nilai Tugas              : ");
            dataNilai[i][1] = Integer.parseInt(br.readLine());
            System.out.print("Input nilai UAS                : ");
            dataNilai[i][2] = Integer.parseInt(br.readLine());

            nilai[i] = nilaiAkhir(dataNilai[i][0], dataNilai[i][1], dataNilai[i][2]);
            hasilGrade[i] = perhitunganGrade(nilai[i]);
        }
    }

    private static void Output() {
        System.out.println("=====OUTPUT=====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("NIM Mahasiswa         : " + dataMahasiswa[i][0]);
            System.out.println("Nama Mahasiswa        : " + dataMahasiswa[i][1]);
            System.out.println("Alamat Mahasiswa      : " + dataMahasiswa[i][2]);
            System.out.println("Nilai Akhir Mahasiswa : " + nilai[i]);
            System.out.println("Grade Mahasiswa       : " + hasilGrade[i]);
        }
    }

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
}

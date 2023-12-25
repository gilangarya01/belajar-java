
package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class akademik {

    // GLOBAL VARIABLE
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // VECTOR
    public static Vector<Integer> dataNim = new Vector<Integer>();
    public static Vector<String> dataNama = new Vector<String>();
    public static Vector<String> dataJur = new Vector<String>();

    // QUEUE
    public static Queue<Integer> kehadiran = new LinkedList<>();

    // STACK
    public static Stack<Integer> kodeBuku = new Stack<Integer>();
    public static Stack<String> judulBuku = new Stack<String>();
    public static Stack<Integer> tahunTerbit = new Stack<Integer>();

    // ARRAY 2D
    public static String[][] dataMk = new String[3][100];
    public static int[][] nilaiTugas = new int[100][100];
    public static int[][] nilaiUTS = new int[100][100];
    public static int[][] nilaiUAS = new int[100][100];
    public static double[][] nilaiAkhir = new double[100][100];
    public static char[][] grade = new char[100][100];

    public static int jumlahMhs = 0, pilih = 0;
    public static double totalA = 0;
    public static int[] jumlahMk = new int[100];
    public static boolean keluar = false;

    // PROGRAM UTAMA
    public static void main(String[] args) throws IOException {
        while (true) {
            menuUtama();

            switch (pilih) {
                case 1:
                    case1();
                    break;
                case 2:
                    case2();
                    break;
                case 3:
                    case3();
                    break;
                case 4:
                    case4();
                    break;
                case 5:
                    System.out.println("Program selesai!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("");
                    System.out.println("Inputan anda salah!");
                    System.out.println("");
            }
        }
    }

    // MENU UTAMA
    public static void menuUtama() throws IOException {
        System.out.println("");
        System.out.println("=====PENGELOLAAN MAHASISWA=====");
        System.out.println("");
        System.out.println("1. Input Data Mahasiswa");
        System.out.println("2. Output Data Mahasiswa");
        System.out.println("3. Daftar Hadir Mahasiswa");
        System.out.println("4. Data Buku Perpustakaan");
        System.out.println("5. Keluar");
        System.out.println("");
        System.out.print("Masukkan pilihan (1-5) : ");
        pilih = Integer.parseInt(br.readLine());
        System.out.println("");
    }

    private static double nilaiAkhir(int tugas, int uts, int uas) {
        double nilaiAkhir = (0.3 * uts) + (0.4 * tugas) + (0.3 * uas);
        return nilaiAkhir;
    }

    private static char perhitunganGrade(double nilaiAkhir) {
        if (nilaiAkhir < 40) {
            return 'E';
        } else if (nilaiAkhir >= 40 && nilaiAkhir < 55) {
            return 'D';
        } else if (nilaiAkhir >= 55 && nilaiAkhir < 65) {
            return 'C';
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 80) {
            return 'B';
        } else if (nilaiAkhir >= 80) {
            return 'A';
        }
        return 0;
    }

    // REKURSIF
    public static double totalAkhir(double arr[][], int i, int j) {
        if (i == 0 && j == 0) {
            return arr[i][j];
        } else if (j == 0) {
            return totalAkhir(arr, i - 1, arr.length - 1) + arr[i][j];
        } else {
            return totalAkhir(arr, i, j - 1) + arr[i][j];
        }
    }

    // CASE 1
    public static void case1() throws IOException {
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jumlahMhs = Integer.parseInt(br.readLine());

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("");
            System.out.println(">>> Data ke-" + (i + 1));
            System.out.print("Masukkan NIM : ");
            int nim = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Nama : ");
            String nama = br.readLine();
            System.out.print("Masukkan Jurusan : ");
            String jur = br.readLine();

            dataNim.add(nim);
            dataNama.add(nama);
            dataJur.add(jur);

            System.out.println("");
            System.out.print("Jumlah Matakuliah : ");
            jumlahMk[i] = Integer.parseInt(br.readLine());
            for (int j = 0; j < jumlahMk[i]; j++) {
                System.out.println("");
                System.out.println("Matakuliah ke-" + (j + 1));
                System.out.print("Masukkan Kode MK : ");
                dataMk[i][0] = br.readLine();
                System.out.print("Masukkan Nama MK : ");
                dataMk[i][1] = br.readLine();
                System.out.print("Masukkan SKS : ");
                dataMk[i][2] = br.readLine();

                System.out.print("Masukkan Nilai Tugas : ");
                nilaiTugas[i][j] = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Nilai UTS : ");
                nilaiUTS[i][j] = Integer.parseInt(br.readLine());
                System.out.print("Masukkan Nilai UAS : ");
                nilaiUAS[i][j] = Integer.parseInt(br.readLine());

                // METHOD MATH ROUND
                nilaiAkhir[i][j] = Math.round(nilaiAkhir(nilaiTugas[i][j], nilaiUTS[i][j], nilaiUAS[i][j]));
                totalA = Math.round(totalAkhir(nilaiAkhir, i, j));

                grade[i][j] = perhitunganGrade(nilaiAkhir[i][j]);
            }
        }
    }

    // CASE 2
    public static void case2() {
        System.out.println("====OUPUT DATA====");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("");
            System.out.println(">>> Data ke-" + (i + 1));
            System.out.println("NIM     : " + dataNim.get(i));
            System.out.println("Nama    : " + dataNama.get(i));
            System.out.println("Jurusan : " + dataJur.get(i));

            for (int j = 0; j < jumlahMk[i]; j++) {
                System.out.println("");
                System.out.println("Matakuliah ke-" + (j + 1));
                System.out.println("Kode MK : " + dataMk[i][0]);
                System.out.println("Nama MK : " + dataMk[i][1]);
                System.out.println("SKS     : " + dataMk[i][2]);

                System.out.println("Nilai Tugas : " + nilaiTugas[i][j]);
                System.out.println("Nilai UTS   : " + nilaiUTS[i][j]);
                System.out.println("Nilai UAS   : " + nilaiUAS[i][j]);
                System.out.println("Nilai Akhir : " + nilaiAkhir[i][j]);
                System.out.println("Grade       : " + grade[i][j]);
            }
        }
        System.out.println("");
        System.out.println("Total Nilai Akhir Seluruh Mahasiswa : " + totalA);
        System.out.println("");
    }

    // CASE 3
    public static void case3() throws IOException {
        while (true) {
            System.out.println("=====DAFTAR HADIR=====");
            System.out.println("Siswa yang hadir : ");
            for (int i = 0; i < kehadiran.size(); i++) {
                System.out.println((i + 1) + ". " + kehadiran.peek());
                kehadiran.add(kehadiran.poll());
            }
            System.out.println("");
            System.out.println("MENU : ");
            System.out.println("1. Input Kehadiran");
            System.out.println("2. Hapus Kehadiran");
            System.out.println("3. Keluar");
            System.out.println("");

            System.out.print("Masukkan pilihan (1-3) : ");
            pilih = Integer.parseInt(br.readLine());
            System.out.println("");

            switch (pilih) {
                case 1:
                    System.out.print("Jumlah Siswa : ");
                    int jml = Integer.parseInt(br.readLine());
                    for (int i = 0; i < jml; i++) {
                        System.out.print("Masukkan NIM Mahasiswa : ");
                        int nimHadir = Integer.parseInt(br.readLine());
                        kehadiran.add(nimHadir);
                    }
                    break;
                case 2:
                    if (kehadiran.isEmpty()) {
                        System.out.println("Daftar sedang kosong!");
                        System.out.println("");
                    } else {
                        System.out.println("Siswa dengan NIM " + kehadiran.peek() + " telah dihapus");
                        kehadiran.remove();
                    }
                    break;
                case 3:
                    keluar = true;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Inputan anda salah!");
                    System.out.println("");
            }
            if (keluar == true) {
                keluar = false;
                break;
            }
        }
    }

    // CASE 4
    public static void case4() throws IOException {
        int kapasitas = 0;
        while (true) {
            System.out.println("=====DATA PERPUSTAKAAN=====");
            System.out.println("");
            System.out.println("1. Input Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Output Buku");
            System.out.println("4. Keluar");
            System.out.println("");

            System.out.print("Masukkan pilihan (1-4) : ");
            pilih = Integer.parseInt(br.readLine());
            System.out.println("");

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Jumlah Buku : ");
                    int jmlBuku = Integer.parseInt(br.readLine());
                    kapasitas += jmlBuku;

                    for (int i = 0; i < jmlBuku; i++) {
                        System.out.println("");
                        System.out.print("Masukkan Kode Buku    : ");
                        int kodeB = Integer.parseInt(br.readLine());
                        System.out.print("Masukkan Nama Buku    : ");
                        String namaBuku = br.readLine();
                        System.out.print("Masukkan Tahun Terbit : ");
                        int tahun = Integer.parseInt(br.readLine());

                        kodeBuku.push(kodeB);
                        judulBuku.push(namaBuku);
                        tahunTerbit.push(tahun);
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Kode Buku " + kodeBuku.peek() + " telah dihapus");
                    kodeBuku.pop();
                    judulBuku.pop();
                    tahunTerbit.pop();
                    kapasitas -= 1;
                    break;
                case 3:
                    for (int i = 1; i <= kapasitas; i++) {
                        int kode = kodeBuku.peek();
                        String judul = judulBuku.peek();
                        int tahunT = tahunTerbit.peek();

                        System.out.println("Kode Buku : " + kode);
                        kodeBuku.pop();
                        System.out.println("Judul Buku : " + judul);
                        judulBuku.pop();
                        System.out.println("Tahun Terbit : " + tahunT);
                        tahunTerbit.pop();
                    }
                    break;
                case 4:
                    keluar = true;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Inputan anda salah!");
                    System.out.println("");
                    break;
            }
            if (keluar == true) {
                keluar = false;
                break;
            }
        }

    }

}

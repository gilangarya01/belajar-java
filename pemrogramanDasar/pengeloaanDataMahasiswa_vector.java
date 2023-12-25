
package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class pengeloaanDataMahasiswa_vector {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Vector<String> daftarNim = new Vector<String>();
        Vector<String> daftarNama = new Vector<String>();
        Vector<String> daftarAlamat = new Vector<String>();

        int pilih = 0, jumlah = 0;

        while (true) {
            System.out.println("");
            System.out.println("===================");
            System.out.println("DAFTAR MAHASISWA");
            System.out.println("===================");

            System.out.println("NIM yang terdaftar :");
            if (daftarNim.isEmpty() == true) {
                System.out.println("KOSONG");
            } else {
                for (int i = 0; i < daftarNim.size(); i++) {
                    System.out.println(daftarNim.get(i));
                }
            }
            System.out.println("");

            System.out.println("Menu :");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Hapus Data Mahasiswa");
            System.out.println("3. Lihat Data Mahasiswa");
            System.out.println("4. Keluar");
            System.out.println("");
            System.out.print("Masukkan pilihan (1/2/3) : ");
            pilih = Integer.parseInt(br.readLine());
            System.out.println("");

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jumlah mahasiswa : ");
                    jumlah = Integer.parseInt(br.readLine());
                    System.out.println("");
                    System.out.println(">>> Input Nama Mahasiswa");
                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("");
                        System.out.print("NIM Mahasiswa    : ");
                        String nim = br.readLine();
                        System.out.print("Nama Mahasiswa   : ");
                        String nama = br.readLine();
                        System.out.print("Alamat Mahasiswa : ");
                        String alamat = br.readLine();

                        daftarNim.add(nim);
                        daftarNama.add(nama);
                        daftarAlamat.add(alamat);
                    }
                    break;
                case 2:
                    System.out.println(">>> Hapus Data Mahasiswa");
                    System.out.print("NIM Mahasiswa : ");
                    String cek = br.readLine();
                    if (daftarNim.contains(cek)) {
                        int index = daftarNim.indexOf(cek);
                        daftarNim.removeElementAt(index);
                        daftarNama.removeElementAt(index);
                        daftarAlamat.removeElementAt(index);
                        System.out.println("Mahasiswa dengan NIM " + cek + " telah dihapus");
                    } else {
                        System.out.println("");
                        System.out.println("NIM tidak ditemukan");
                    }
                    break;
                case 3:
                    for (int i = 0; i < daftarNim.size(); i++) {
                        System.out.println(">>> Data ke-" + (i + 1));
                        System.out.println("NIM Mahasiswa    : " + daftarNim.get(i));
                        System.out.println("Nama Mahasiswa   : " + daftarNama.get(i));
                        System.out.println("Alamat Mahasiswa : " + daftarAlamat.get(i));
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Program selesai");
                    System.exit(0);
                default:
                    System.out.println("Inputan salah");
                    break;
            }
        }
    }
}


package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class penyimpananDataBarang {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Vector<Integer> kodeBarang = new Vector<Integer>();
    static Vector<String> namaBarang = new Vector<String>();
    static Vector<Integer> hargaBeliBarang = new Vector<Integer>();
    static Vector<Integer> hargaJualBarang = new Vector<Integer>();
    static Vector<Integer> jumlahBarang = new Vector<Integer>();

    static void Input() throws IOException {
        System.out.println("========================");
        System.out.println("   Input Data Barang    ");
        System.out.println("========================");
        for (int i = 0; i < 3; i++) {
            System.out.print("Kode Barang : ");
            int kode = Integer.parseInt(br.readLine());
            System.out.print("Nama Barang : ");
            String nama = br.readLine();
            System.out.print("Harga Beli (Rp.) : ");
            int hargaBeli = Integer.parseInt(br.readLine());
            System.out.print("Jumlah Barang : ");
            int jumlah = Integer.parseInt(br.readLine());
            System.out.println("");
            int hargaJual = hargaBeli + 1000;

            kodeBarang.add(kode);
            namaBarang.add(nama);
            hargaBeliBarang.add(hargaBeli);
            hargaJualBarang.add(hargaJual);
            jumlahBarang.add(jumlah);
        }
    }

    static void Hapus() throws IOException {
        boolean ketemu = false;
        System.out.println("========================");
        System.out.println("   Hapus Data Barang    ");
        System.out.println("========================");
        while (ketemu == false) {
            System.out.print("Masukkan kode barang yang dihapus : ");
            int hapus = Integer.parseInt(br.readLine());
            if (kodeBarang.contains(hapus)) {
                int index = kodeBarang.indexOf(hapus);
                kodeBarang.removeElementAt(index);
                namaBarang.removeElementAt(index);
                hargaBeliBarang.removeElementAt(index);
                hargaJualBarang.removeElementAt(index);
                jumlahBarang.removeElementAt(index);
                System.out.println("Data barang dengan kode barang " + hapus + " berhasil dihapus");
                System.out.println("");
                ketemu = true;
            } else {
                System.out.println("");
                System.out.println("Kode barang tidak ditemukan");
                System.out.println("");
            }
        }
    }

    static void Output() {
        System.out.println("========================");
        System.out.println("   Lihat Data Barang    ");
        System.out.println("========================");
        for (int i = 0; i < kodeBarang.size(); i++) {
            System.out.println("Kode Barang : " + kodeBarang.get(i));
            System.out.println("Nama Barang : " + namaBarang.get(i));
            System.out.println("Harga Beli (Rp.) : " + hargaBeliBarang.get(i));
            System.out.println("Harga Jual (Rp.) : " + hargaJualBarang.get(i));
            System.out.println("Jumlah Barang : " + jumlahBarang.get(i));
            System.out.println("");
        }
    }

    static void menu() {
        System.out.println("========================");
        System.out.println("    Inventory Barang    ");
        System.out.println("========================");
        System.out.println("1. Input Data Barang");
        System.out.println("2. Hapus Data Barang");
        System.out.println("3. Lihat Data Barang");
        System.out.println("4. Keluar");
        System.out.println("");
        System.out.print("Masukkan pilihan (1-4) : ");
    }

    public static void main(String[] args) throws IOException {

        while (true) {
            menu();
            int pilih = Integer.parseInt(br.readLine());
            System.out.println("");

            switch (pilih) {
                case 1:
                    Input();
                    break;
                case 2:
                    Hapus();
                    break;
                case 3:
                    Output();
                    break;
                case 4:
                    System.out.println("Program selesai");
                    System.exit(0);
                    break;
                default:
                    System.out.println("");
                    System.out.println("Inputan salah");
                    System.out.println("");
            }
        }

    }
}

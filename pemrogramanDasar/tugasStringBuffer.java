
package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugasStringBuffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer(30);

        while (true) {
            System.out.println("========================");
            System.out.println("Penggunaan String Buffer");
            System.out.println("========================");
            System.out.println("");
            System.out.println("Isi String Buffer :");
            System.out.println("");
            System.out.println(">>>  " + s);
            System.out.println("");
            System.out.println("Panjang String : " + s.length());
            System.out.println("Kapsitas String Buffer : " + s.capacity());
            System.out.println("");
            System.out.println("Menu :");
            System.out.println("1. Menambahkan String");
            System.out.println("2. Mengganti String");
            System.out.println("3. Reverse String");
            System.out.println("4. Menghapus String");
            System.out.println("5. Keluar");
            System.out.println("");
            System.out.print("Masukkan pilihan (1-5) : ");
            int pilih = Integer.parseInt(br.readLine());
            System.out.println("");
            switch (pilih) {
                case 1:
                    System.out.println("Kapsitas String Buffer : " + s.capacity());
                    System.out.print("Masukkan String : ");
                    String kata = br.readLine();
                    s.append(kata);
                    break;
                case 2:
                    System.out.print("Masukkan Index String awal : ");
                    int awal = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Index String akhir : ");
                    int akhir = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan String yang akann diganti : ");
                    String baru = br.readLine();
                    s.replace(awal, akhir, baru);
                    break;
                case 3:
                    s.reverse();
                    break;
                case 4:
                    s.delete(0, s.length());
                    break;
                case 5:
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

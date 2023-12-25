
package pemrogramanDasar;

import java.util.Scanner;

public class mencariMean {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float mean, jumlah;
        int banyak, data, besar, kecil;
        banyak = 0;
        jumlah = 0;
        besar = -99;
        kecil = 99;
        System.out.print("Masukkan banyaknya data : ");
        banyak = sc.nextInt();

        for (int x = 1; x <= banyak; x++) {
            System.out.print("Angka ke - " + x + " : ");
            data = sc.nextInt();
            jumlah += data;
            for (int y = 1; y <= banyak; y++) {
                if (data > besar) {
                    besar = data;
                } else if (data < kecil) {
                    kecil = data;
                }
            }
        }
        System.out.println("");
        System.out.println("=====OUTPUT=====");
        mean = jumlah / banyak;
        System.out.println("Total data : " + jumlah);
        System.out.println("Mean : " + mean);
        System.out.println("Angka terbesar : " + besar);
        System.out.println("Angka terkecil : " + kecil);
    }

}

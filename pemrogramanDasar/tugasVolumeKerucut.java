
package pemrogramanDasar;

import java.util.*;

public class tugasVolumeKerucut {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        Double rusuk, tinggi, volumeTabung, volumeKerucut;
        boolean perbandingan;
        String nama;
        char inisial;

        System.out.println("===VOLUME===");
        System.out.print("Inputkan nama Anda : ");
        nama = br.nextLine();
        System.out.print("Inputkan inisial huruf depan Anda : ");
        inisial = br.next().charAt(0);
        System.out.print("Inputkan panjang rusuk bangun ruang : ");
        rusuk = br.nextDouble();
        System.out.print("Inputkan tinggi bangun ruang : ");
        tinggi = br.nextDouble();

        System.out.println("");
        System.out.println("===HASIL===");
        System.out.println("Nama anda " + nama + " dengan inisial huruf " + inisial);
        volumeKerucut = 0.333 * 3.14 * rusuk * rusuk * tinggi;
        System.out.println("Volume Kerucut : " + volumeKerucut);
        perbandingan = rusuk > tinggi;
        System.out.println("Rusuk lebih besar dari tinggi ? " + perbandingan);
        volumeTabung = 3.14 * rusuk * rusuk * tinggi;
        System.out.println("Volume Tabung : " + volumeTabung);
        perbandingan = rusuk != tinggi;
        System.out.println("Rusuk tidak sama dengan tinggi ? " + perbandingan);

    }
}


package pemrogramanDasar;

import java.util.*;

public class menghitungBangunRuang_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih = 0, pilih2 = 0;
        double v = 0, lp = 0, s = 0, p = 0, l = 0, t = 0, r = 0;

        System.out.println("====MENGHITUNG BANGUN RUANG====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. TABUNG");
        System.out.println("4. KELUAR");
        do {
            System.out.println("");
            System.out.print("Masukkan pilihan : ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Menu Kubus");
                    System.out.println("1. VOLUME");
                    System.out.println("2. LUAS PERMUKAAN");
                    System.out.print("Masukkan pilihan : ");
                    pilih2 = sc.nextInt();
                    if (pilih2 == 1) {
                        System.out.println("===MENCARI VOLUME===");
                        System.out.print("Masukkan sisi : ");
                        s = sc.nextInt();
                        v = s * s * s;
                        System.out.println("Volume Kubus = " + v);
                    } else if (pilih2 == 2) {
                        System.out.println("===MENCARI LUAS PERMUKAAN===");
                        System.out.print("Masukkan sisi : ");
                        s = sc.nextInt();
                        lp = 6 * s * s;
                        System.out.println("Volume Luas Permukaan = " + lp);
                    } else {
                        System.out.println("Pilihan salah");
                    }
                    break;
                case 2:
                    System.out.println("Menu Balok");
                    System.out.println("1. VOLUME");
                    System.out.println("2. LUAS PERMUKAAN");
                    System.out.print("Masukkan pilihan : ");
                    pilih2 = sc.nextInt();
                    if (pilih2 == 1) {
                        System.out.println("===MENCARI VOLUME===");
                        System.out.print("Masukkan panjang : ");
                        p = sc.nextInt();
                        System.out.print("Masukkan lebar : ");
                        l = sc.nextInt();
                        System.out.print("Masukkan tinggi : ");
                        t = sc.nextInt();
                        v = p * l * t;
                        System.out.println("Volume Kubus = " + v);
                    } else if (pilih2 == 2) {
                        System.out.println("===MENCARI LUAS PERMUKAAN===");
                        System.out.print("Masukkan panjang : ");
                        p = sc.nextInt();
                        System.out.print("Masukkan lebar : ");
                        l = sc.nextInt();
                        System.out.print("Masukkan tinggi : ");
                        t = sc.nextInt();
                        lp = 2 * (p * l + p * t + l * t);
                        System.out.print("Volume Luas Permukaan = " + lp);
                    } else {
                        System.out.println("Pilihan salah");
                    }
                    break;
                case 3:
                    System.out.println("Menu Tabung");
                    System.out.println("1. VOLUME");
                    System.out.println("2. LUAS PERMUKAAN");
                    System.out.println("Masukkan pilihan : ");
                    pilih2 = sc.nextInt();
                    if (pilih2 == 1) {
                        System.out.println("===MENCARI VOLUME===");
                        System.out.print("Masukkan rusuk : ");
                        r = sc.nextInt();
                        System.out.print("Masukkan tinggi : ");
                        t = sc.nextInt();
                        v = 3.14 * r * r * t;
                        System.out.println("Volume Kubus = " + v);
                    } else if (pilih2 == 2) {
                        System.out.println("===MENCARI LUAS PERMUKAAN===");
                        System.out.print("Masukkan rusuk : ");
                        r = sc.nextInt();
                        System.out.print("Masukkan tinggi : ");
                        t = sc.nextInt();
                        lp = 2 * 3.14 * r * (r + t);
                        System.out.println("Volume Luas Permukaan = " + lp);
                    } else {
                        System.out.println("Pilihan salah");
                    }
                    break;
                case 4:
                    System.out.println("Program Selesai");
                    break;
                default:
                    System.out.println("Pilihan salah");
                    break;
            }
        } while (pilih != 4);

    }
}


package pemrogramanDasar;

import java.util.*;

public class menuPesanan_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nomenu = 0, bayar = 0, porsi = 0, total = 0;

        while (nomenu != 4) {
            System.out.println("====MENU PESANAN====");

            System.out.println("1. SOTO");
            System.out.println("2. RAWON");
            System.out.println("3. PECEL");
            System.out.println("4. SELESAI");
            System.out.print("Masukkan nomor menu : ");
            nomenu = sc.nextInt();
            switch (nomenu) {
                case 1:
                    System.out.println("Kamu memesan soto");
                    System.out.println("Harga per porsi Rp.9000");
                    System.out.print("Berapa porsi yang anda pesan : ");
                    porsi = sc.nextInt();
                    bayar = porsi * 9000;
                    total += bayar;

                    System.out.println("");
                    System.out.println("=====OUPUT====");
                    System.out.println("Anda memesan soto");
                    System.out.println("Jumlah Pesananan : " + porsi);
                    System.out.println("Bayar : Rp." + bayar);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Kamu memesan rawon");
                    System.out.println("Harga per porsi Rp.10000");
                    System.out.print("Berapa porsi yang anda pesan : ");
                    porsi = sc.nextInt();
                    bayar = porsi * 10000;
                    total += bayar;

                    System.out.println("");
                    System.out.println("=====OUPUT====");
                    System.out.println("Anda memesan rawon");
                    System.out.println("Jumlah Pesananan : " + porsi);
                    System.out.println("Bayar : Rp." + bayar);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Kamu memesan pecel");
                    System.out.println("Harga per porsi Rp.8000");
                    System.out.print("Berapa porsi yang anda pesan : ");
                    porsi = sc.nextInt();
                    bayar = porsi * 8000;
                    total += bayar;

                    System.out.println("");
                    System.out.println("=====OUPUT====");
                    System.out.println("Anda memesan pecel");
                    System.out.println("Jumlah Pesananan : " + porsi);
                    System.out.println("Bayar : Rp." + bayar);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Pesanan selesai");
                    break;
                default:
                    System.out.println("Tidak ada menu");
                    System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("====TOTAL====");
        System.out.println("Total bayar : Rp." + total);
    }
}

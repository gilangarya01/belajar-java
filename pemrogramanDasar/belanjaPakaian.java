
package pemrogramanDasar;

import java.util.*;

public class belanjaPakaian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variable
        String barang = "", pakaian = "", sepatu = "";
        int jml = 0;
        double harga = 0, diskon = 0, total = 0, nodiskon = 0, totalbayar = 0;

        System.out.println("=====Zalora Market=====");
        System.out.print("Pilih Menu (wanita/pria) : ");
        String pilih = sc.nextLine();
        switch (pilih) {
            case "wanita":
                System.out.println("=====WANITA=====");
                System.out.print("Masukkan jenis barang (pakaian/sepatu) : ");
                barang = sc.nextLine();
                if (barang.equalsIgnoreCase("pakaian")) {
                    System.out.print("Pilih rok/dress : ");
                    pakaian = sc.nextLine();
                    if (pakaian.equalsIgnoreCase("rok")) {
                        System.out.print("Jumlah barang : ");
                        jml = sc.nextInt();
                        harga = 187000;

                        if (jml >= 2) {
                            diskon = 41;
                            total = jml * harga;
                            nodiskon = total * (diskon / 100);
                            totalbayar = total - nodiskon;
                        } else {
                            totalbayar = jml * harga;
                        }

                    } else if (pakaian.equalsIgnoreCase("dress")) {
                        System.out.print("Jumlah barang : ");
                        jml = sc.nextInt();
                        harga = 235000;

                        if (jml >= 3) {
                            diskon = 25;
                            total = jml * harga;
                            nodiskon = total * (diskon / 100);
                            totalbayar = total - nodiskon;
                        } else {
                            totalbayar = jml * harga;
                        }

                    }
                } else if (barang.equalsIgnoreCase("sepatu")) {
                    System.out.print("Pilih (hells/wedges) : ");
                    sepatu = sc.nextLine();
                    if (sepatu.equalsIgnoreCase("hells")) {
                        System.out.print("Jumlah barang : ");
                        jml = sc.nextInt();
                        harga = 243000;

                        if (jml >= 2) {
                            diskon = 15;
                            total = jml * harga;
                            nodiskon = total * (diskon / 100);
                            totalbayar = total - nodiskon;
                        } else {
                            totalbayar = jml * harga;
                        }

                    } else if (sepatu.equalsIgnoreCase("wedges")) {
                        System.out.print("Jumlah barang : ");
                        jml = sc.nextInt();
                        harga = 333000;

                        if (jml >= 3) {
                            diskon = 20;
                            total = jml * harga;
                            nodiskon = total * (diskon / 100);
                            totalbayar = total - nodiskon;
                        } else {
                            totalbayar = jml * harga;
                        }

                    }
                }
                break;
            case "pria":
                System.out.println("=====PRIA=====");
                System.out.print("Masukkan jenis barang (pakaian/sepatu) : ");
                barang = sc.nextLine();
                if (barang.equalsIgnoreCase("pakaian")) {
                    System.out.print("Pilih (kaos/polo) : ");
                    pakaian = sc.nextLine();
                    if (pakaian.equalsIgnoreCase("kaos")) {
                        System.out.print("Jumlah barang : ");
                        jml = sc.nextInt();
                        harga = 125000;

                        if (jml >= 2) {
                            diskon = 30;
                            total = jml * harga;
                            nodiskon = total * (diskon / 100);
                            totalbayar = total - nodiskon;
                        } else {
                            totalbayar = jml * harga;
                        }

                    } else if (pakaian.equalsIgnoreCase("polo")) {
                        System.out.print("Jumlah barang : ");
                        jml = sc.nextInt();
                        harga = 95000;

                        if (jml >= 3) {
                            diskon = 20;
                            total = jml * harga;
                            nodiskon = total * (diskon / 100);
                            totalbayar = total - nodiskon;
                        } else {
                            totalbayar = jml * harga;
                        }

                    }
                } else if (barang.equalsIgnoreCase("sepatu")) {
                    System.out.print("Pilih (sneaker/casual) : ");
                    sepatu = sc.nextLine();
                    if (sepatu.equalsIgnoreCase("sneaker")) {
                        System.out.print("Jumlah barang : ");
                        jml = sc.nextInt();
                        harga = 229000;

                        if (jml >= 2) {
                            diskon = 20;
                            total = jml * harga;
                            nodiskon = total * (diskon / 100);
                            totalbayar = total - nodiskon;
                        } else {
                            totalbayar = jml * harga;
                        }

                    } else if (sepatu.equalsIgnoreCase("casual")) {
                        System.out.print("Jumlah barang : ");
                        jml = sc.nextInt();
                        harga = 170000;

                        if (jml >= 3) {
                            diskon = 10;
                            total = jml * harga;
                            nodiskon = total * (diskon / 100);
                            totalbayar = total - nodiskon;
                        } else {
                            totalbayar = jml * harga;
                        }

                    }
                }
                break;
        }

        System.out.println("");
        System.out.println("=====TOTAL=====");
        System.out.println("Nama barang : " + barang);
        if (barang.equalsIgnoreCase("pakaian")) {
            System.out.println("Jenis pakaian : " + pakaian);
        } else if (barang.equalsIgnoreCase("sepatu")) {
            System.out.println("Jenis sepatu : " + sepatu);
        }
        System.out.println("Harga : Rp." + harga);
        System.out.println("Total : " + total);
        System.out.println("Diskon : (" + diskon + "%) : Rp." + nodiskon);
        System.out.println("Total bayar : " + totalbayar);
    }
}

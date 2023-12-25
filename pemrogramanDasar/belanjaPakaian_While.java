
package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class belanjaPakaian_While {
    public static void main(String[] args) throws IOException {
        BufferedReader inputan = new BufferedReader(new InputStreamReader(System.in));
        // Variable
        int pilih = 0;
        // Variabel Wanita
        String barangW = "", pakaianW = "", sepatuW = "";
        int jmlW = 0;
        double hargaW = 0, diskonW = 0, totalW = 0, nodiskonW = 0, totalbayarW = 0;
        // Variabel Pria
        String barangP = "", pakaianP = "", sepatuP = "";
        int jmlP = 0;
        double hargaP = 0, diskonP = 0, totalP = 0, nodiskonP = 0, totalbayarP = 0;

        while (true) {
            System.out.println("");
            System.out.println("");
            System.out.println("========ZALORA========");
            System.out.println("1. Input data Wanita");
            System.out.println("2. Input data Pria");
            System.out.println("3. Output data Wanita");
            System.out.println("4. Output data Pria");
            System.out.println("5. Keluar");
            System.out.println("");
            System.out.print("Masukkan pilihan : ");
            pilih = Integer.parseInt(inputan.readLine());
            switch (pilih) {
                case 1:
                    System.out.println("");
                    System.out.println("=====WANITA=====");
                    System.out.print("Masukkan jenis barang (pakaian/sepatu) : ");
                    barangW = inputan.readLine();
                    if (barangW.equalsIgnoreCase("pakaian")) {
                        System.out.print("Pilih rok/dress : ");
                        pakaianW = inputan.readLine();
                        if (pakaianW.equalsIgnoreCase("rok")) {
                            System.out.print("Jumlah barang : ");
                            jmlW = Integer.parseInt(inputan.readLine());
                            hargaW = 187000;

                            if (jmlW >= 2) {
                                diskonW = 41;
                                totalW = jmlW * hargaW;
                                nodiskonW = totalW * (diskonW / 100);
                                totalbayarW = totalW - nodiskonW;
                            } else {
                                totalW = jmlW * hargaW;
                                totalbayarW = jmlW * hargaW;
                            }

                        } else if (pakaianW.equalsIgnoreCase("dress")) {
                            System.out.print("Jumlah barang : ");
                            jmlW = Integer.parseInt(inputan.readLine());
                            hargaW = 235000;

                            if (jmlW >= 3) {
                                diskonW = 25;
                                totalW = jmlW * hargaW;
                                nodiskonW = totalW * (diskonW / 100);
                                totalbayarW = totalW - nodiskonW;
                            } else {
                                totalW = jmlW * hargaW;
                                totalbayarW = jmlW * hargaW;
                            }

                        }
                    } else if (barangW.equalsIgnoreCase("sepatu")) {
                        System.out.print("Pilih (hells/wedges) : ");
                        sepatuW = inputan.readLine();
                        if (sepatuW.equalsIgnoreCase("hells")) {
                            System.out.print("Jumlah barang : ");
                            jmlW = Integer.parseInt(inputan.readLine());
                            hargaW = 243000;

                            if (jmlW >= 2) {
                                diskonW = 15;
                                totalW = jmlW * hargaW;
                                nodiskonW = totalW * (diskonW / 100);
                                totalbayarW = totalW - nodiskonW;
                            } else {
                                totalW = jmlW * hargaW;
                                totalbayarW = jmlW * hargaW;
                            }

                        } else if (sepatuW.equalsIgnoreCase("wedges")) {
                            System.out.print("Jumlah barang : ");
                            jmlW = Integer.parseInt(inputan.readLine());
                            hargaW = 333000;

                            if (jmlW >= 3) {
                                diskonW = 20;
                                totalW = jmlW * hargaW;
                                nodiskonW = totalW * (diskonW / 100);
                                totalbayarW = totalW - nodiskonW;
                            } else {
                                totalW = jmlW * hargaW;
                                totalbayarW = jmlW * hargaW;
                            }

                        }
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("=====PRIA=====");
                    System.out.print("Masukkan jenis barang (pakaian/sepatu) : ");
                    barangP = inputan.readLine();
                    if (barangP.equalsIgnoreCase("pakaian")) {
                        System.out.print("Pilih (kaos/polo) : ");
                        pakaianP = inputan.readLine();
                        if (pakaianP.equalsIgnoreCase("kaos")) {
                            System.out.print("Jumlah barang : ");
                            jmlP = Integer.parseInt(inputan.readLine());
                            hargaP = 125000;

                            if (jmlP >= 2) {
                                diskonP = 30;
                                totalP = jmlP * hargaP;
                                nodiskonP = totalP * (diskonP / 100);
                                totalbayarP = totalP - nodiskonP;
                            } else {
                                totalP = jmlP * hargaP;
                                totalbayarP = jmlP * hargaP;
                            }

                        } else if (pakaianP.equalsIgnoreCase("polo")) {
                            System.out.print("Jumlah barang : ");
                            jmlP = Integer.parseInt(inputan.readLine());
                            hargaP = 95000;

                            if (jmlP >= 3) {
                                diskonP = 20;
                                totalP = jmlP * hargaP;
                                nodiskonP = totalP * (diskonP / 100);
                                totalbayarP = totalP - nodiskonP;
                            } else {
                                totalP = jmlP * hargaP;
                                totalbayarP = jmlP * hargaP;
                            }

                        }
                    } else if (barangP.equalsIgnoreCase("sepatu")) {
                        System.out.print("Pilih (sneaker/casual) : ");
                        sepatuP = inputan.readLine();
                        if (sepatuP.equalsIgnoreCase("sneaker")) {
                            System.out.print("Jumlah barang : ");
                            jmlP = Integer.parseInt(inputan.readLine());
                            hargaP = 229000;

                            if (jmlP >= 2) {
                                diskonP = 20;
                                totalP = jmlP * hargaP;
                                nodiskonP = totalP * (diskonP / 100);
                                totalbayarP = totalP - nodiskonP;
                            } else {
                                totalP = jmlP * hargaP;
                                totalbayarP = jmlP * hargaP;
                            }

                        } else if (sepatuP.equalsIgnoreCase("casual")) {
                            System.out.print("Jumlah barang : ");
                            jmlP = Integer.parseInt(inputan.readLine());
                            hargaP = 170000;

                            if (jmlP >= 3) {
                                diskonP = 10;
                                totalP = jmlP * hargaP;
                                nodiskonP = totalP * (diskonP / 100);
                                totalbayarP = totalP - nodiskonP;
                            } else {
                                totalP = jmlP * hargaP;
                                totalbayarP = jmlP * hargaP;
                            }

                        }
                    }
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("=====TOTAL PEMBAYARAN=====");
                    System.out.println("Nama barang : " + barangW);
                    if (barangW.equalsIgnoreCase("pakaian")) {
                        System.out.println("Jenis pakaian : " + pakaianW);
                    } else if (barangW.equalsIgnoreCase("sepatu")) {
                        System.out.println("Jenis sepatu : " + sepatuW);
                    }
                    System.out.println("Harga : Rp." + hargaW);
                    System.out.println("Jumlah Barang : " + jmlW);
                    System.out.println("Total : " + totalW);
                    System.out.println("Diskon : (" + diskonW + "%) : Rp." + nodiskonW);
                    System.out.println("Total bayar : " + totalbayarW);
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("=====TOTAL PEMBAYARAN=====");
                    System.out.println("Nama barang : " + barangP);
                    if (barangP.equalsIgnoreCase("pakaian")) {
                        System.out.println("Jenis pakaian : " + pakaianP);
                    } else if (barangP.equalsIgnoreCase("sepatu")) {
                        System.out.println("Jenis sepatu : " + sepatuP);
                    }
                    System.out.println("Harga : Rp." + hargaP);
                    System.out.println("Jumlah Barang : " + jmlP);
                    System.out.println("Total : " + totalP);
                    System.out.println("Diskon : (" + diskonP + "%) : Rp." + nodiskonP);
                    System.out.println("Total bayar : " + totalbayarP);
                    break;
                case 5:
                    System.out.println("Program selesai");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Inputan salah");
                    break;
            }
        }
    }
}


package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.*;
import java.util.ArrayList;
import java.util.List;

public class penyewaanKamera_UTS {
    final static String FORMAT_TANGGAL = "dd/MM/yyyy";

    public static String formatRupiah(float nominal) {
        DecimalFormat formatDesimal = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols simbolFormatDesimal = new DecimalFormatSymbols();

        simbolFormatDesimal.setCurrencySymbol("Rp");

        formatDesimal.setDecimalFormatSymbols(simbolFormatDesimal);

        return formatDesimal.format(nominal);
    }

    public static boolean periksaTanggal(String tanggal) {
        try {
            DateFormat df = new SimpleDateFormat(FORMAT_TANGGAL);

            df.setLenient(false);
            df.parse(tanggal);

            return true;
        } catch (ParseException pe) {
            return false;
        }
    }

    public static void main(String[] args) {
        List<List<String>> kamera = new ArrayList<>();
        List<List<String>> penyewa = new ArrayList<>();
        List<List<String>> transaksi = new ArrayList<>();
        List<List<String>> pembayaran = new ArrayList<>();

        int kodeBarang = 1, kodePenyewa = 1, kodeTransaksi = 1, kodePembayaran = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int menu;

            System.out.println("==============================");
            System.out.println("Penyewaan Kamera");
            System.out.println("==============================");
            System.out.println("1. Masukan master barang");
            System.out.println("2. Masukan master penyewa");
            System.out.println("3. Cetak transaksi sewa");
            System.out.println("4. Cetak transaksi pembayaran");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu: ");

            try {
                menu = Integer.parseInt(br.readLine());
            } catch (IOException ioe) {
                System.out.println();

                System.out.println("Terjadi kesalahan.");

                System.out.println();

                continue;
            } catch (NumberFormatException nfe) {
                System.out.println();

                System.out.println("Harap masukan angka 1-5.");

                System.out.println();

                continue;
            }

            if (menu == 1) {
                int jumlahBarang;

                System.out.println();

                while (true) {
                    System.out.println("==============================");
                    System.out.println("Masukan Master Barang");
                    System.out.println("==============================");

                    System.out.print("Jumlah barang: ");

                    try {
                        jumlahBarang = Integer.parseInt(br.readLine());
                    } catch (IOException ioe) {
                        System.out.println();

                        System.out.println("Terjadi kesalahan.");

                        System.out.println();

                        continue;
                    } catch (NumberFormatException nfe) {
                        System.out.println();

                        System.out.println("Harap masukan angka.");

                        System.out.println();

                        continue;
                    }

                    if (jumlahBarang > 0) {
                        break;
                    } else {
                        System.out.println();

                        System.out.println("Jumlah barang minimal 1 buah.");

                        System.out.println();
                    }
                }

                int barangKe = 1;

                while (barangKe <= jumlahBarang) {
                    List<String> dataKamera = new ArrayList<>();

                    String merekKamera;

                    int hargaSewa;

                    dataKamera.add("K" + String.format("%03d", kodeBarang));

                    System.out.println();

                    System.out.printf("Barang ke-%02d%n", barangKe);

                    while (true) {
                        System.out.print("Merek kamera: ");

                        try {
                            merekKamera = br.readLine();
                        } catch (IOException ioe) {
                            System.out.println();

                            System.out.println("Terjadi kesalahan.");

                            System.out.println();

                            continue;
                        }

                        if (!merekKamera.isEmpty()) {
                            dataKamera.add(merekKamera);

                            break;
                        } else {
                            System.out.println();

                            System.out.println("Merek kamera tidak boleh kosong.");

                            System.out.println();
                        }
                    }

                    while (true) {
                        System.out.print("Harga sewa per hari: ");

                        try {
                            hargaSewa = Integer.parseInt(br.readLine());
                        } catch (IOException ioe) {
                            System.out.println();

                            System.out.println("Terjadi kesalahan.");

                            System.out.println();

                            continue;
                        } catch (NumberFormatException nfe) {
                            System.out.println();

                            System.out.println("Harap masukan angka.");

                            System.out.println();

                            continue;
                        }

                        if (hargaSewa > 0) {
                            dataKamera.add(String.valueOf(hargaSewa));

                            break;
                        } else {
                            System.out.println();

                            System.out.printf("Harga sewa minimal %s.%n", formatRupiah(1));

                            System.out.println();
                        }
                    }

                    kamera.add(dataKamera);

                    barangKe++;
                    kodeBarang++;
                }

                System.out.println();
            } else if (menu == 2) {
                int jumlahPenyewa;

                System.out.println();

                while (true) {
                    System.out.println("==============================");
                    System.out.println("Masukan Master Penyewa");
                    System.out.println("==============================");

                    System.out.print("Jumlah penyewa: ");

                    try {
                        jumlahPenyewa = Integer.parseInt(br.readLine());
                    } catch (IOException ioe) {
                        System.out.println();

                        System.out.println("Terjadi kesalahan.");

                        System.out.println();

                        continue;
                    } catch (NumberFormatException nfe) {
                        System.out.println();

                        System.out.println("Harap masukan angka.");

                        System.out.println();

                        continue;
                    }

                    if (jumlahPenyewa > 0) {
                        break;
                    } else {
                        System.out.println();

                        System.out.println("Jumlah penyewa minimal 1 orang.");

                        System.out.println();
                    }
                }

                int penyewaKe = 1;

                while (penyewaKe <= jumlahPenyewa) {
                    List<String> dataPenyewa = new ArrayList<>();

                    String nama, alamat, noTelp;

                    dataPenyewa.add("P" + String.format("%02d", kodePenyewa));

                    System.out.println();

                    System.out.printf("Penyewa ke-%02d%n", penyewaKe);

                    while (true) {
                        System.out.print("Nama: ");

                        try {
                            nama = br.readLine();
                        } catch (IOException ioe) {
                            System.out.println();

                            System.out.println("Terjadi kesalahan.");

                            System.out.println();

                            continue;
                        }

                        if (!nama.isEmpty() && !nama.matches(".*\\d.*")) {
                            dataPenyewa.add(nama);

                            break;
                        } else if (nama.matches(".*\\d.*")) {
                            System.out.println();

                            System.out.println("Nama tidak boleh mengandung angka.");

                            System.out.println();
                        } else {
                            System.out.println();

                            System.out.println("Nama tidak boleh kosong.");

                            System.out.println();
                        }
                    }

                    while (true) {
                        System.out.print("Alamat: ");

                        try {
                            alamat = br.readLine();
                        } catch (IOException ioe) {
                            System.out.println();

                            System.out.println("Terjadi kesalahan.");

                            System.out.println();

                            continue;
                        }

                        if (!alamat.isEmpty()) {
                            dataPenyewa.add(alamat);

                            break;
                        } else {
                            System.out.println();

                            System.out.println("Alamat tidak boleh kosong.");

                            System.out.println();
                        }
                    }

                    while (true) {
                        System.out.print("No. Telp: ");

                        try {
                            noTelp = br.readLine();
                        } catch (IOException ioe) {
                            System.out.println();

                            System.out.println("Terjadi kesalahan.");

                            System.out.println();

                            continue;
                        }

                        if (!noTelp.isEmpty() && !noTelp.matches(".*[a-zA-Z]+.*")) {
                            dataPenyewa.add(noTelp);

                            break;
                        } else if (noTelp.matches(".*[a-zA-Z]+.*")) {
                            System.out.println();

                            System.out.println("No. Telp tidak boleh mengandung huruf.");

                            System.out.println();
                        } else {
                            System.out.println();

                            System.out.println("No. Telp tidak boleh kosong.");

                            System.out.println();
                        }
                    }

                    penyewa.add(dataPenyewa);

                    penyewaKe++;
                    kodePenyewa++;
                }

                System.out.println();
            } else if (menu == 3) {
                System.out.println();

                System.out.println("==============================");
                System.out.println("Cetak Transaksi Sewa");
                System.out.println("==============================");

                if (kamera.size() > 0 && penyewa.size() > 0) {
                    System.out.println("Master Barang");
                    System.out.println("+-------------+-------------------+--------------+");
                    System.out.println("| Kode Barang | Merek Kamera      | Harga Sewa   |");
                    System.out.println("+-------------+-------------------+--------------+");

                    for (List<String> data : kamera) {
                        System.out.printf(
                                "| %-11s | %-17s | %-12s |%n",
                                data.get(0),
                                data.get(1),
                                formatRupiah(Float.parseFloat(data.get(2))));
                    }

                    System.out.println("+-------------+-------------------+--------------+");

                    System.out.println();

                    System.out.println("Transaksi Sewa");

                    int transaksiKe = 1;

                    while (transaksiKe <= penyewa.size()) {
                        List<String> dataTransaksi = new ArrayList<>();

                        String tanggal, kodeBarangTransaksi;

                        int harga = 0, jumlahKamera, lamaHari, diskon;

                        dataTransaksi.add("T" + String.format("%02d", kodeTransaksi));
                        dataTransaksi.add(penyewa.get(transaksiKe - 1).get(1));
                        dataTransaksi.add(penyewa.get(transaksiKe - 1).get(2));
                        dataTransaksi.add(penyewa.get(transaksiKe - 1).get(3));

                        if (transaksiKe > 1) {
                            System.out.println();
                        }

                        System.out.printf("Transaksi ke-%02d (%s)%n", transaksiKe, penyewa.get(transaksiKe - 1).get(1));

                        while (true) {
                            System.out.printf("Tanggal (%s): ", FORMAT_TANGGAL);

                            try {
                                tanggal = br.readLine();
                            } catch (IOException ioe) {
                                System.out.println();

                                System.out.println("Terjadi kesalahan.");

                                System.out.println();

                                continue;
                            }

                            if (periksaTanggal(tanggal)) {
                                dataTransaksi.add(tanggal);

                                break;
                            } else {
                                System.out.println();

                                System.out.println("Tanggal tidak valid.");

                                System.out.println();
                            }
                        }

                        while (true) {
                            boolean ketemu = false;

                            System.out.print("Kode barang: ");

                            try {
                                kodeBarangTransaksi = br.readLine();
                            } catch (IOException ioe) {
                                System.out.println();

                                System.out.println("Terjadi kesalahan.");

                                System.out.println();

                                continue;
                            }

                            for (List<String> data : kamera) {
                                if (kodeBarangTransaksi.toUpperCase().equals(data.get(0))) {
                                    ketemu = true;

                                    harga = Integer.parseInt(data.get(2));

                                    break;
                                }
                            }

                            if (ketemu) {
                                dataTransaksi.add(kodeBarangTransaksi.toUpperCase());
                                dataTransaksi.add(String.valueOf(harga));

                                break;
                            } else {
                                System.out.println();

                                System.out.println("Kode barang tidak dapat ditemukan.");

                                System.out.println();
                            }
                        }

                        while (true) {
                            System.out.print("Jumlah kamera: ");

                            try {
                                jumlahKamera = Integer.parseInt(br.readLine());
                            } catch (IOException ioe) {
                                System.out.println();

                                System.out.println("Terjadi kesalahan.");

                                System.out.println();

                                continue;
                            } catch (NumberFormatException nfe) {
                                System.out.println();

                                System.out.println("Harap masukan angka.");

                                System.out.println();

                                continue;
                            }

                            if (jumlahKamera > 0) {
                                dataTransaksi.add(String.valueOf(jumlahKamera));

                                break;
                            } else {
                                System.out.println();

                                System.out.println("Jumlah kamera yang disewa minimal 1 buah.");

                                System.out.println();
                            }
                        }

                        while (true) {
                            System.out.print("Lama hari: ");

                            try {
                                lamaHari = Integer.parseInt(br.readLine());
                            } catch (IOException ioe) {
                                System.out.println();

                                System.out.println("Terjadi kesalahan.");

                                System.out.println();

                                continue;
                            } catch (NumberFormatException nfe) {
                                System.out.println();

                                System.out.println("Harap masukan angka.");

                                System.out.println();

                                continue;
                            }

                            if (lamaHari > 0) {
                                dataTransaksi.add(String.valueOf(lamaHari));

                                if (lamaHari < 3) {
                                    diskon = 0;
                                } else if (lamaHari < 7) {
                                    diskon = 10;
                                } else {
                                    diskon = 30;
                                }

                                double total = (harga * jumlahKamera * lamaHari) * (100 - diskon) / 100.0;

                                dataTransaksi.add(String.valueOf(diskon));
                                dataTransaksi.add(String.valueOf(total));

                                break;
                            } else {
                                System.out.println();

                                System.out.println("Lama hari minimal 1 hari.");

                                System.out.println();
                            }
                        }

                        transaksi.add(dataTransaksi);

                        transaksiKe++;
                        kodeTransaksi++;
                    }

                    penyewa.clear();

                    System.out.println();

                    System.out.println(
                            "+---------------+------------+-------+----------+----------+-------------+---------------+-----------+--------------+--------+-------------------+");
                    System.out.println(
                            "| No. Transaksi | Tanggal    | Nama  | Alamat   | No. Telp | Kode Barang | Jumlah Kamera | Lama Sewa | Harga Sewa   | Diskon | Total             |");
                    System.out.println(
                            "+---------------+------------+-------+----------+----------+-------------+---------------+-----------+--------------+--------+-------------------+");

                    for (List<String> data : transaksi) {
                        System.out.printf(
                                "| %-13s | %-10s | %-5s | %-8s | %-8s | %-11s | %13s | %9s | %-12s | %5s%% | %-17s |%n",
                                data.get(0),
                                data.get(4),
                                data.get(1),
                                data.get(2),
                                data.get(3),
                                data.get(5),
                                data.get(7),
                                data.get(8),
                                formatRupiah(Float.parseFloat(data.get(6))),
                                data.get(9),
                                formatRupiah(Float.parseFloat(data.get(10))));
                    }

                    System.out.println(
                            "+---------------+------------+-------+----------+----------+-------------+---------------+-----------+--------------+--------+-------------------+");
                } else {
                    System.out.println("Harap masukan master barang\ndan/atau master penyewa.");
                }

                System.out.println();
            } else if (menu == 4) {
                System.out.println();

                System.out.println("==============================");
                System.out.println("Cetak Transaksi Pembayaran");
                System.out.println("==============================");

                if (transaksi.size() > 0) {
                    int pembayaranKe = 1;

                    while (pembayaranKe <= transaksi.size()) {
                        List<String> dataPembayaran = new ArrayList<>();

                        int uangBayar;

                        dataPembayaran.add("B" + String.format("%02d", kodePembayaran));
                        dataPembayaran.add(transaksi.get(pembayaranKe - 1).get(0));
                        dataPembayaran.add(transaksi.get(pembayaranKe - 1).get(4));
                        dataPembayaran.add(transaksi.get(pembayaranKe - 1).get(10));

                        while (true) {
                            System.out.printf("Uang bayar (%s): ", transaksi.get(pembayaranKe - 1).get(1));

                            try {
                                uangBayar = Integer.parseInt(br.readLine());
                            } catch (IOException ioe) {
                                System.out.println();

                                System.out.println("Terjadi kesalahan.");

                                System.out.println();

                                continue;
                            } catch (NumberFormatException nfe) {
                                System.out.println();

                                System.out.println("Harap masukan angka.");

                                System.out.println();

                                continue;
                            }

                            if (uangBayar > 0) {
                                dataPembayaran.add(String.valueOf(uangBayar));

                                if (uangBayar >= Float.parseFloat(transaksi.get(pembayaranKe - 1).get(10))) {
                                    dataPembayaran.add("Lunas");
                                    dataPembayaran.add(String.valueOf(
                                            uangBayar - Float.parseFloat(transaksi.get(pembayaranKe - 1).get(10))));
                                } else {
                                    dataPembayaran.add("Belum Lunas");
                                    dataPembayaran.add("0");
                                }

                                break;
                            } else {
                                System.out.println();

                                System.out.printf("Uang bayar minimal %s.%n", formatRupiah(1));

                                System.out.println();
                            }
                        }

                        pembayaran.add(dataPembayaran);

                        pembayaranKe++;
                        kodePembayaran++;
                    }

                    transaksi.clear();

                    System.out.println();

                    System.out.println(
                            "+----------------+---------------+------------+-------------------+-------------------+-------------+-------------------+");
                    System.out.println(
                            "| No. Pembayaran | No. Transaksi | Tanggal    | Total             | Uang Bayar        | Status      | Kembalian         |");
                    System.out.println(
                            "+----------------+---------------+------------+-------------------+-------------------+-------------+-------------------+");

                    for (List<String> data : pembayaran) {
                        System.out.printf(
                                "| %-14s | %-13s | %-10s | %-17s | %-17s | %-11s | %-17s |%n",
                                data.get(0),
                                data.get(1),
                                data.get(2),
                                formatRupiah(Float.parseFloat(data.get(3))),
                                formatRupiah(Float.parseFloat(data.get(4))),
                                data.get(5),
                                formatRupiah(Float.parseFloat(data.get(6))));
                    }

                    System.out.println(
                            "+----------------+---------------+------------+-------------------+-------------------+-------------+-------------------+");

                } else {
                    System.out.println("Cetak transaksi sewa masih kosong.");
                }

                System.out.println();
            } else if (menu == 5) {
                break;
            } else {
                System.out.printf("Menu %d tidak ada.%n", menu);

                System.out.println();
            }
        }
    }
}
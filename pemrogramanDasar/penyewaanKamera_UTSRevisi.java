
package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class penyewaanKamera_UTSRevisi {
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
        List<List<String>> penyewa = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("==============================");
            System.out.println("Penyewaan Kamera");
            System.out.println("==============================");
            System.out.println("1. Masukan data penyewa");
            System.out.println("2. Cetak data penyewa");
            System.out.println("3. Keluar");

            System.out.print(">> ");

            try {
                int menu = Integer.parseInt(br.readLine());

                if (menu == 1) {
                    System.out.println();

                    System.out.println("==============================");
                    System.out.println("Masukan Data Penyewa");
                    System.out.println("==============================");

                    while (true) {
                        System.out.print("Jumlah penyewa: ");

                        try {
                            int jumlahPenyewa = Integer.parseInt(br.readLine());

                            System.out.println();

                            if (jumlahPenyewa > 0) {
                                List<List<String>> kamera = Arrays.asList(
                                        Arrays.asList("K001", "Canon 6D Mark II", "300000"),
                                        Arrays.asList("K002", "Canon 1200D", "150000"),
                                        Arrays.asList("K003", "Canon 40D IR", "250000"),
                                        Arrays.asList("K004", "Nikon D850", "400000"),
                                        Arrays.asList("K005", "Nikon D600", "350000"),
                                        Arrays.asList("K006", "Nikon D90", "100000"));

                                System.out.println("+------+----------------------+--------------+");
                                System.out.println("| Kode | Nama Kamera          | Harga        |");
                                System.out.println("+------+----------------------+--------------+");

                                for (List<String> data : kamera) {
                                    System.out.printf(
                                            "| %-4s | %-20s | %-12s |%n",
                                            data.get(0),
                                            data.get(1),
                                            formatRupiah(Float.parseFloat(data.get(2))));
                                }

                                System.out.println("+------+----------------------+--------------+");

                                int penyewaKe = 1;
                                int transaksiKe = 1;

                                for (int indeks = 0; indeks < jumlahPenyewa; indeks++) {
                                    List<String> dataPenyewa = new ArrayList<>();

                                    String nama, alamat, telp, tanggalSewa;

                                    String namaKamera = null;
                                    String kode = null;
                                    String hargaKamera = null;

                                    int jumlahKamera, lamaSewa;
                                    double diskon = 0, total = 0, totalAwal = 0, bayar = 0, kembalian = 0;

                                    System.out.println();

                                    System.out.printf("Penyewa #%s%n", String.format("%02d", penyewaKe));

                                    while (true) {
                                        System.out.print("Nama: ");

                                        try {
                                            nama = br.readLine();

                                            if (!nama.matches(".*\\d.*")) {
                                                break;
                                            } else if (nama.isEmpty()) {
                                                System.out.println();

                                                System.out.println("Nama tidak boleh kosong.");

                                                System.out.println();
                                            } else {
                                                System.out.println();

                                                System.out.println("Nama tidak boleh mengandung angka.");

                                                System.out.println();
                                            }
                                        } catch (IOException ioe) {
                                            System.out.println();

                                            System.out.println("Terjadi kesalahan.");

                                            System.out.println();
                                        }
                                    }

                                    while (true) {
                                        System.out.print("Alamat: ");

                                        try {
                                            alamat = br.readLine();

                                            if (!alamat.isEmpty()) {
                                                break;
                                            } else {
                                                System.out.println();

                                                System.out.println("Alamat tidak boleh kosong.");

                                                System.out.println();
                                            }
                                        } catch (IOException ioe) {
                                            System.out.println();

                                            System.out.println("Terjadi kesalahan.");

                                            System.out.println();
                                        }
                                    }

                                    while (true) {
                                        System.out.print("Telp: ");

                                        try {
                                            telp = br.readLine();

                                            if (!telp.matches(".*[a-zA-Z]+.*]")) {
                                                break;
                                            } else if (telp.isEmpty()) {
                                                System.out.println();

                                                System.out.println("Telp tidak boleh kosong.");

                                                System.out.println();
                                            } else {
                                                System.out.println();

                                                System.out.println("Telp tidak boleh mengandung huruf.");

                                                System.out.println();
                                            }
                                        } catch (IOException ioe) {
                                            System.out.println();

                                            System.out.println("Terjadi kesalahan.");

                                            System.out.println();
                                        }
                                    }

                                    while (true) {
                                        System.out.print("Tanggal sewa (dd/MM/yyyy): ");

                                        try {
                                            tanggalSewa = br.readLine();

                                            if (periksaTanggal(tanggalSewa)) {
                                                break;
                                            } else {
                                                System.out.println();

                                                System.out.println("Format tanggal tidak valid.");

                                                System.out.println();
                                            }
                                        } catch (IOException ioe) {
                                            System.out.println();

                                            System.out.println("Terjadi kesalahan.");

                                            System.out.println();
                                        }
                                    }

                                    while (true) {
                                        System.out.print("Kode kamera: ");

                                        try {
                                            String kodeKamera = br.readLine().toUpperCase();

                                            boolean ketemu = false;

                                            for (List<String> data : kamera) {
                                                if (kodeKamera.equals(data.get(0))) {
                                                    ketemu = true;

                                                    namaKamera = data.get(1);
                                                    kode = data.get(0);
                                                    hargaKamera = data.get(2);

                                                    break;
                                                }
                                            }

                                            if (ketemu) {
                                                break;
                                            } else {
                                                System.out.println();

                                                System.out.println("Kode kamera tidak dapat ditemukan.");

                                                System.out.println();
                                            }
                                        } catch (IOException ioe) {
                                            System.out.println();

                                            System.out.println("Terjadi kesalahan.");

                                            System.out.println();
                                        }
                                    }

                                    while (true) {
                                        System.out.print("Jumlah kamera: ");

                                        try {
                                            jumlahKamera = Integer.parseInt(br.readLine());

                                            if (jumlahKamera > 0) {
                                                break;
                                            } else {
                                                System.out.println();

                                                System.out.println("Minimal jumlah kamera yang disewa 1 buah.");

                                                System.out.println();
                                            }
                                        } catch (IOException ioe) {
                                            System.out.println();

                                            System.out.println("Terjadi kesalahan.");

                                            System.out.println();
                                        } catch (NumberFormatException nfe) {
                                            System.out.println();

                                            System.out.println("Harap masukan bilangan bulat.");

                                            System.out.println();
                                        }
                                    }

                                    while (true) {
                                        System.out.print("Lama sewa (dalam hari): ");

                                        try {
                                            lamaSewa = Integer.parseInt(br.readLine());

                                            if (lamaSewa > 0) {
                                                break;
                                            } else {
                                                System.out.println();

                                                System.out.println("Lama sewa minimal 1 hari.");

                                                System.out.println();
                                            }
                                        } catch (IOException ioe) {
                                            System.out.println();

                                            System.out.println("Terjadi kesalahan.");

                                            System.out.println();
                                        } catch (NumberFormatException nfe) {
                                            System.out.println();

                                            System.out.println("Harap masukan bilangan bulat.");

                                            System.out.println();
                                        }
                                    }

                                    totalAwal = jumlahKamera * lamaSewa * Integer.parseInt(hargaKamera);
                                    if (lamaSewa >= 3 && lamaSewa < 7) {
                                        diskon = totalAwal * 0.1;
                                        total = totalAwal - diskon;
                                    }
                                    if (lamaSewa >= 7) {
                                        diskon = totalAwal * 0.3;
                                        total = totalAwal - diskon;
                                    }
                                    if (lamaSewa < 3) {
                                        diskon = 0;
                                        total = totalAwal - diskon;
                                    }

                                    while (true) {
                                        System.out.print("Uang yang dibayar: ");

                                        try {
                                            bayar = Float.parseFloat(br.readLine());

                                            if (bayar >= total) {
                                                kembalian = bayar - total;
                                            } else if (bayar < total) {
                                                kembalian = 0;
                                            }

                                            if (bayar > 0) {
                                                break;
                                            } else {
                                                System.out.println();

                                                System.out.println("Jumlah bayar tidak boleh kosong.");

                                                System.out.println();
                                            }
                                        } catch (IOException ioe) {
                                            System.out.println();

                                            System.out.println("Terjadi kesalahan.");

                                            System.out.println();
                                        }
                                    }

                                    dataPenyewa.add("P" + String.format("%03d", penyewaKe));
                                    dataPenyewa.add(nama);
                                    dataPenyewa.add(alamat);
                                    dataPenyewa.add(telp);
                                    dataPenyewa.add(tanggalSewa);
                                    dataPenyewa.add(namaKamera);
                                    dataPenyewa.add(String.valueOf(jumlahKamera));
                                    dataPenyewa.add(String.valueOf(lamaSewa));
                                    dataPenyewa.add(kode);
                                    dataPenyewa.add(hargaKamera);
                                    dataPenyewa.add(String.valueOf(totalAwal));
                                    dataPenyewa.add(String.valueOf(diskon));
                                    dataPenyewa.add(String.valueOf(total));
                                    dataPenyewa.add("T" + String.format("%03d", transaksiKe));
                                    dataPenyewa.add(String.valueOf(bayar));
                                    dataPenyewa.add(String.valueOf(kembalian));

                                    penyewa.add(dataPenyewa);

                                    penyewaKe++;
                                    transaksiKe++;
                                }

                                System.out.println();

                                break;
                            } else {
                                System.out.println("Jumlah penyewa minimal 1 orang.");
                            }

                            System.out.println();
                        } catch (IOException ioe) {
                            System.out.println();

                            System.out.println("Terjadi kesalahan.");

                            System.out.println();
                        } catch (NumberFormatException nfe) {
                            System.out.println();

                            System.out.println("Harap masukan bilangan bulat.");

                            System.out.println();
                        }
                    }
                } else if (menu == 2) {
                    System.out.println();

                    System.out.println("==============================");
                    System.out.println("Cetak Data Penyewa");
                    System.out.println("==============================");

                    if (penyewa.size() > 0) {
                        System.out.println();

                        System.out.println("Penyewa");

                        System.out.println("+------+---------+------------+---------+");
                        System.out.println("| Kode | Nama    | Alamat     | Telp    |");
                        System.out.println("+------+---------+------------+---------+");

                        for (List<String> data : penyewa) {
                            System.out.printf(
                                    "| %-4s | %-7s | %-10s | %-7s |%n",
                                    data.get(0),
                                    data.get(1),
                                    data.get(2),
                                    data.get(3));
                        }

                        System.out.println("+------+---------+------------+---------+");

                        System.out.println();

                        System.out.println("Kamera yang Disewa");

                        System.out.println("+------+----------------------+--------------+--------+");
                        System.out.println("| Kode | Nama Kamera          | Tanggal Sewa | Jumlah |");
                        System.out.println("+------+----------------------+--------------+--------+");

                        for (List<String> data : penyewa) {
                            System.out.printf(
                                    "| %-4s | %-20s | %-12s | %6s |%n",
                                    data.get(0),
                                    data.get(5),
                                    data.get(4),
                                    data.get(6));
                        }

                        System.out.println("+------+----------------------+--------------+--------+");

                        System.out.println();

                        System.out.println("Transaksi");

                        System.out.println(
                                "+----------------+--------------+-------------+-------------------+--------+------------------+-----------------+------------+-----------+-------------+---------------+");
                        System.out.println(
                                "| Kode Transaksi | Kode Pembeli | Kode Kamera | Harga Sewa (hari) | Jumlah | Lama Sewa (hari) | Total Awal Sewa |   Diskon   |   Total   |    Bayar    |   Kembalian   |");
                        System.out.println(
                                "+----------------+--------------+-------------+-------------------+--------+------------------+-----------------+------------+-----------+-------------+---------------+");

                        for (List<String> data : penyewa) {
                            System.out.printf(
                                    "| %14s | %12s | %11s | %-17s | %6s | %16s | %-15s | %-10s | %-9s | %-11s | %-13s |%n",
                                    data.get(13),
                                    data.get(0),
                                    data.get(8),
                                    data.get(9),
                                    data.get(6),
                                    data.get(7),
                                    data.get(10),
                                    data.get(11),
                                    data.get(12),
                                    data.get(14),
                                    data.get(15));
                        }

                        System.out.println(
                                "+----------------+--------------+-------------+-------------------+--------+------------------+-----------------+------------+-----------+-------------+---------------+");

                    } else {
                        System.out.println("Tidak ada data yang bisa ditampilkan.");
                    }

                    System.out.println();
                } else if (menu == 3) {
                    break;
                } else {
                    System.out.println();

                    System.out.println("Harap masukan angka 1-3.");

                    System.out.println();
                }
            } catch (IOException ioe) {
                System.out.println();

                System.out.println("Terjadi kesalahan.");

                System.out.println();
            } catch (NumberFormatException nfe) {
                System.out.println();

                System.out.println("Harap masukan bilangan bulat.");

                System.out.println();
            }
        }
    }
}

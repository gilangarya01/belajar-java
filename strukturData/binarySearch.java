
package strukturData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class binarySearch {
  public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int arr[] = { 9, 10, 15, 20, 26, 31, 36, 39, 42, 45, 48, 50, 53, 57, 59 };

    System.out.println("Data = [9,10,15,20,26,31,36,39,42,45,48,50,53,57,59]");
    System.out.print("Masukkan angka yang dicari : ");
    int cari = Integer.parseInt(br.readLine());
    int awal = 0;
    int akhir = arr.length - 1;
    int tengah = 0;

    while (awal <= akhir) {
      tengah = (awal + akhir) / 2;
      if (arr[tengah] < cari) {
        awal = tengah + 1;
      } else if (arr[tengah] == cari) {
        System.out.println("Element " + arr[tengah] + " ditemukan di index ke-" + tengah);
        break;
      } else {
        akhir = tengah - 1;
      }
    }
    if (awal > akhir)
      System.out.println("Element tidak ditemukan!");
  }
}

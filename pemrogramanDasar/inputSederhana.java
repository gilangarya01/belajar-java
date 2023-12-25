
package pemrogramanDasar;

import java.util.*;

public class inputSederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====INPUT====");
        System.out.print("Masukkan nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan umur : ");
        int umur = sc.nextInt();
        System.out.print("Masukkan penghasilan : ");
        int penghasilan = sc.nextInt();

        System.out.println("");
        System.out.println("====OUTPUT====");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Penghasilan : " + penghasilan);
    }
}


package pemrogramanDasar;

import java.util.Stack;

public class tugasStackPiring {
    public static void main(String[] args) {
        Stack<String> piringKotor = new Stack<String>();
        Stack<String> piringBersih = new Stack<String>();
        int jumlahPiring = 5;

        for (int i = 1; i <= jumlahPiring; i++) {
            piringKotor.push("Piring " + i);
        }
        System.out.println("SEBELUM DICUCI");
        System.out.println("Jumlah piring kotor : " + piringKotor.size());
        System.out.println("Jumlah piring bersih : " + piringBersih.size());
        System.out.println("Tumpukan piring kotor :");

        for (int i = 1; i <= jumlahPiring; i++) {
            System.out.println(piringKotor.peek());
            piringBersih.push(piringKotor.pop());
        }
        System.out.println("");
        System.out.println("SETELAH DICUCI");
        System.out.println("Jumlah piring kotor : " + piringKotor.size());
        System.out.println("Jumlah piring bersih : " + piringBersih.size());
        System.out.println("Tumpukan piring bersih :");

        for (int i = jumlahPiring - 1; i >= 0; i--) {
            System.out.println(piringBersih.elementAt(i));
        }
    }
}
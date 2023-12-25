
package strukturData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class hashTable {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();

        hashtable.put(1, 9);
        hashtable.put(2, 10);
        hashtable.put(3, 15);
        hashtable.put(4, 20);
        hashtable.put(5, 26);
        hashtable.put(6, 31);
        hashtable.put(7, 36);
        hashtable.put(8, 39);
        hashtable.put(9, 42);
        hashtable.put(10, 45);

        System.out.println("Hashtable : " + hashtable);
        System.out.println("");
        System.out.print("Masukkan key yang dicari : ");
        int cari = Integer.parseInt(br.readLine());

        if (hashtable.containsKey(cari) == true) {
            int a = hashtable.get(cari);
            System.out.println("Key " + cari + " Memiliki data " + a);
        } else {
            System.out.println("Key " + cari + " tidak ditemukan");
        }
    }
}


package pemrogramanDasar;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

public class AntreanMahasiswaQueue {
    public static void main(String[] args) throws InterruptedException {
        Queue<String> mahasiswa = new LinkedList<>();

        mahasiswa.add("Ananda");
        mahasiswa.add("Akbar");
        mahasiswa.add("Alif");

        System.out.printf("Mahasiswa yang antre: %s%n%n", mahasiswa);

        /* jeda selama 1 detik */
        TimeUnit.SECONDS.sleep(1);
        mahasiswa.remove();
        System.out.printf("Jumlah antrean berkurang 1.%n%n");

        /* jeda selama 1 detik */
        TimeUnit.SECONDS.sleep(1);

        System.out.printf("Sisa mahasiswa yang antre: %s%n", mahasiswa);
    }
}

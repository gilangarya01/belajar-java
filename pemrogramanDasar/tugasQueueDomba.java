
package pemrogramanDasar;

import java.util.LinkedList;
import java.util.Queue;

public class tugasQueueDomba {
    public static void main(String[] args) {
        Queue<String> antrianDomba = new LinkedList<>();

        System.out.println("Antrian Domba Kelas Queue");
        System.out.println("");

        antrianDomba.add("Domba A");
        antrianDomba.add("Domba B");
        antrianDomba.add("Domba C");
        antrianDomba.add("Domba D");
        antrianDomba.add("Domba E");
        antrianDomba.add("Domba F");
        antrianDomba.add("Domba G");
        antrianDomba.add("Domba H");
        antrianDomba.add("Domba I");
        antrianDomba.add("Domba J");
        antrianDomba.add("Domba K");

        System.out.println("Kondisi Antrian Domba");
        for (int i = 0; i < antrianDomba.size() - 1; i++) {
            System.out.println(i + ". " + antrianDomba.peek());
            antrianDomba.add(antrianDomba.poll());
        }
        System.out.println("10. " + antrianDomba.peek() + " ekor");
        antrianDomba.add(antrianDomba.poll());

        for (int i = 0; i < 5; i++) {
            System.out.println("deQueue : " + antrianDomba.poll());
        }

        System.out.println("");
        antrianDomba.add("Domba A");
        antrianDomba.add("Domba B");
        antrianDomba.add("Domba C");
        antrianDomba.add("Domba D");
        antrianDomba.add("Domba E");

        System.out.println("Kondisi Antrian Domba");
        for (int i = 0; i < antrianDomba.size() - 1; i++) {
            System.out.println(i + ". " + antrianDomba.peek());
            antrianDomba.add(antrianDomba.poll());
        }
        System.out.println("10. " + antrianDomba.peek() + " ekor");
        antrianDomba.add(antrianDomba.poll());
    }
}

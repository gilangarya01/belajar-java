
package pemrogramanDasar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class angkaFibonacciRekursif {
    // Fungsi Rekursif Fibonacci
    public static int Fibonacci(int angka) {
        if ((angka == 0) || (angka == 1)) {
            return angka;
        } else {
            return Fibonacci(angka - 1) + Fibonacci(angka - 2);
        }
    }

    // Main Program
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = 0, x = 0;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Menghitung Angka Fibonacci dengan rekursif");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Masukaan Angka : ");
        input = Integer.parseInt(br.readLine());

        for (int i = 0; i < input; i++) {
            x += Fibonacci(i);
        }
        System.out.println("Angka Fibonacci dari (" + input + ") adalah " + x);
    }
}

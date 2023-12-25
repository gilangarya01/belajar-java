
package strukturData;

import java.util.Scanner;

public class inputMatriksSederhana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        int[][] x = new int[3][3];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("Masukkan angka ke-[" + i + "][" + j + "] : ");
                angka = sc.nextInt();
                x[i][j] = angka;
            }
        }
        System.out.println("");
        System.out.println("===Matrik===");
        for (int k = 0; k < x.length; k++) {
            for (int l = 0; l < x[k].length; l++) {
                System.out.print(x[k][l] + " ");
            }
            System.out.println("");
        }
    }
}

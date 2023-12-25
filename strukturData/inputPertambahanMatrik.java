
package strukturData;

import java.util.Scanner;

public class inputPertambahanMatrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        int[][] x = new int[3][3];
        int[][] y = new int[3][3];
        int[][] z = new int[3][3];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("Masukkan matrik ke-[" + i + "][" + j + "] : ");
                angka = sc.nextInt();
                x[i][j] = angka;
            }
        }
        System.out.println("");
        for (int p = 0; p < x.length; p++) {
            for (int m = 0; m < x[p].length; m++) {
                System.out.print("Masukkan matrik 2 ke-[" + p + "][" + m + "] : ");
                angka = sc.nextInt();
                y[p][m] = angka;
            }
        }

        System.out.println("");
        System.out.println("===Matrik===");
        for (int k = 0; k < x.length; k++) {
            for (int l = 0; l < x[k].length; l++) {
                System.out.print(x[k][l] + " ");
            }
            System.out.print("    ");
            for (int n = 0; n < y[k].length; n++) {
                System.out.print(y[k][n] + " ");
            }
            System.out.print("    ");
            for (int o = 0; o < y[k].length; o++) {
                z[k][o] = y[k][o] + x[k][o];
                System.out.print(z[k][o] + " ");
            }

            System.out.println("");
        }
    }
}

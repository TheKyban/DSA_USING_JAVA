package DSA.Arrays;

import java.util.Scanner;

public class unionOfSet {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length of arrays: ");

        int n = scn.nextInt();

        int m = scn.nextInt();

        int[] a = new int[n];

        int[] b = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = scn.nextInt();

        }

        for (int i = 0; i < m; i++) {

            b[i] = scn.nextInt();

            boolean check = false;

            for (int j = 0; j < n; j++) {

                if (b[i] == a[j]) {

                    check = true;

                    break;

                }

            }
            scn.close();

            if (!check) {

                System.out.println(b[i]);

            }

        }

    }
}

package bullsandcows;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("ввидите число от 1 до 9");
            int a = in.nextInt();
            if (a > 9 || a < 1) {
                System.out.println("eror");
                System.exit(a);
            } else {
                if (a == 1) {
                    int z = (int) ((Math.random() * ((9 - 1))) + 1);
                    System.out.println(z);
                }
                if (a == 2) {
                    int z = (int) ((Math.random() * ((99 - 10))) + 10);
                    System.out.println(z);
                }
                if (a == 3) {
                    int z = (int) ((Math.random() * ((999 - 100))) + 100);
                    System.out.println(z);
                }
                if (a == 4) {
                    int z = (int) ((Math.random() * ((9999 - 1000))) + 1000);
                    System.out.println(z);
                }
                if (a == 5) {
                    int z = (int) ((Math.random() * ((99999 - 10000))) + 10000);
                    System.out.println(z);
                }
                if (a == 6) {
                    int z = (int) ((Math.random() * ((999999 - 100000))) + 100000);
                    System.out.println(z);
                }
                if (a == 7) {
                    int z = (int) ((Math.random() * ((9999999 - 1000000))) + 1000000);
                    System.out.println(z);
                }
                if (a == 8) {
                    int z = (int) ((Math.random() * ((99999999 - 10000000))) + 10000000);
                    System.out.println(z);
                }
                if (a == 9) {
                    int z = (int) ((Math.random() * ((999999999 - 100000000))) + 100000000);
                    System.out.println(z);
                }
            }


        }

    }
}
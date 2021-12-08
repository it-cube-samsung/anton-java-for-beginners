import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxValue = 1000000;
        System.out.println("введите число");
        int a = in.nextInt();

        for (int i = 1;; i++) {
            int s = a * i;
            if (s > maxValue) {
                System.out.println("Такого числа не существует1");
                break;
            }

            if (isValidNumber(s)) {
                System.out.println(s);
                break;
            }
        }
    }

    static boolean isValidNumber (int number){
        String z = String.valueOf(number);

        for (int n = 0; n < z.length(); n++) {

            if (z.charAt(n) == '1' || z.charAt(n) == '0') {
                continue;
            }
            return false;
        }

        return true;
    }

}




        }





    }
}

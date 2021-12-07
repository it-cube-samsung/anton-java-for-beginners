package bullsandcows;
import java.util.Objects;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int e = 0;
        int x = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        int r = 0;
        int g = 0;
        int v = 0;
        int n = 0;

      /*  int z = (int) ((Math.random() * ((9999 - 1000))) + 1000);
        System.out.println("код создан" + z);*/
        int countBulls = 0;
        int countCows = 0;
        String code = "9305";
        System.out.println("введите число");
        String userCode = in.nextLine();

        for (int j = 0; j < code.length(); j++) {
            char codeChar = code.charAt(j);
            char userCodeChar = userCode.charAt(j);

            if (codeChar == userCodeChar) {
                countBulls++;
                continue;
            }

            if (userCode.indexOf(codeChar) != -1) {
                countCows++;
            }
        }


        System.out.println("счет быков: " + countBulls + "  коров: " + countCows);





        int z = 9305;
        String b = String.valueOf(z);
        String[] parts = b.split("");

//        while (true) {
//
//
//            System.out.println("введите число");
//            int w = in.nextInt();
//            String s = String.valueOf(w);
//            String[] parts1 = s.split("");
//            if (Objects.equals(parts[0], parts1[0])) {
//                i = 1;
//
//            }
//            if (Objects.equals(parts[0], parts1[1])) {
//                e =  1;
//            }
//            if (Objects.equals(parts[0], parts1[2])) {
//                e = 1;
//            }
//            if (Objects.equals(parts[0], parts1[3])) {
//                e = 1;
//
//
//            }
//            if (Objects.equals(parts[1], parts1[1])) {
//                x = 1;
//
//            }
//            if (Objects.equals(parts[1], parts1[0])) {
//                c = 1;
//            }
//            if (Objects.equals(parts[1], parts1[2])) {
//                c = 1;
//            }
//            if (Objects.equals(parts[0], parts1[3])) {
//                c = 1;
//            }
//
//            if (Objects.equals(parts[2], parts1[2])) {
//                d = 1;
//            }
//
//            if (Objects.equals(parts[2], parts1[1])) {
//                f =  1;
//            }
//            if (Objects.equals(parts[2], parts1[0])) {
//                f = 1;
//            }
//            if (Objects.equals(parts[2], parts1[3])) {
//                f = 1;
//            }
//
//
//            if (Objects.equals(parts[3], parts1[3])) {
//                r =  1;
//
//            }
//            if (Objects.equals(parts[3], parts1[0])) {
//                g =1;
//            }
//            if (Objects.equals(parts[3], parts1[1])) {
//                g =1;
//            }
//            if (Objects.equals(parts[3], parts1[2])) {
//                g =1;
//            }
//
//            v = r + d +x + i;
//            n = g + f +c +e;
//
//
//
//            System.out.println("счет быков: " + v + "  коров: " + n);
//            if (v == 4){
//                System.out.println("win");
//                System.exit(r);
//            }
//        }
    }
}

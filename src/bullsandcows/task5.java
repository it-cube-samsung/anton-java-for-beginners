package bullsandcows;

import java.util.Random;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);

        String alphabet = "abcdef";

        char latter = (alphabet.charAt(r.nextInt(alphabet.length())));
        int index1 = (int) ((Math.random() * ((9))) + 0);
        int index2  = (int) ((Math.random() * ((9))) + 0);
        int index3 = (int) ((Math.random() * ((9))) + 0);
        String num1 = Integer.toString(index1);
        String num2 = Integer.toString(index2);
        String num3 = Integer.toString(index3);


        int cows = 0;
        int buls = 0;

        int random = (int) ((Math.random() * ((4))) + 1);

        String latteruser;

        String myStr = Character.toString(latter);





       // if(random == 1){
            System.out.println(latter + num1 + num2 + num3 );
            System.out.println("подсказка а123");
            System.out.println("введите число");

            latteruser = in.nextLine();
            String latu1 = String.valueOf(latteruser.charAt(0));
            String latu2 = String.valueOf(latteruser.charAt(1));
            String latu3 = String.valueOf(latteruser.charAt(2));
            String latu4 = String.valueOf(latteruser.charAt(3));

            if (latu1.equals(myStr)){
                buls++;
            }else if (latu1.equals(num1)){
                cows++;
            }else if (latu1.equals(num2)){
                cows++;
            }else if (latu1.equals(num3)){
                cows++;
            }

            if (latu2.equals(num1)){
                buls++;
            }else if (latu2.equals(myStr)){
                cows++;
            }else if (latu2.equals(num2)){
                cows++;
            }else if (latu2.equals(num3)){
                cows++;
            }

            if (latu3.equals(num2)){
                buls++;
            }else if (latu3.equals(myStr)){
                cows++;
            }else if (latu3.equals(num3)){
                cows++;
            }else if (latu3.equals(num1)){
                cows++;
            }

            if (latu4.equals(num3)){
                buls++;
            }else if (latu4.equals(myStr)){
                cows++;
            }else if (latu4.equals(num2)){
                cows++;
            }else if (latu4.equals(num1)){
                cows++;
            }

            System.out.println("итог " +buls+"," + cows);


       /* } if (random == 2){
            System.out.println( num1 + latter+ num2 + num3 );
            System.out.println("введите число");
            System.out.println("подсказка 1а23");
            latteruser = in.nextLine();
            String latu1 = String.valueOf(latteruser.charAt(0));
            String latu2 = String.valueOf(latteruser.charAt(1));
            String latu3 = String.valueOf(latteruser.charAt(2));
            String latu4 = String.valueOf(latteruser.charAt(3));


        }if (random == 3){
            System.out.println( num1 + num2 + latter + num3 );
            System.out.println("введите число");
            System.out.println("подсказка 12а3");
            latteruser = in.nextLine();
            String latu1 = String.valueOf(latteruser.charAt(0));
            String latu2 = String.valueOf(latteruser.charAt(1));
            String latu3 = String.valueOf(latteruser.charAt(2));
            String latu4 = String.valueOf(latteruser.charAt(3));


        }if (random == 4){
            System.out.println( num1 +  num2 + num3 + latter );
            System.out.println("введите число");
            System.out.println("подсказка 123а");
            latteruser = in.nextLine();
            String latu1 = String.valueOf(latteruser.charAt(0));
            String latu2 = String.valueOf(latteruser.charAt(1));
            String latu3 = String.valueOf(latteruser.charAt(2));
            String latu4 = String.valueOf(latteruser.charAt(3));


        }*/
    }
}

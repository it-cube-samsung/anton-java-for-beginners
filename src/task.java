import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("введите число");
        int usernumber = in.nextInt();
        int max = 1000000;
        int y = 0;

        char str1 = '1';
        char str0 = '0';









            for (int i = 1; i < 5000000; i++) {
                y = usernumber * i;
               String u = String.valueOf(y);

                if (y < max){
                    if (u.charAt(i) == str0 || u.charAt(i) == str1){
                        System.out.println(u);
                    }
                    else {
                        System.out.println("Такого числа не существует»");
                    }
                }


                }


            }


        }







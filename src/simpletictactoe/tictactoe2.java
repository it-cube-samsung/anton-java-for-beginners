package simpletictactoe;
import java.util.Scanner;

public class tictactoe2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int j = 0;
        int k = 3;
        System.out.println("введите");
        String cells = in.nextLine();
        System.out.println("-----------");
        for(int i = 0; i < 3; i++){
            System.out.println("| ");
            for (; j < k; j++){
                System.out.print(cells.charAt(j) + "");
            }
            k += 3;
            System.out.println("|");
        }
        System.out.println("----------");

    }
}

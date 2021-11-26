package coffeemachine;
import java.util.Scanner;

public class work3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
    int a = in.nextInt();
    int s = a / 200;
        System.out.println("Write how many ml of milk the coffee machine has:");
        int q = in.nextInt();
        int w = q / 50;
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int z = in.nextInt();
        int x = z / 15;
        System.out.println("Write how many cups of coffee you will need:");
        int d = in.nextInt();
        int min = Math.min(s,w);
    int min1 = Math.min(min,x);
        if (d > min1){
            System.out.println("No, I can make only " + min1 + " cup(s) of coffee");
        }else {
            System.out.println("Yes, I can make that amount of coffee");
        }

    }
}

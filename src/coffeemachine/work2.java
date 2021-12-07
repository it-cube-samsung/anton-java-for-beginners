package coffeemachine;
import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        System.out.println("Write how many cups of coffee you will need?");

        Scanner in = new Scanner(System.in);
        int ind = in.nextInt();
        System.out.println("For " + ind + " cups of coffee you will need:");
        int water = ind * 200;
        int milk = ind * 50;
        int coffee = ind * 15;
        System.out.println(water + " ml of water\n" +
                milk + " ml of milk\n" +
                coffee + " g of coffee beans");

    }
}

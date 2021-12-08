import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       import java.util.Scanner;


        int usermany = 0;




            String shark = "plush shark";
            String bear = "teddy bear";
            String car = "car";
            String table = "table games";
            String doll = "doll";
            String lego = "lego";
            String funko = "funko pop";



           String toy = shark + ", " + bear + ", " + car + ", " + table + ", " + doll + ", " + lego + ", " + funko;

           System.out.println("Что вы хотите купить из перечисленых");

            System.out.println(toy);
            String user = in.nextLine();

            if (user.equals(shark)) {
                System.out.println("она стоит 100 р \n" + "дайте денег");
                int r = in.nextInt();
                usermany = usermany + r;
                if (r > 100) {
                    int d = r - 100;
                    System.out.println("ваша сдача: " + d);
                    System.out.println("досвидания");
                    shark = "plush shark " +
                            "\n держите вашу игрушку";

                }
                if (r < 100) {
                    int d = 100 - r;
                    System.out.println("вам не хватает" + d);
                    System.out.println("выхотите вернуть деньги или хптите добавить для возврата нажмите-1, для продолжения нажмите-2");
                    int q = in.nextInt();
                    if (q == 1){
                        System.out.println("вам вернули ваши:" + d);
                        System.exit(-1);
                    }
                    if (q == 2){
                        System.out.println("вам не хватает " + d);
                        while (usermany != 100){
                            int t = in.nextInt();
                            usermany = usermany + t;
                        }
                        if (usermany == 100)
                        System.out.println("держите вашу игрушку");


                    }

                }
                if (r == 100) {
                    System.out.println("спасибо вы ввели ровно цену игрушки");
                    shark = "plush shark";

                }


            }

            if (user.equals(bear)) {
                System.out.println("она стоит 450 р \n" + "дайте денег");
                int r = in.nextInt();
                if (r > 450) {
                    int d = r - 450;
                    System.out.println("ваша сдача: " + d);
                    bear = "teddy bear " +
                            "\n держите вашу игрушку";

                }
                if (r < 450) {
                    int d = 450 - r;
                    System.out.println("вам не хватает " + d);


                    System.out.println("выхотите вернуть деньги или хптите добавить для возврата нажмите-1, для продолжения нажмите-2");
                    int q = in.nextInt();
                    if (q == 1){

                        System.exit(-1);
                    }
                    if (q == 2){
                        System.out.println("\n вам не хватает " + d);
                        while (usermany != 450){
                            int t = in.nextInt();
                            usermany = usermany + t;
                        }
                        if (usermany == 450)
                        System.out.println("держите вашу игрушку");


                    }
                }
                if (r == 450) {
                    System.out.println("спасибо вы ввели ровно цену игрушки");
                    bear = "teddy bear";

                }


            }

            if (user.equals(car)) {
                System.out.println("она стоит 150 р \n" + "дайте денег");
                int r = in.nextInt();
                if (r > 150) {
                    int d = r - 150;
                    System.out.println("ваша сдача: " + d + "\n держите вашу игрушку");
                    car = "car";

                }
                if (r < 150) {
                    int d = 150 - r;
                    System.out.println("вам не хватает: " + d);

                    System.out.println("выхотите вернуть деньги или хптите добавить для возврата нажмите-1, для продолжения нажмите-2");
                    int q = in.nextInt();
                    if (q == 1){
                        System.out.println("\n  вам вернули ваши:" + d);
                        System.exit(-1);
                    }
                    if (q == 2){
                        System.out.println("вам не хватает " + d);
                        while (usermany != 150){
                            int t = in.nextInt();
                            usermany = usermany + t;
                        }
                        if (usermany == 150)
                            System.out.println("держите вашу игрушку");


                    }
                }
                if (r == 150) {
                    System.out.println("спасибо вы ввели ровно цену игрушки");
                    car = "car";

                }


            }


            if (user.equals(table)) {
                System.out.println("она стоит 300 р \n" + "дайте денег");
                int r = in.nextInt();
                if (r > 300) {
                    int d = r - 300;
                    System.out.println("ваша сдача: " + d + "\n держите вашу игрушку");
                    table = "table games";

                }
                if (r < 300) {
                    int d = 300 - r;
                    System.out.println("вам не хватает " + d);

                    System.out.println("выхотите вернуть деньги или хптите добавить для возврата нажмите-1, для продолжения нажмите-2");
                    int q = in.nextInt();
                    if (q == 1){
                        System.out.println("\n вам вернули ваши:" + d);
                        System.exit(-1);
                    }
                    if (q == 2){
                        System.out.println("вам не хватает " + d);
                        while (usermany != 300){
                            int t = in.nextInt();
                            usermany = usermany + t;
                        }
                        if (usermany == 300)
                            System.out.println("держите вашу игрушку");


                    }
                }
                if (r == 300) {
                    System.out.println("спасибо вы ввели ровно цену игрушки");
                    table = "table games";

                }


            }

            if (user.equals(doll)) {
                System.out.println("она стоит 500 р \n" + "дайте денег");
                int r = in.nextInt();
                if (r > 500) {
                    int d = r - 500;
                    System.out.println("ваша сдача: " + d + "\n держите вашу игрушку");
                    doll = "doll";

                }
                if (r < 500) {
                    int d = 500 - r;
                    System.out.println("вам не хватает: " + d);

                    System.out.println("выхотите вернуть деньги или добавить для возврата нажмите-1, для продолжения нажмите-2");
                    int q = in.nextInt();
                    if (q == 1){
                        System.out.println("вам вернули ваши:" + d);
                        System.exit(-1);
                    }
                    if (q == 2){
                        System.out.println("\n вам не хватает " + d);
                        while (usermany != 500){
                            int t = in.nextInt();
                            usermany = usermany + t;
                        }
                        if (usermany == 500)
                            System.out.println("держите вашу игрушку");


                    }
                }
                if (r == 500) {
                    System.out.println("спасибо вы ввели ровно цену игрушки");
                    doll = "doll";

                }


            }


            if (user.equals(lego)) {
                System.out.println("она стоит 1000 р \n" + "дайте денег");
                int r = in.nextInt();
                if (r > 1000) {
                    int d = r - 1000;
                    System.out.println("ваша сдача: " + d +"\n держите вашу игрушку");
                    lego = "lego";

                }
                if (r < 1000) {
                    int d = 1000 - r;
                    System.out.println("вам не хватает" + d);

                    System.out.println("выхотите вернуть деньги или хптите добавить для возврата нажмите-1, для продолжения нажмите-2");
                    int q = in.nextInt();
                    if (q == 1){
                        System.out.println("\n  вам вернули ваши:" + d);
                        System.exit(-1);
                    }
                    if (q == 2){
                        System.out.println("вам не хватает " + d);
                        while (usermany != 1000){
                            int t = in.nextInt();
                            usermany = usermany + t;
                        }
                        if (usermany == 1000)
                            System.out.println("держите вашу игрушку");


                    }
                }
                if (r == 1000) {
                    System.out.println("спасибо вы ввели ровно цену игрушки");
                    lego = "lego";

                }


            }

            if (user.equals(funko)) {
                System.out.println("она стоит 5000 р \n" + "дайте денег");
                int r = in.nextInt();
                if (r > 5000) {
                    int d = r - 5000;
                    System.out.println("ваша сдача: " + d + "\n держите вашу игрушку");



                }
                if (r < 5000) {
                    int d = 5000 - r;
                    System.out.println("вам не хватает: " + d);

                    System.out.println("выхотите вернуть деньги или хптите добавить для возврата нажмите-1, для продолжения нажмите-2");
                    int q = in.nextInt();
                    if (q == 1){
                        System.out.println("вам вернули ваши:" + d);
                        System.exit(-1);
                    }
                    if (q == 2){
                        System.out.println("\n вам не хватает " + d);
                        while (usermany != 5000){
                            int t = in.nextInt();
                            usermany = usermany + t;
                        }
                        if (usermany == 5000)
                            System.out.println("держите вашу игрушку");


                    }
                }
                if (r == 5000) {
                    System.out.println("спасибо вы ввели ровно цену игрушки");
                    funko = "funko pop - закончились";
                    String funkoended = shark + ", " + bear + ", " + car + ", " + table + ", " + doll + ", " + lego + ", " + funko;
                    System.out.println(funkoended);
                }


            }
        }









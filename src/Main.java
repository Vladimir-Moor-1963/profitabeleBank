import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести количество вкладов");
        int investor = scanner.nextInt();
        ArrayList< Depsit> depsits = new ArrayList<>();

        for (int i = 0; i < investor; i++) {
            System.out.println(" Введите процент, сколько лет, сумму ");
            double persent = scanner.nextInt();
            int years = scanner.nextInt();
            int money = scanner.nextInt();

           Depsit depsit = new Depsit(investor,persent,years,money);
           depsits.add(depsit);



        }


    }

}



import java.util.Scanner;

public class Fibo implements Command {
    @Override
    public String name() {
        return "Fibo";
    }

    @Override
    public boolean run(Scanner sc) {
        try {
            System.out.println("suite de fibonacci \n");
            int fibo = sc.nextInt();
            sc.nextLine();
            int res = 0;
            for (int j = 0; j <= fibo; j++) {
                res += j;
            }
            System.out.println("la suite de fibo vaut : " + res + "\n");
        } catch (Exception e) {
            return true;
        }
        return false;
    }
}

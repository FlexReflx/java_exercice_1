import java.util.Scanner;
public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans l'antre du démon");
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
        sc.nextLine();
        while(i.compareTo("quit") != 0){
            switch(i){
                case "fibo":
                    System.out.println("suite de fibonacci \n");
                    int fibo = sc.nextInt();
                    sc.nextLine();
                    int res =0;
                        for (int j=0;j<=fibo;j++){
                            res += j;
                        }
                    System.out.println("la suite de fibo vaut : "+ res+"\n");
                    break;
                default:
                    System.out.println("Unknown command + \n");
            }
            i =sc.next();
            sc.nextLine();
        }
        System.out.println("sortie standard");
        /*if(sc.next().compareTo("quit") == 0 ){
            System.out.println("sortie de programme");
        }else{
            System.out.println("unknown command");
        }*/
    }
}

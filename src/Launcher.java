import java.util.Scanner;
public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans l'antre du démon");
        Scanner sc = new Scanner(System.in);
        if(sc.next().compareTo("quit") == 0 ){
            System.out.println("sortie de programme");
        }else{
            System.out.println("unknown command");
        }
    }
}

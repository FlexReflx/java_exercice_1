import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.nio.file.Files.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue dans l'antre du démon");
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
        Quit q= new Quit();
        Freq fre = new Freq();
        Fibo fib = new Fibo();
        List<Command> coms = new LinkedList<>();
        coms.add(q);
        coms.add(fre);
        coms.add(fib);
        sc.nextLine();
        boolean quit = true;
        while(quit){
            i = sc.next();
            sc.nextLine();
            boolean in = false;
            for(Command com:coms){
                if(i.compareTo(com.name()) == 0 ){
                    in = true;
                }
            }
            switch(i){
                case "fibo":
                    quit = fib.run(sc);
                    break;
                case "freq":
                    quit = fre.run(sc);
                    break;
                case "quit":
                    quit = q.run(sc);
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

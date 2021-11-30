import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Freq implements Command {
    @Override
    public String name() {
        return "Freq";
    }

    @Override
    public boolean run(Scanner sc) {
        try {
            System.out.println("veuillez rentrer le chemin vers le fichier à étudier :");

            Path file = Paths.get(sc.next());
            sc.nextLine();
            String tab[];
            String tab1[];
            if (Files.exists(file)) {
                try {
                    String content = Files.readString(file);
                    content = content.toLowerCase();
                    content = content.replaceAll("/[.,/#!$%^&*;:{}=-_`~()]/g", " ");
                    tab = content.split(" ");
                    Map<String, Long> mots = Arrays.stream(tab).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
                    Map<String, Long> topThree =
                            mots.entrySet().stream()
                                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                                    .limit(3)
                                    .collect(Collectors.toMap(
                                            Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

                    System.out.println("Top3 : " + topThree);
                } catch (IOException e) {
                    System.out.println("Unreadable file : ");
                    System.out.println(e.getClass().getSimpleName());
                    e.getMessage();
                }
            }
        } catch (Exception e) {
            return true;
        }
        return false;
    }
}

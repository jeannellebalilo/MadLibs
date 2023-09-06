import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Queue<String> words = new LinkedList<>();

        Scanner scan = new Scanner(System.in);
        words.add(getWord(scan, "adjective"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "adjective"));

        System.out.println("Roses are " + words.remove() + ", " + 
                            words.remove() + "s are blue. " + 
                            words.remove() + " is " + 
                            words.remove() + ", and so are you!");
    }

    // getWord() uses a Scanner object to retrieve a word from a user.
    // input requires a Scanner, and a "type" (adjective, noun, verb, etc.)
    static String getWord(Scanner s, String type) {
        System.out.print("Type an " + type + ": ");
        String word = s.nextLine();
        return word;
    }
}

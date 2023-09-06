import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Queue<String> words = new LinkedList<>();

        Scanner scan = new Scanner(System.in);
        String story = null;

        System.out.print("1: Spooky Stories\n" + 
                        "2: Love Letter\n" + 
                        "3: The Space Shuttle\n" +
                        "Type a number to choose a story: ");
        int choice = scan.nextInt();
        scan.nextLine();

        switch (choice) {
            case 1: story = spookyStories(scan, words);
                    break;
            case 2: story = loveLetter(scan, words);
                    break;
            case 3: story = spaceShuttle(scan, words);
        }

        System.out.print("\n" + story);

        // words.add(getWord(scan, "adjective"));
        // words.add(getWord(scan, "noun"));
        // words.add(getWord(scan, "noun"));
        // words.add(getWord(scan, "adjective"));

        // System.out.println("Roses are " + words.remove() + ", " + 
        //                     words.remove() + "s are blue. " + 
        //                     words.remove() + " is " + 
        //                     words.remove() + ", and so are you!");
    }

    // getWord() uses a Scanner object to retrieve a word from a user.
    // input requires a Scanner, and a "type" (adjective, noun, verb, etc.)
    static String getWord(Scanner s, String type) {
        System.out.print("Type a(n) " + type + ": ");
        String word = s.nextLine();
        return word;
    }

static String spookyStories(Scanner scan, Queue<String> words) {
        words.add(getWord(scan, "adjective"));
        words.add(getWord(scan, "plural noun"));
        words.add(getWord(scan, "plural noun"));
        words.add(getWord(scan, "silly word"));
        words.add(getWord(scan, "liquid"));
        words.add(getWord(scan, "adjective"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "verb"));
        words.add(getWord(scan, "plural noun"));
        words.add(getWord(scan, "verb ending in \"ing\""));
        words.add(getWord(scan, "number"));
        words.add(getWord(scan, "verb ending in \"ing\""));
        words.add(getWord(scan, "plural noun"));
        words.add(getWord(scan, "noun"));

        String res = "American children are fascinated by " + words.remove() + 
                    " stuff- like stories that scare the " + words.remove() + 
                    " off them or make their " + words.remove() + 
                    " stand on end. Scientists say this is because being frightened causes the " + words.remove() +
                    " gland to function and puts " + words.remove() + 
                    " into their blood. And everyone knows that makes kids feel " + words.remove() +
                    ". When they are scared by a movie or a/an " + words.remove() +
                    ", boys laugh and holler and " + words.remove() + 
                    ", but girls cover their eyes with their " + words.remove() + 
                    " and keep screaming and " + words.remove() + 
                    ". Most kids get over this by the time they are " + words.remove() +
                    " years old. Then they like movies about cars " + words.remove() +
                    " or cops shooting " + words.remove() +
                    ", or, if they are girls, they like movies about a boy meeting a/an " + words.remove() +
                    " and falling in love. Of course, that can be scary, too.";
        return res;
    }

    static String loveLetter(Scanner scan, Queue<String> words) {
        words.add(getWord(scan, "adjective"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "adjective"));
        words.add(getWord(scan, "adjective"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "part of the body"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "adjective"));
        words.add(getWord(scan, "verb"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "plural noun"));
        words.add(getWord(scan, "part of the body"));
        words.add(getWord(scan, "part of the body"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "verb"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "part of the body"));
        words.add(getWord(scan, "verb"));
        words.add(getWord(scan, "person in room"));


        String res = "My " + words.remove() +
                    " darling,\n I love you more than " + words.remove() +
                    " itself. Each minute away from you is a/an " + words.remove() +
                    ", each hour a/an " + words.remove() +
                    " eternity. Without you, life is dull, boring, and " + words.remove() +
                    ". I feel like a baby without my " + words.remove() +
                    ", a toddler without my teddy " + words.remove() +
                    ", a dog without its " + words.remove() +
                    ". I can't get you out of my " + words.remove() +
                    ". I can't stop thinking about the color of your " + words.remove() +
                    ", the way you wear your " + words.remove() +
                    ", the way you toss your " + words.remove() +
                    ", your " + words.remove() +
                    " laugh, the way you " + words.remove() +
                    " a joke. This morning, when the mail " + words.remove() +
                    " brought your special delivery " + words.remove() +
                    ", my " + words.remove() +
                    " skipped a beat, my " + words.remove() +
                    " was in my throat, and my " + words.remove() +
                    " trembled so much, I could hardly " + words.remove() +
                    " your " + words.remove() +
                    ". What you said set my " + words.remove() +
                    " on fire. Do write again. Until then, I love you from the bottom of my " + words.remove() +
                    ".\n I will " + words.remove() +
                    " you always, \n" + words.remove();

        return res;
    }

    static String spaceShuttle(Scanner scan, Queue<String> words) {
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "plural noun"));
        words.add(getWord(scan, "verb ending in \"ing\""));
        words.add(getWord(scan, "plural noun"));
        words.add(getWord(scan, "city"));
        words.add(getWord(scan, "plural noun"));
        words.add(getWord(scan, "adjective"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "number"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "adjective"));
        words.add(getWord(scan, "verb"));
        words.add(getWord(scan, "verb"));
        words.add(getWord(scan, "plural noun"));
        words.add(getWord(scan, "verb ending in \"ing\""));
        words.add(getWord(scan, "number"));
        words.add(getWord(scan, "adverb"));
        words.add(getWord(scan, "noun"));
        words.add(getWord(scan, "adjective"));

        String res = "In 1981, the U.S. launched the first real Space " + words.remove() +
                    ". It was named Columbia and was piloted by two brave "  + words.remove() +
                    ". They had practiced " + words.remove() +
                    " for two years and were expert " + words.remove() +
                    ". Columbia took off from " + words.remove() +
                    " using its powerful first-stage " + words.remove() +
                    " and soared off into the " + words.remove() +
                    " blue " + words.remove() +
                    ". At an altitude of " + words.remove() +
                    " feet, it went into orbit around the " + words.remove() +
                    ". For people watching from Earth, it was a/an " + words.remove() +
                    " sight to " + words.remove() +
                    "! Who could really " + words.remove() +
                    " that there were two " + words.remove() +
                    " in space? It was mind " + words.remove() +
                    ". After " + words.remove() +
                    " orbits, the shuttle landed " + words.remove() +
                    " at an air force " + words.remove() +
                    ". It was a/an " + words.remove() +
                    " day for the U.S. Space Program.";

        return res;
    }
}

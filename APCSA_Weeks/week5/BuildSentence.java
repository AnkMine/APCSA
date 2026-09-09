// import scanner class
import java.util.Scanner;

public class BuildSentence {

    public static void main(String[] args) {

        // creates new instance of scaner class
        Scanner sc = new Scanner(System.in);

        // asks user for a noun and verb and assigns it to "noun" or "verb" of type string
        System.out.println("Please give me a noun: ");
        String noun = sc.next();

        System.out.println("Please give me a verb: ");
        String verb = sc.next();

        // assigns a sentence to "sentence" of type string
        String sentence = ("The " + noun + " " + verb + "s.");

        // prints variable sentence
        System.out.println(sentence);

    }
}
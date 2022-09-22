package hangman;

import java.util.Random;
import java.util.Scanner;

public class hangman {
    // Word List
    static String list_of_words[] = {"hello","hey","how"};

    // using Random class as RANDOM
    static Random RANDOM = new Random();

    // Getting Random Words
    static String word = list_of_words[RANDOM.nextInt(list_of_words.length)];

    // Replacing word with *
    static String astrisk = new String(new char[word.length()]).replace("\0", "*");
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (count < 7 && astrisk.contains("*")){
            System.out.println(astrisk);
            String guess = sc.next();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(String guess) {
        String newasterisk = "";
        for (int i=0; i<word.length(); i++){
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (astrisk.charAt(i) != '*') {
                newasterisk += word.charAt(i);
            } else {
                newasterisk += "*";
            }
        }

        if (astrisk.equals(newasterisk)) {
            count ++ ;
            // hangmanImage();
        } else {
            astrisk = newasterisk;
        }
        if (astrisk.equals(word)) {
            System.out.println("correct!");
            // close();
        }
    }
}
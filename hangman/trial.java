package hangman;
import java.util.Random;

import hangman.WORD;
public class trial {
   
    
    public static void main(String[] args) {
        
        WORD data = new WORD();
        Random random = new Random();
        String randomWord = data.word_list[random.nextInt(data.length-1)];
        System.out.println(randomWord);
        // System.out.println(data[1]);
    }
}

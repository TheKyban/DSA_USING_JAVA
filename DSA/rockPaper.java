import java.util.*;

public class rockPaper {
    static boolean game(char comp, char user) {
        boolean ans = false;
        switch (user) {
            case 'p':
                if (comp == 'r') {
                    ans = true;
                }
                break;
            case 'r':
                if (comp == 's') {
                    ans = true;
                }
                break;
            case 's':
                if (comp == 'p') {
                    ans = true;
                }
                break;
        }
        return ans;
    }

    static void print(char c) {
        switch (c) {
            case 'r':
                System.out.print("Rock");
                break;
            case 'p':
                System.out.print("Paper");
                break;
            case 's':
                System.out.print("Scissor");
                break;
        }
        System.out.println();

    }

    static int random(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] Options = { 'r', 'p', 's' };
        int score = 0;
        System.out.println("Paper || scissor || rock");
        while (true) {
            try {
                int i = random(0, 2); // Random number
                System.out.print("User: ");
                char user = sc.next().toLowerCase().charAt(0); // User
                char comp = Options[i]; // Computer
                if (user == 'q') { // Quit
                    System.out.println("Score: " + score);
                    break;
                }
                if (user == comp) {
                    System.out.print("Computer: ");
                    print(comp);
                    System.out.println("Draw");
                } else if (game(comp, user)) { // True
                    score++;
                    System.out.println("WON");
                    System.out.println("Score: " + score);
                } else { // False
                    System.out.println("LOOSE");
                    System.out.println("Score: " + score);
                }
                // System.out.println(score);
            } catch (Exception e) {
                System.out.println("Enter valid Options");
            }
        }

    }
}
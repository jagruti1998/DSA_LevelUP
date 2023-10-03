package Daily_Challenge;
import java.util.Scanner;

public class ColorGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sequence of colors (A and B):");
        String colors = scanner.nextLine();

        ColorGame game = new ColorGame();
        boolean aliceWins = game.winnerOfGame(colors);

        if (aliceWins) {
            System.out.println("Alice wins!");
        } else {
            System.out.println("Bob wins!");
        }

        scanner.close();
    }

    public boolean winnerOfGame(String colors){
        int aliceScore=0;
        int bobScore=0;

        for(int i=1; i<colors.length()-1; i++) {
            char currentColor = colors.charAt(i);
            char prevColor = colors.charAt(i - 1);
            char nextColor = colors.charAt(i + 1);

            if (currentColor == 'A' && prevColor == 'A' && nextColor == 'A')
                aliceScore++;
            else if (currentColor == 'B' && prevColor == 'B' && nextColor == 'B')
                bobScore++;
        }

        return aliceScore > bobScore;
    }
}


import java.util.*;
public class TicTacToeGame {
    public static void main(String args[]) {
        System.out.println("Welcome to Tic Tac Toe Game");
        char board[] = createBoard();
        char playerLetter = chooseLetter();
        char compLetter;
        if(playerLetter=='X')
            compLetter = 'O';
        else
            compLetter = 'X';
        System.out.println("Player: "+playerLetter+" Computer: "+compLetter);
    }

    public static char[] createBoard()
    {
        char board[] = new char[10];
        for(char charValue : board)
            charValue = ' ';
        return board;
    }

    public static char chooseLetter()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Choose X or O: ");
        char letterChoice = in.next().charAt(0);
        return letterChoice;
    }
    
}

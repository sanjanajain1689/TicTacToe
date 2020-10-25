
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
        System.out.println("Current Board: ");
        showBoard(board);
        makePlayerMove(board, playerLetter);
        showBoard(board);
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

    private static void showBoard(char board[])
    {
        for(int index=1; index<board.length; index++)
        {
            if(index%3==0)
                System.out.println(board[index]);
            else
                System.out.print(board[index] + ",");
        }
    }

    private static void makePlayerMove(char board[], char playerLetter)
    {
        Scanner in = new Scanner(System.in);
        int indexChoice;
        do
        {
            System.out.print("Select index between 1 and 9: ");
            indexChoice = in.nextInt();
            in.nextLine();
            if(board[indexChoice]=='X' || board[indexChoice]=='O')
            {
                System.out.println("Index already filled");
            }
            else
            {
                board[indexChoice] = playerLetter;
                return;
            }
        }while(board[indexChoice]!=' ');
    }
    
}

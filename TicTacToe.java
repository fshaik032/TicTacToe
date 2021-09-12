/*
 * Faaris Shaik
 * First Window
 * 3/3/17
 */
import java.util.Scanner;
public class TicTacToe
{

    public static void main(String[] args){

        boolean gameContinue=true;
        String [] spots = {"1","2","3","4","5","6", "7" , "8", "9"};

        PrintBoard(spots);
        int numMoves=0, Player1move=0, Player2move=0;
        do
        {

            PutMove(spots, numMoves, Player1move, Player2move);
            PrintBoard(spots);
            gameContinue=CheckWin(gameContinue, spots);

            numMoves++;
        } while (gameContinue);
        System.out.println("The Game is over");
    }

    public static void PrintBoard(String[] spots)
    {
        for(int k = 0; k < 3; k++)
        {
            System.out.print(spots[k]+" |");
        }

        System.out.println();
        System.out.print("--+--+--+");
        System.out.println();

        for(int k = 3; k < 6; k++)
        {
            System.out.print(spots[k]+" |");
        }

        System.out.println();
        System.out.print("--+--+--+");
        System.out.println();
        for(int k = 6; k < 9; k++)
        {
            System.out.print(spots[k]+" |");
        }
    }

    public static void PutMove(String[] spots, int numMoves, int Player1move, int Player2move)
    {
        Scanner input = new Scanner (System.in);
        boolean compatibleMove=true;
        do {
            if (numMoves%2==0)
            {
                System.out.println("\nPlayer 1, where do you want to move?");
                Player1move=input.nextInt();

                if (spots[Player1move-1]=="X" || spots[Player1move-1]=="O")
                    System.out.println("That spot is already taken, please try again.");
                else
                {
                    spots[Player1move-1]="X";
                    compatibleMove=false;
                }
            }

            else if (numMoves%2==1)
            {
                System.out.println("\nPlayer 2 where do you want to move?");
                Player2move=input.nextInt();
                if (spots[Player2move-1]=="X" || spots[Player2move-1]=="O")
                    System.out.println("That spot is already taken, please try again.");
                else
                {
                    spots[Player2move-1]="O";
                    compatibleMove=false;
                }

            }
        }	while(compatibleMove);


    }

    public static boolean CheckWin (boolean gameContinue, String[] spots)
    {

        if ((spots[0] == "X"  && spots[1] == "X" && spots[2] == "X") || (spots[3] == "X" && spots[4] == "X" && spots[5] == "X")  ||  (spots[6] == "X" && spots[7] == "X" && spots[8] == "X")||(spots[0] == "X" && spots[3] == "X" && spots[6] == "X")|| (spots[1] == "X" && spots[4] == "X" && spots[7] == "X")|| (spots[2] == "X" && spots[5] == "X" && spots[8] == "X")||(spots[0] == "X" && spots[4] == "X" && spots[8] == "X")||(spots[2] == "X" && spots[4] == "X" && spots[6] == "X"))
        {
            System.out.println("\n\nPlayer 1 wins");
            gameContinue=false;
        }
        else if((spots[0] == "O"  && spots[1] == "O" && spots[2] == "O") || (spots[3] == "O" && spots[4] == "O" && spots[5] == "O")  ||  (spots[6] == "O" && spots[7] == "O" && spots[8] == "O")||(spots[0] == "O" && spots[3] == "O" && spots[6] == "O")|| (spots[1] == "O" && spots[4] == "O" && spots[7] == "O")|| (spots[2] == "O" && spots[5] == "O" && spots[8] == "O")||(spots[0] == "O" && spots[4] == "O" && spots[8] == "X")||(spots[2] == "O" && spots[4] == "O" && spots[6] == "O"))
        {
            System.out.println("\n\nPlayer 2 wins");
            gameContinue=false;
        }

        else if (spots[0]!= "1" && spots[1]!= "2" && spots[2]!= "3" && spots[3]!= "4" && spots[4]!= "5" && spots[5]!= "6" && spots[6]!= "7" && spots[7]!= "8" && spots[8]!= "9" )
        {
            System.out.println("\n\nThe Game is a tie");
            gameContinue=false;
        }

        return gameContinue;




    }




}
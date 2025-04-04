package javaInput;
import java.util.*;
public class EmojiRockPaperScissorsTournament {

    public static void gameOver(String name,int round, int input, int computerChoice, String choice, int playerScore, int computerScore){
        String winner;
        if (input == 1 && computerChoice == 1){
            System.out.println("It's a draw! (Series: "+playerScore+"-"+computerScore+")\n");
            gameStart(name, playerScore, computerScore, round);
        }else if(input == 1 && computerChoice == 2){
            winner = "Computer";
            ++computerScore;
            System.out.println("\uD83D\uDCC4(Paper) covers \uD83C\uDF11(Rock)!");
            System.out.println(winner+" wins! (Series: "+playerScore+"-"+computerScore+")\n");
            round++;
            gameStart(name, playerScore, computerScore, round);
        }else if(input == 1 && computerChoice == 3){
            winner = name;
            ++playerScore;
            System.out.println("\uD83C\uDF11(Rock) crashes ✂\uFE0F(Scissors) !");
            System.out.println(winner+" wins! (Series: "+playerScore+"-"+computerScore+")\n");
            round++;
            gameStart(name, playerScore, computerScore, round);
        } else if (input == 2 && computerChoice == 2){
            System.out.println("It's a draw! (Series: "+playerScore+"-"+computerScore+")\n");
            gameStart(name, playerScore, computerScore, round);
        }else if(input == 2 && computerChoice == 3){
            winner = "Computer";
            ++computerScore;
            System.out.println("✂\uFE0F(Scissors) cuts the \uD83D\uDCC4(Paper)!");
            System.out.println(winner+" wins! (Series: "+playerScore+"-"+computerScore+")\n");
            round++;
            gameStart(name, playerScore, computerScore, round);
        }else if (input == 3 && computerChoice == 3){
            System.out.println("It's a draw! (Series: "+playerScore+"-"+computerScore+")\n");
            gameStart(name, playerScore, computerScore, round);
        }
    }

    public static void gameStart(String name, int playerScore, int computerScore, int round){
        if (playerScore <3 && computerScore <3){
            Random rand = new Random();
            Scanner sc = new Scanner(System.in);
            System.out.println("Round: "+round);
            System.out.print("Enter your choices' serial number (1.Rock(\uD83C\uDF11)/2.Paper(\uD83D\uDCC4)/3.Scissors(✂\uFE0F)): ");
            int input = sc.nextInt();
            int computerChoice = rand.nextInt(1,4);
            String choice;
            String playerChoice;
            if (computerChoice == 1){
                choice = "\uD83C\uDF11";
            }else if (computerChoice == 2){
                choice = "\uD83D\uDCC4";
            } else {
                choice = "✂\uFE0F";
            }
            if (input == 1){
                playerChoice = "\uD83C\uDF11";
                System.out.println("You chose: "+playerChoice);
                System.out.println("Computer chose: "+choice);
            }else if (input == 2){
                playerChoice = "\uD83D\uDCC4";
                System.out.println("You chose: "+playerChoice);
                System.out.println("Computer chose: "+choice);
            } else if (input == 3){
                playerChoice = "✂\uFE0F";
                System.out.println("You chose: "+playerChoice);
                System.out.println("Computer chose: "+choice);
            } else {
                System.out.print("INVALID INPUT");
                gameStart(name, playerScore, computerScore, round);
            }
            gameOver(name, round, input, computerChoice, choice, playerScore, computerScore);
        }else if(playerScore == 3 || computerScore == 3){
            if (playerScore > computerScore){
                System.out.println("\uD83C\uDF89Wohoo, "+name+" has won the Tournament\uD83C\uDF89");
            }else System.out.println("Oops, You've lost the Tournament...\nTry again next time...\nAll The Best...");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\n\nWELCOME to RACK, PAPER, SCISSORS TOURNAMENT....\nEnter Your Name: ");
        String name = sc.nextLine();
        int playerScore = 0;
        int computerScore = 0;
        int round = 1;
        gameStart(name, playerScore, computerScore, round);
    }
}

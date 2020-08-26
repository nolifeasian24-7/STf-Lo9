package src.app;
import java.util.Scanner;
import java.util.Random;
class TicTacToe extends Gametic {
    public void startGame() {
        Scanner chooseGame = new Scanner(System.in);
        System.out.println("How does a round of rock paper scissors sound, if you want a round with me, enter 2, otherwise, there is tic tac toe for those who want to tag a friend along, in which case, enter 2. \n :)" +
        "Or for those of you who like your classic's, my developer's friend @spicychair has made a mini minesweeper game, to play this awesome creation, enter 3.");
        int game = chooseGame.nextInt();
        if (game == 1) {
            tic();
        }
        if (game == 2) {
            rocktoScissors();
        }
        if (game == 3) {
            UserInterface ui = new UserInterface();
            ui.start();
        }
    }
    public void rocktoScissors() {
        System.out.println("Enter rock, paper or scissors, type exit to eixt");
        Random AiDescison = new Random();
        int botGuess = AiDescison.nextInt(3);
        Scanner scanner = new Scanner(System.in);
        if (botGuess == 0) {
            String botAnswer = "rock";
            String userAnswer = scanner.next();
            if (userAnswer.contains("scissors")) {
                System.out.println("hehe i won, lets try again!");
                rocktoScissors();
            }
            if (userAnswer.contains("paper")) {
                System.out.println("Damn, you won, well done!");
                rocktoScissors();
            }
            if (userAnswer == "exit") {
                System.out.println("process finished with exit code 0");
                System.exit(0);
            }
            else {
                System.out.println("Lol we drew, they say great minds think alike tho :)");
                rocktoScissors();
            }
        }
        if (botGuess == 1) {
            String botAnswer = "paper";
            String userAnswer = scanner.next();
            if (userAnswer.contains("rock")) {
                System.out.println("hehe i won, let's try again");
                rocktoScissors();
            }
            if (userAnswer.contains("scissors")) {
                System.out.println("Damn, you won, well done!");
                rocktoScissors();
            }
            if (userAnswer == "exit") {
                System.out.println("process finished with exit code 0");
                System.exit(0);
            }
            else {
                System.out.println("Lol we drew, they say great minds think alike tho :)");
                rocktoScissors();
            }
        }
        if (botGuess == 2) {
            String botAnswer = "scissors";
            String userAnswer = scanner.next();
            if (userAnswer.contains("rock")) {
                System.out.println("hehe i won, let's try again");
                rocktoScissors();
            }
            if (userAnswer.contains("paper")) {
                System.out.println("Damn, you won, well done");
                rocktoScissors();
            }
            if (userAnswer == "exit") {
                System.out.println("process finished with exit code 0");
                System.exit(0);
            }
            else {
                System.out.println("Lol we drew, they say great minds think alike tho :)");
            }
        }
        
    }
}
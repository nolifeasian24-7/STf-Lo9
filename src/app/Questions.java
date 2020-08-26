package src.app;
import java.util.Random;
import java.util.Scanner;
class Questions {
    public void startQuiz(){
        System.out.println("let's test your programming knowledge");
        Scanner scanner = new Scanner(System.in);
        Random quiz = new Random();
        int questionDecider = quiz.nextInt(5);
        
        if (questionDecider == 0){
            System.out.println("Why do we use methods");
            System.out.println("1. To repeat a statement multiple times. \n" +
            "2. To decompose a program into several smaller subroutines. \n" +
            "3. To determine the excecution time of a program. \n" +
            "4. To interrupt the excecution of a program.");
            int Answer = scanner.nextInt();
            while (Answer != 2) {
                System.out.println("Sorry, please try again");
                Answer = scanner.nextInt();
            }
        }
        
        if (questionDecider == 1){
            System.out.println("What was java originally going to be called");
            System.out.println("1.Oak \n" +
            "2. Java \n" +
            "3. C-+ \n" +
            "4. James Gosling's language");
            int Answer = scanner.nextInt();
            while (Answer != 1) {
                System.out.println("Sorry, please try again");
                Answer = scanner.nextInt();
            }
        }
        
        if (questionDecider == 2) {
            while (true) {
                System.out.println("What is an IDE");
            System.out.println("1. A normal textEditor \n" +
            "2. an Integrated Development Environment \n" +
            "3. O no \n" +
            "4. A right answer that is totally believable and isn't acc wrong");
            int Answer = scanner.nextInt();
            if (Answer != 2) {
                System.out.println("Sorry, please try again");
                continue;
            }
            else {
                break;
            }
        
            }
        }
        
        if (questionDecider == 3){
            while (true){
                System.out.println("what is the missing word? '_ Oriented Programming'");
                System.out.println("1. Functional \n" +
                "2. class \n" +
                "3. Object \n" +
                "4. Visual studio code");
                int Answer = scanner.nextInt();
                if (Answer != 3) {
                    System.out.println("Sorry, please try again");
                    continue;
                }
                else {
                    break;
                }
            }
        }
        if (questionDecider == 4) {
            while (true) {
                System.out.println("What is my name (STF-Lo9) based off? ");
                System.out.println("1. The name of a game \n" +
                "2. O no it doesn't mean anything \n" +
                "3. A codename for my keyboard \n" +
                "4. the model number of my phone from 2019");
            }
        }
        else {
            System.out.println("Great to see that your programming skills are growing sharper by each visit! looks like i'll need to think up harder questions :/");
        }
    }
}
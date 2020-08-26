package src.app;
import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private Field field;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.field = new Field();
    }
    public void start() {
        this.field.generateField();
        System.out.print("How many mines do you want on the field? ");
        int m = this.scanner.nextInt();
        this.field.generateMines(m);

        while (true) {
            this.field.printField();
            System.out.println("Set/delete mines marks (x and y coordinates): ");
            try {
                
                int x = this.scanner.nextInt();
                int y = this.scanner.nextInt();

                int result = this.field.mark(x, y); //mark mine and get result
                if (result == 1) {
                    this.field.printField(); 
                    System.out.println("Congratulations! You found all mines!");
                    break;
                } else if (result == -1) {
                    System.out.println("There is a number here!");
                }
                
            } catch (Exception e) {
                System.out.println("Please enter correct input");
            }    
        }
    }
}

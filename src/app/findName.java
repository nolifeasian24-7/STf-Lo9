package src.app;
import java.util.Scanner;
class findName {
    public void name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I am STF-Lo9, i was made in 2020");
        System.out.println("what is your name");
        String Name1 = scanner.nextLine();
        System.out.println("that's a cool name, "+Name1);
    }
}
package src.app;
import java.util.Scanner;
class CountToNumber {
    public void startCount() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("okay then, now enter any number and I will count to it");
        int Range = scanner2.nextInt();
        for (int i =0; i <= Range; i++){
            System.out.println(i);
        }
    }

    
}
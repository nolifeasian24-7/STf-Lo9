package src.app;
import java.util.Scanner;
class findAge extends findName {
    public void age() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Rather then asking for your age, i'll play a game, enter the reminder of your age divided by 3, 5 and 7");
        String[] var = scanner1.nextLine().split(",");
        int var1 =Integer.parseInt(var[0]);
        int var2 =Integer.parseInt(var[1]);
        int var3 = Integer.parseInt(var[2]);
        int age = (var1 * 70 + var2 * 21 + var3 * 15) %105;
        System.out.println(age+ ": what a  good age to start programming at!");
    }
    
}
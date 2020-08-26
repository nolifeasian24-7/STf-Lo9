package src.app;
public class start extends findName {
    public static void main(String[] sargs) {
        findName NameStart = new findName();
        NameStart.name();
        findAge ageStart = new findAge();
        ageStart.age();
        CountToNumber countStart1 = new CountToNumber();
        countStart1.startCount();
        Questions startQuiz1 = new Questions();
        startQuiz1.startQuiz();
        TicTacToe game = new TicTacToe();
        game.startGame();
    }
}
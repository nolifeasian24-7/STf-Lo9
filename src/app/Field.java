package src.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Field {
    private List<Point> mines;
    private Point[][] field;

    private int correctPointsMarked;

    public Field() {
        this.mines = new ArrayList<>();
        this.field = new Point[9][9];
        this.correctPointsMarked = 0;
    }
    /*
    Methods for generating the minefield
    */
    public void generateField() {
        for (int y = 0; y != 9; y++) {
            for (int x = 0; x != 9; x++) {
                //set empty space
                this.field[y][x] = new Point(y, x);
            }
        }
    }
    public void generateMines(int minesNeeded) {
        Random rand = new Random();
        int minesOnField = 0;
        while (true) {
            //generate coordinates for mines
            int y = rand.nextInt(9);
            int x = rand.nextInt(9);
            //check if coordinate already is mine
            if (field[y][x] instanceof Mine) {
                continue;
            }
            //set coordinate to mine
            Mine mine = new Mine(y,x);
            field[y][x] = mine;
            this.mines.add(mine);
            //increase amount of mines
            minesOnField++;
            //if enough mines are on field
            if (minesOnField == minesNeeded) {
                break;
            }
        }

        //marking mines

        for (int y = 0; y != 9; y++) {
            for (int x = 0; x != 9; x++) {
                //check point not mine
                if (!(this.field[y][x] instanceof Mine)) {
                    //if near a mine
                    int counter = 0;
                    for (Point p : this.mines) {
                        //loop through coordinates of each mine
                        if (this.field[y][x].isNextTo(p)) {
                            //if nearby
                            counter++;
                        }
                    }
                    if (counter > 0) {
                        //if amount of mines nearby 1 or more
                        this.field[y][x].setCount(counter);
                    }
                }
            }
        }
    }
    

    /*
    Methods for interacting with the minefield
    */

    public int mark(int x, int y) {
        if (!(this.field[y-1][x-1].state.equals("*") || this.field[y-1][x-1].state.equals("."))) {
            return -1; //cannot mark point
        }

        this.correctPointsMarked += this.field[y-1][x-1].mark();
        if (this.correctPointsMarked == this.mines.size()) {
            return 1; //user has won
        }
        return 0; //game continues
    }
    public void printField() {
        System.out.println();
        System.out.println( " │123456789│");
        System.out.println( "—│—————————│");
        //loop through first array
        for (int y = 0; y != 9; y++) {
            //loop through second array
            System.out.print(y+1 + "|");
            for (int x = 0; x != 9; x++) {
                System.out.print(this.field[y][x]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println( "—│—————————│");
    }

}

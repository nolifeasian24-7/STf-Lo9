package src.app;
class Point {
    private final int y;
    private final int x;
    protected String state;

    public Point(int y, int x) {
        this.y = y;
        this.x = x;
        this.state = "."; //what to be shown to the user
    }
    
    public int getY() {
        return this.y;
    }
    public int getX() {
        return this.x;
    }
    public void setCount(int count) {
        this.state = String.valueOf(count);
    }

    public boolean isNextTo(Point compared) {
        /*
        a  b  c
        d  +  e  
        f  g  h
        */
        //row above:
        return (this.y + 1 == compared.getY() && this.x - 1 == compared.getX()) || //a
        (this.y + 1 == compared.getY() && this.x == compared.getX()) || //b
        (this.y + 1 == compared.getY() && this.x + 1 == compared.getX()) || //c
        //current row
        (this.y == compared.getY() && this.x - 1 == compared.getX()) || //d
        (this.y == compared.getY() && this.x + 1 == compared.getX()) || //e
        //row below:
        (this.y - 1 == compared.getY() && this.x - 1 == compared.getX()) || //f
        (this.y - 1 == compared.getY() && this.x == compared.getX()) || //g
        (this.y - 1 == compared.getY() && this.x + 1 == compared.getX());//h
    }

    public int mark() {
        //if already marked, unmark
        if (this.state.equals("*")) { 
            this.state = ".";
        } else {
            this.state = "*";
        }
        return 0; //does not change how many mines are marked
    }

   
    public String toString() {
        return this.state;
    }
}
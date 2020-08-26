package src.app;
class Mine extends Point {
    
    public Mine(int y, int x) {
        super(y, x);
    }
    
    @Override
    public int mark() {
        //if already marked, unmark
        if (super.state.equals("*")) { 
            this.state = ".";
            return -1; //no of correctly marked mines decreases
        } else {
            this.state = "*";
            return 1; // no of correct increases
        }
    }
}
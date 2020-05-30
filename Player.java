package mod;

public class Player {

    //INSTANCE VARIABLES
    private int score;
    private int numAsked;

    //GETTERS
    public int getNumAsked() { return numAsked; }
    public void incNumAsked() { numAsked++; }
    public void calculateScore() { score = 500 - (numAsked * 50); }
    public int getScore() { return score; }

    //CONSTRUCTOR
    public Player() {
        score = 0;
        numAsked = 0;
    }

}

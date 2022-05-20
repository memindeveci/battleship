import java.util.*;

public class Player {
    // These are the lengths of all of the ships.
    private static final int[] SHIP_LENGTHS = {2, 3, 3, 4, 5};
    private int numOfShips;


    private Ship s;
    private int row;
    private int col;
    private int direction;

    private Grid playerGrid = new Grid();;
    private Grid opponentGrid = new Grid();;
    private ArrayList<Ship> ships;
    private ArrayList<Grid> grids;

    // These are the lengths of all of the ships.

    public Player(){
        ships = new ArrayList<Ship>();
        grids = new ArrayList<Grid>();

        for(int i = 0; i < 5; i++)
        {
            Ship s = new Ship(SHIP_LENGTHS[i]);
            ships.add(s);
        }

        playerGrid = new Grid();
        opponentGrid = new Grid();
        grids.add(playerGrid);
        grids.add(opponentGrid);

    }

    public Ship getShip(int x){
        return ships.get(x);
    }

    public void chooseShipLocation(Ship s, int row, int col, int direction){
        numOfShips++;
        if (numOfShips<6){
            s.setLocation(row, col);
            s.setDirection(direction);
            playerGrid.addShip(s);
        }
    }



    // Print your ships on the grid
    public void printMyShips(){
        playerGrid.printShips();
    }

    // Print opponent guesses
    public void printOpponentGuesses(){
        opponentGrid.printStatus();
    }

    // Print your guesses
    public void printMyGuesses(){
        playerGrid.printStatus();
    }

    public void recordMyGuess(int row, int col){
        // this will eventually need to look at the opponent's board
        // and mark a hit or miss on this player's opponentGrid
    }

    // Record a guess from the opponent
    public void recordOpponentGuess(int row, int col){
        int checkStatus = playerGrid.getStatus(row, col);
        if(checkStatus == 0){ // if the location is unguessed
            if(playerGrid.hasShip(row, col)){
                playerGrid.markHit(row, col);
            }
            else{
                playerGrid.markMiss(row, col);
            }
        }
    }
}

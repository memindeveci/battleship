public class Location
{
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;

    private boolean shipAtPosition=false;
    private int statusOflocation;

    // Location constructor.
    public Location(){
        statusOflocation=0;
    }

    // Was this Location a hit?
    public boolean checkHit(){
        if (shipAtPosition==true){
            return true;
        } else {
            return false;
        }
    }

    // Was this location a miss?
    public boolean checkMiss(){
        if (shipAtPosition==false){
            return true;
        }else{
            return false;
        }
    }

    // Was this location unguessed?
    public boolean isUnguessed(){
        if (statusOflocation==0 ){
            return true;
        } else {
            return false;
        }
    }

    // Mark this location a hit.
    public void markHit(){
        statusOflocation=HIT;
    }

    // Mark this location a miss.
    public void markMiss(){
        statusOflocation=MISSED;
    }

    // Return whether or not this location has a ship.
    public boolean hasShip(){
        return shipAtPosition;
    }

    // Set the value of whether this location has a ship.
    public void setShip(boolean val){
        shipAtPosition=val;
    }

    // Set the status of this Location.
    public void setStatus(int status){
        statusOflocation=status;
    }

    // Get the status of this Location.
    public int getStatus(){
        return statusOflocation;
    }
}
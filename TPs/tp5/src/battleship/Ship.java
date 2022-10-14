package battleship;

public class Ship {

    private int lifePoints;

    /** creates a ship
     * @param length
     */
    public Ship(int length){
        this.lifePoints = length;
    }

    /**
     * @return true when the ship has been sunk, false if it ain't
     */
    public boolean hasBeenSunk(){
        return lifePoints == 0;
    }


    /** Reduce life points of the ship by 1
     *
     */
    public void beenHitting(){
        this.lifePoints--;
    }


    /**
     * @return as an int the value of lifePoints
     */
    public int getLifePoints() {
        return lifePoints;
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString(){
        return "Life points :"+lifePoints;
    }
}

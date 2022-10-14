package battleship;

public class Cell {

    private Ship ship;
    private boolean shot;

    /**
     * creates a cell
     */

    public Cell(){
        this.shot = false;
    }

    /**
     * @return a Ship object
     */
    public Ship getShip(){
        return ship;
    }


    /** adds a ship in the cell
     * @param ship
     */
    public void setShip(Ship ship){
        this.ship = ship;
    }

    /** checks if the cell has been shot
     * @return shot
     */
    public boolean hasBeenShot(){
        return shot;
    }

    /** shoots on the cell
     * @return the result of the shot
     */
    public Answer shot(){
        if(hasBeenShot() || ship == null){
            return Answer.MISS;
        } else {
            ship.beenHitting();
            if(ship.hasBeenSunk()){
                return Answer.SUNK;
            } else {
                return Answer.HIT;
            }
        }
    }

    /** generate a char
     * @param defender true if the player defends, false if he doesn't
     * @return a char depending on the param and cell vars
     */
    public char toCharacter(boolean defender){
        if(defender == true){
            if(this.ship == null){
                return '~';
            } else if(shot == false){
                return 'B';
            } else {
                return '*';
            }
        } else {
            if(shot == false){
                return '.';
            } else if(ship == null){
                return '~';
            } else {
                return '*';
            }
        }
    }



}

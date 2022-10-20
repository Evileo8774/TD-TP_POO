package battleship;

import battleship.util.Position;

import java.sql.SQLOutput;

public class Sea {

    private Cell[][] sea;


    /** creates a Sea object
     * @param height of the array
     * @param width of the array
     */
    public Sea(int height, int width){
        sea = new Cell[height][width];
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                sea[y][x] = new Cell();
            }
        }
    }


    /** adds a ship in the sea
     * @param s ship to add
     * @param p position in the sea
     */
    public void addShip(Ship s, Position p){
        sea[p.getY()][p.getX()].setShip(s);
    }


    /** shoots on a cell
     * @param p coordinates of the shoot
     * @return the result of the shoot
     */
    public Answer shoot(Position p) throws ArrayIndexOutOfBoundsException{
        if(p.getX() < 0 || p.getX() > sea[0].length-1 || p.getY() < 0 || p.getY() > sea.length-1){
            throw new ArrayIndexOutOfBoundsException();
        }
        return sea[p.getY()][p.getX()].shot();
    }


    /**
     * @return remaining life points of the defender
     */
    public int getRemainingLifePoints(){
        int remainingLP = 0;
        for(int y = 0; y < sea.length; y++){
            for(int x = 0; x < sea[y].length; x++){
                if(sea[y][x].getShip() != null && sea[y][x].hasBeenShot() == false){
                    remainingLP++;
                }
            }
        }

        return remainingLP;
    }

    /** display the game board line by line and cell by cell, on standard output,
     * the display is different for the defender or the attacker, according to parameter
     * @param defender true iff display is for defender, false if for opponent
     */
    public void display(boolean defender) {
        char[] lettres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'};

        if(defender == true) System.out.println("Defender");
        else System.out.println("Attacker");

        System.out.print("   ");
        for(int y = 0; y < sea.length; y++){
            System.out.print(" "+(y+1)+" ");
        }

        for(int y = 0; y < sea.length; y++){
            System.out.print("\n "+lettres[y]+" ");
            for(int x = 0; x < sea[y].length; x++){
                System.out.print(" "+(sea[y][x].toCharacter(defender))+" ");
            }
        }
        System.out.println("\n");
    }

}

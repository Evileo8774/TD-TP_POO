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
    public void addShip(Ship s, Position p) throws IllegalStateException{
        int shipLength = s.getLifePoints();
        int lengthCount = 0;
        int row = p.getY();
        int col = p.getX();

        int detectedShipPos = -1;

        sea[p.getY()][p.getX()].setShip(s);

        for(int y = 0; y < this.sea.length; y++){
            System.out.println(lengthCount);
            //j'utilise getShip() == s car je veux vérifier qu'il s'agit bien du même objet
            if(sea[y][col] != null && sea[y][col].getShip() == s && detectedShipPos == -1){
                detectedShipPos = y;
                lengthCount++;
            } else if(sea[y][col] != null && sea[y][col].getShip() == s){
                if(detectedShipPos == y-1 && lengthCount < shipLength){
                    detectedShipPos = y;
                    lengthCount++;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        if(lengthCount == 1){
            detectedShipPos = -1;
            lengthCount = 0;
           for(int x = 0; x < this.sea[p.getY()].length; x++){
               if(sea[row][x] != null && sea[row][x].getShip() == s && detectedShipPos == -1){
                   detectedShipPos = x;
                   lengthCount++;
               } else if(sea[row][x] != null && sea[row][x].getShip() == s){
                   if(detectedShipPos == x-1 && lengthCount < shipLength){
                       detectedShipPos = x;
                       lengthCount++;
                   } else {
                       throw new IllegalStateException();
                   }
               }
           }
        }
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

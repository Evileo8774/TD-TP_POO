package battleship;

import battleship.util.Input;
import battleship.util.Position;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Game {
    private Sea sea;

    public Game(Sea sea){
        this.sea = sea;
    }


    /**
     * loops until all enemy ships are destroyed
     */
    public void play(){
        while(sea.getRemainingLifePoints() != 0){
            sea.display(false);
            Position p = inputPosition();
            Answer res = sea.shoot(p);
            System.out.println(res);
        }
        System.out.println("Bravo !");
    }

    /** allows the user to input a position
     * @return a position
     */
    private Position inputPosition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez des coordonnées de tir(ex: k7)");
        String coord = sc.nextLine();
        Position p = toPosition(coord);
        return p;
    }


    /** converts the String into a Positon object
     * @param coord of the cell the player wants to shoot
     * @return the position of the cell
     */
    private Position toPosition(String coord){
        char[] lettres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'};
        int y = 0;
        int x = Integer.parseInt(coord.substring(1,2))-1;

        for(int i = 0; i < lettres.length; i++){
            if(coord.substring(0,1).charAt(0) == lettres[i]) y = i;
        }
        return new Position(x, y);
    }


    /**
     * @return sea object
     */
    public Sea getSea(){
        return this.sea;
    }
}

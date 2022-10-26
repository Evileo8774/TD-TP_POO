package battleship;

import battleship.util.Position;

public class ThirdBattleshipMain {
    public static void main(String[] args){
        Sea sea = new Sea(10, 10);

        Ship s1 = new Ship(2);
        Position p1s1 = new Position(5, 6);
        Position p2s1 = new Position(6, 6);

        Ship s2 = new Ship(3);
        Position p1s2 = new Position(8,3);
        Position p2s2 = new Position(8,4);
        Position p3s2 = new Position(8,5);

        sea.addShip(s1, p1s1);
        sea.addShip(s1, p2s1);
        sea.addShip(s2, p1s2);
        sea.addShip(s2, p2s2);
        sea.addShip(s2, p3s2);

        sea.display(true);

        Game g = new Game(sea);
        g.play();
    }
}

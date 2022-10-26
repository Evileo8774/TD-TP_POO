package battleship;

import static org.junit.jupiter.api.Assertions.*;

public class CellTest{

    @Test
    public void noShipOnCellDefender(){
        Ship ship = new Ship(2);
        Cell cell = new Cell();

        assertEquals('~', cell.toCharacter(true));
    }









    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(battleship.util.PositionTest.class);
    }
}
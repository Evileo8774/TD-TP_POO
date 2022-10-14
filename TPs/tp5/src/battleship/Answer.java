package battleship;

public enum Answer {
    MISS("raté"), HIT("touché"), SUNK("coulé");

    private final String msg;

    /** creates the Answer enum
     * @param msg message of each enum
     */
    private Answer(String msg){
        this.msg = msg;
    }
}

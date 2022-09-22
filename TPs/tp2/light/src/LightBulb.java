/**
 * LightBulb objects manipulation
 *
 * @author Leo Debonnet & Axel Rood
 */

public class LightBulb {

    /**
     * a lightbulb is defined by it's watts, lumens, color and state
     *
     * @param watts  watts delivered by the lightbulb
     * @param lumens lumens delivered by the lightbulb
     * @param color  color of the lightbulb
     * @param state  tells if the lightbulb is on or off
     */

    private int watts;
    private int lumens;
    private String color;
    private boolean state;



    public LightBulb(int watts, int lumens, String color){
        this.watts = watts;
        this.lumens = lumens;
        this.color = color;
    }


    /**
     * turn on the lights
     */
    public void turnOn(){
        state = true;
    }

    /**
     * turn off the lights
     */
    public void turnOff(){
        state = false;
    }

    /**
     * checks if the light is on
     *
     * @return the state of the lightbulb
     */
    public boolean isOn(){
        return state;
    }


    /**
     * get lightbulb informations as a string
     *
     * @return description for this lightbulb
     */
    public String toString(){
        if(state == false) return "Watts:"+watts+" Lumens:"+lumens+" Color:"+color+" State:Off";
        else return "Watts:"+watts+" Lumens:"+lumens+" Color:"+color+" State:On";
    }


    /**
     * returns this lightbulb's watts
     *
     * @return this lightbulb's watts
     */
    public int getWatts() {
        return watts;
    }

    /**
     * returns this lightbulb's lumens
     *
     * @return this lightbulb's lumens
     */
    public int getLumens() {
        return lumens;
    }

    /**
     * returns this lightbulb's color
     *
     * @return this lightbulb's color
     */
    public String getColor() {
        return color;
    }
}

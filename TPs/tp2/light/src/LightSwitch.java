/**
 * LightSwitch object manuipulation
 *
 * @author Leo Debonnet & Axel Rood
 */

public class LightSwitch {

    /**
     * a Lightswitch is define by the lightbulb is affected to
     *
     * @param l  the lightbulb affected
     */

    private LightBulb l;


    public LightSwitch(LightBulb l){
        this.l = l;
    }

    /**
     * turn on the lights if it's off and turn off lights if it's on
     */
    public void push(){
        if(l.isOn() == true){
            l.turnOff();
        } else {
            l.turnOn();
        }
    }

    public LightBulb getL() {
        return l;
    }
}

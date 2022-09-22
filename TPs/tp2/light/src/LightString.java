public class LightString {

    /**
     * a Lightstring is defined by it's lightbulb array and state
     *
     * @param lb  lightbulbs of the lightstring
     * @param state  tells if the lightstring is on or off
     */

    private LightBulb[] lb;
    private boolean state;

    public LightString(int lbAmount){
        this.lb = new LightBulb[lbAmount];
        for(int i = 0; i < lb.length; i++){
            LightBulb l = new LightBulb(1, 100, "blanc");
            lb[i] = l;
        }
    }

    /** get the n-th lightbulb of the light string by the given index.
     * If index is not a valid index, null is returned.
     * @param index the number of the lightbulb to be changed (first has number 1)
     */
    public LightBulb getLightBulb(int index){
        if(index <= lb.length || index > 0) return lb[index-1];
        else return null;
    }

    /** replace the n-th lightbulb of the light string by the given lightbulb.
     * Nothing happens if i is not a valid index.
     * @param index the number of the lightbulb to be changed (first has number 1)
     * @param theBulb the new lightbulb
     */
    public void changeLightbulb(int index, LightBulb theBulb){
        if(index <= lb.length || index > 0) lb[index-1] = theBulb;
    }

    /** returns the consumed power in watts of the lightstring
     *
     * @return the consumed power in watts of the lightstring
     */
    public int getCondumedPower(){
        if(state == true){
            int tmp = 0;
            for(int i = 0; i < lb.length; i++){
                tmp += lb[i].getWatts();
            }
            return tmp;
        } else {
            return 0;
        }
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

}

package displayer;

import displayer.LedDisplayer;

public class SpeedDisplayer extends DisplayerWithLatency{

    private int speed;

    /**
     * build a displayer with a screen of width characters
     *
     * @param width           this displayer's width
     * @param latencyDuration this displayer's latency
     */
    public SpeedDisplayer(int width, int latencyDuration, int speed) {
        super(width, latencyDuration);
        this.speed = speed;
    }

    /**
     * @see displayer.LedDisplayer#shift()
     */
    @Override
    public void shift() {
        for(int i = 0; i < speed; i++) super.shift();
    }
}

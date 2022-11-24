package displayer;

public class DisplayerWithLatency extends LedDisplayer{

    private int latencyDuration;

    /**
     * build a displayer with a screen of width characters
     *
     * @param width this displayer's width
     * @param latencyDuration this displayer's latency
     */
    public DisplayerWithLatency(int width, int latencyDuration) {
        super(width);
        this.latencyDuration = latencyDuration;
    }

    @Override
    public void setMessage(String message) {
        for(int i = 0; i < latencyDuration; i++) message += " ";
        super.setMessage(message);
    }
}

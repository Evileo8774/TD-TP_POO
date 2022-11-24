package displayer;

public class UpperCaseDisplayer extends LedDisplayer{
    /**
     * build a displayer with a screen of width characters
     *
     * @param width this displayer's width
     */
    public UpperCaseDisplayer(int width) {
        super(width);
    }

    /**
     * message turns into captials
     * @param message the new message
     */
    @Override
    public void setMessage(String message) {
        super.setMessage(message.toUpperCase());
    }
}

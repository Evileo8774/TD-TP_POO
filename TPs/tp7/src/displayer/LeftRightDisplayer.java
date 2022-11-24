package displayer;

public class LeftRightDisplayer extends LedDisplayer{

    private String reversedString;
    /**
     * build a displayer with a screen of width characters
     *
     * @param width this displayer's width
     */
    public LeftRightDisplayer(int width) {
        super(width);
    }

    @Override
    public void shift() {
        super.shift();
        reversedString = "";
        for(int i = onScreen.length()-1; i>=0; i--){
            reversedString += onScreen.charAt(i);
        }
    }

    @Override
    public String textOnScreen() {
        return reversedString;
    }
}

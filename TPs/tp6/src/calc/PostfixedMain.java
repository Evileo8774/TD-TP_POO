package calc;

import calc.gui.*;

public class PostfixedMain {
    public static void main(String[] args){
        PostfixedCalculator pc = new PostfixedCalculator();
        CalculatorView cv = new CalculatorView(pc);

        cv.run();
    }
}

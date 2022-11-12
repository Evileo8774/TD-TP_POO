package calc;

import calc.gui.*;

public class InfixedMain {
    public static void main(String[] args){
        InfixedCalculator ic = new InfixedCalculator();
        CalculatorView cv = new CalculatorView(ic);

        cv.run();
    }
}

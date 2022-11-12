package calc;

import calc.operator.*;

public class InfixedCalculator implements Calculator{

    private int previousValue;
    private int currentValue;
    private Operator operator;

    private boolean newValue = false;

    @Override
    public int getCurrentValue() {
        return currentValue;
    }

    @Override
    public void pressDigit(int digit) {
        if(currentValue == 0){
            currentValue = digit;
        } else {
            currentValue *= 10;
            currentValue += digit;
        }
    }

    @Override
    public void pressPlus() {
        previousValue = currentValue;
        currentValue = 0;
        this.newValue = true;
        this.operator = new Addition();
    }

    @Override
    public void pressMinus() {
        previousValue = currentValue;
        currentValue = 0;
        this.newValue = true;
        this.operator = new Substraction();
    }

    @Override
    public void pressDiv() {
        previousValue = currentValue;
        currentValue = 0;
        this.newValue = true;
        this.operator = new Division();
    }

    @Override
    public void pressMult() {
        previousValue = currentValue;
        currentValue = 0;
        this.newValue = true;
        this.operator = new Multiplication();
    }

    @Override
    public void pressEquals() {
        currentValue = (operator.compute(this.previousValue, this.currentValue));
    }

    @Override
    public void pressDel() {
        currentValue /= 10;
    }

    @Override
    public void pressClear() {
        currentValue = 0;
        previousValue = 0;
    }

    @Override
    public void pressSuprise() {
        previousValue = currentValue;
        currentValue = 0;
        this.newValue = true;
        this.operator = new Modulo();
    }
}

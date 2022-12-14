package calc;

import calc.operator.*;

public class InfixedCalculator implements Calculator{

    private int previousValue;
    private int currentValue;
    private Operator operator;

    private boolean newValue;

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

    public void pressOperator(Operator op){
        previousValue = currentValue;
        currentValue = 0;
        this.newValue = true;
        this.operator = op;
    }

    @Override
    public void pressPlus() {
        pressOperator(new Addition());
    }

    @Override
    public void pressMinus() {
        pressOperator(new Substraction());
    }

    @Override
    public void pressDiv() {
        pressOperator(new Division());
    }

    @Override
    public void pressMult() {
        pressOperator(new Multiplication());
    }

    @Override
    public void pressEquals() {
        if(this.newValue == true) {
            try{
                currentValue = (operator.compute(this.previousValue, this.currentValue));
            } catch(ArithmeticException e){
                pressClear();
            }

        }
        this.previousValue = 0;
        this.newValue = false;
    }

    @Override
    public void pressDel() {
        currentValue /= 10;
    }

    @Override
    public void pressClear() {
        currentValue = 0;
        previousValue = 0;
        this.newValue = false;
    }

    @Override
    public void pressSuprise() {
        pressOperator(new Modulo());
    }
}

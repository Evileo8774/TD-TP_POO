package calc;

import calc.operator.*;
import java.util.Stack;

public class PostfixedCalculator implements Calculator{

    private Stack<Integer> s;
    private Operator operator;

    public PostfixedCalculator(){
        this.s = new Stack<>();
        pressClear();
    }

    @Override
    public int getCurrentValue() {
        return s.peek();
    }

    @Override
    public void pressDigit(int digit) {
        if(s.peek() == 0){
            s.push(s.pop() + digit);
        } else {
            s.push(s.pop() * 10 + digit);
        }
    }

    /** Calcule la dernière valeur du Stack avec celle d'avant
    *
    * @params op l'opérateur que l'on souhaite utiliser
    *
    */

    public void pressOperator(Operator op){
        if(s.size() > 1){
            try{
                s.push(op.compute(s.pop(), s.pop()));
            } catch(ArithmeticException e){
                pressClear();
            }
        }
    }


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
        s.push(0);
    }

    @Override
    public void pressDel() {
        s.push(s.pop()/10);
    }

    @Override
    public void pressClear() {
        s.clear();
        s.push(0);
    }

    @Override
    public void pressSuprise() {
        pressOperator(new Modulo());
    }
}

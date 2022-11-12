package calc.operator;

import calc.Operator;

public class Substraction implements Operator {
    @Override
    public int compute(int op1, int op2) {
        return op1 - op2;
    }
}

package lastTest.CommandPatternAssgin;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CommandEqualButton extends JButton implements Command {
    Calculator calculator;

    public CommandEqualButton(Calculator calculator, ActionListener actionListener) {
        super("=");
        super.addActionListener(actionListener);
        this.calculator = calculator;
    }

    @Override
    public String execute() {
        if (calculator.isOperand1Set() && calculator.isOperand2Set() && calculator.isOperatorSet()) {
            String result;

            char operator = calculator.getOperator();
            if (operator == '+') {

                result = calculator.getOperand1() + calculator.getOperand2() + "";
                calculator.clearFlags();
                return result;

            } else if (operator == '-') {

                result = calculator.getOperand1() - calculator.getOperand2() + "";
                calculator.clearFlags();
                return result;

            } else if (operator == '/') {

                result = calculator.getOperand1() / calculator.getOperand2() + "";
                calculator.clearFlags();
                return result;

            } else {

                result = calculator.getOperand1() * calculator.getOperand2() + "";
                calculator.clearFlags();
                return result;

            }
        } else {
            return "please enter right format!!";
        }
    }
}

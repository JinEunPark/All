package lastTest.CommandPatternAssgin;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CommandMulButton extends JButton implements Command {
    Calculator calculator;

    public CommandMulButton(Calculator calculator, ActionListener actionListener){
        super("*");
        super.addActionListener(actionListener);
        this.calculator  = calculator;
    }

    @Override
    public String execute() {
        if(calculator.isOperand1Set()){
            calculator.setOperator('*');
            calculator.setOperatorSet(true);
            return"*";
        }else{
            return "please enter the first operand";
        }
    }
}

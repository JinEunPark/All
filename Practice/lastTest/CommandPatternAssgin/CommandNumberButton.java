package lastTest.CommandPatternAssgin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CommandNumberButton extends JButton implements Command {
    Calculator calculator;

    CommandNumberButton(Calculator calculator, String text, Dimension dimension, ActionListener actionListener) {
        super(text);
        this.calculator = calculator;
        super.setPreferredSize(dimension);
        super.addActionListener(actionListener);
    }

    @Override
    public String execute() {

        String text = super.getText();
        int index = 0;

        if(calculator.isOperand1Set()== false){
            calculator.setOperand1(Integer.parseInt(text));
            calculator.setOperand1Set(true);

        }else{

            calculator.setOperand2(Integer.parseInt(text));
            calculator.setOperand2Set(true);
        }
        return text;
    }

}

package CommandPatternAssgin;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CalcGUIV1 extends JFrame implements ActionListener {

    final static int WINDOW_WIDTH = 400;
    final static int WINDOW_HEIGHT = 300;
    final static int COMPONENT_HEIGHT = 40;
    final static int BUTTON_WIDTH = 50;

    String[] buttonText = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    JButton[] buttons = new JButton[buttonText.length];
    Calculator calculator;

    Dimension displayDimension = new Dimension(WINDOW_WIDTH - 20, COMPONENT_HEIGHT);
    Dimension buttonDimension = new Dimension(BUTTON_WIDTH, COMPONENT_HEIGHT);

    JLabel display = new JLabel(); // 숫자 값 및 결과 출력 화면

    CalcGUIV1() {
        super("CalcGUIV1");
        calculator = new Calculator();

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);//윈도우 사이즈 설정함
        Font labelFont = display.getFont();
        display.setHorizontalAlignment(SwingConstants.RIGHT);//오른 쪽으로 정렬하도록 만듦 라벨 안에 들어있는 텍스트를 설정함
        display.setFont(new Font(labelFont.getName(), Font.PLAIN, COMPONENT_HEIGHT - 5));//폰트를 설정함
        display.setPreferredSize(new Dimension(displayDimension));//주입된 dimension 객체로 사이즈가 설정됨.
        setResizable(false);
        setLayout(new BorderLayout());
        add(getDisplayPanel(), BorderLayout.NORTH);
        add(getButtonPanel(), BorderLayout.CENTER);
        clear();
    }

    public JPanel getDisplayPanel() {
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        displayPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        displayPanel.setPreferredSize(displayDimension);
        displayPanel.add(display);
        return displayPanel;
    }
    public JPanel getButtonPanel() {//버튼에 숫자넣고 판넬에 넣어서 반환함.
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,3,10,5));//5행 3열 새로 간격 10 가로 간격 5

        for (int i = 0; i < buttonText.length; i++) {
            buttons[i] = new CommandNumberButton(calculator,buttonText[i],buttonDimension,this);
            buttonPanel.add(buttons[i]);//판넬에 버튼을 삽입함
        }

        CommandPlusButton commandPlusButton = new CommandPlusButton(calculator,this);
        buttonPanel.add(commandPlusButton);//판넬에 버튼을 삽입함

        CommandDivButton commandDivButton = new CommandDivButton(calculator,this);
        buttonPanel.add(commandDivButton);//판넬에 버튼을 삽입함

        CommandMulButton commandMulButton = new CommandMulButton(calculator,this);
        buttonPanel.add(commandMulButton);//판넬에 버튼을 삽입함

        CommandEqualButton commandEqualButton = new CommandEqualButton(calculator,this);
        buttonPanel.add(commandEqualButton);//판넬에 버튼을 삽입함

        CommandSubButton commandSubButton = new CommandSubButton(calculator,this);
        buttonPanel.add(commandSubButton);//판넬에 버튼을 삽입함

        return buttonPanel;
    }

    public void clear() {
        display.setText("0");
    }//초기에 label에 0으로 표시함.

    @Override
    public void actionPerformed(ActionEvent e) {
        Command command = (Command) e.getSource();
        display.setText(command.execute());
    }

    public static void main(String[] args) {
        CalcGUIV1 c = new CalcGUIV1();
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
        c.setVisible(true);
    }
}


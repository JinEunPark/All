package lastTest.statusPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow extends FrameWindow implements ActionListener {
    private static final int X = 250;
    private static final int Y = 100;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 250;
    private static final int NUM_BUTTONS = 3;
    private static final int BUTTON_HEIGHT = 50;
    private static final String HUNDRED_BUTTON_TITLE = "100";
    private static final String THOUSAND_BUTTON_TITLE = "1000";
    private static final String FIVE_HUNDRED_BUTTON_TITLE = "500";
    private static final String RETURN_CHANGE_BUTTON_TITLE = "Return Changes";
    private static final String SELECT_BEVERAGE_BUTTON_TITLE = "Select a beverage";
    private JLabel balanceLabel;  // 현재 투입 금액을 나타내는 화면
    private JLabel msgLabel; // 기타 메시지를 보여주기 위한 화면
    private MyButton hundredButton;
    private MyButton fiveHundredButton;
    private MyButton thousandButton;
    private MyButton returnChangesButton;
    private MyButton selectBeverageButton;

    private Status status500;
    private Status statusLess500;
    private Status statusLess1000;
    private Status statusEqualOrMore1000;
    private Status statusZero;

    private Status status;


    private enum STATES { STATE_0, STATE_LESS_500, STATE_500, STATE_LESS_1000, STATE_EQUAL_OR_MORE_1000};
    private STATES state;
    int balance;

    public void setStatus500(Status status500) {
        this.status500 = status500;
    }

    public void setStatusLess500(Status statusLess500) {
        this.statusLess500 = statusLess500;
    }

    public void setStatusLess1000(Status statusLess1000) {
        this.statusLess1000 = statusLess1000;
    }

    public void setStatusEqualOrMore1000(Status statusEqualOrMore1000) {
        this.statusEqualOrMore1000 = statusEqualOrMore1000;
    }

    public void setStatusZero(Status statusZero) {
        this.statusZero = statusZero;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus500() {
        return status500;
    }

    public Status getStatusLess500() {
        return statusLess500;
    }

    public Status getStatusLess1000() {
        return statusLess1000;
    }

    public Status getStatusEqualOrMore1000() {
        return statusEqualOrMore1000;
    }

    public Status getStatusZero() {
        return statusZero;
    }

    public Status getStatus() {
        return status;
    }

    public MainWindow(String title) {
        super();
        createWindow(title, X, Y, WIDTH, HEIGHT);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        status500 = new Status500(this);
        statusLess1000 = new StatusLess1000(this);
        statusLess500 = new StatusLess500(this);
        statusEqualOrMore1000 = new StatusEqualOrMore1000(this);
        statusZero = new StateZero(this);
        this.status = this.statusZero;
        balance = 0;
    }

    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        balanceLabel = new JLabel();
        msgLabel = new JLabel();

        // create buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());
        JPanel coinButtonPanel = new JPanel();
        coinButtonPanel.setLayout(new BoxLayout(coinButtonPanel, BoxLayout.X_AXIS));
        coinButtonPanel.setPreferredSize(new Dimension(width, BUTTON_HEIGHT));

        hundredButton = new MyButton(HUNDRED_BUTTON_TITLE);
        hundredButton.setProperties(this, width / NUM_BUTTONS, BUTTON_HEIGHT);//
        coinButtonPanel.add(hundredButton);


        fiveHundredButton = new MyButton(FIVE_HUNDRED_BUTTON_TITLE);
        fiveHundredButton.setProperties(this, width / NUM_BUTTONS, BUTTON_HEIGHT);
        coinButtonPanel.add(fiveHundredButton);


        thousandButton = new MyButton(THOUSAND_BUTTON_TITLE);
        thousandButton.setProperties(this, width / NUM_BUTTONS, BUTTON_HEIGHT);
        coinButtonPanel.add(thousandButton);


        buttonPanel.add(coinButtonPanel, BorderLayout.NORTH);
        returnChangesButton = new MyButton(RETURN_CHANGE_BUTTON_TITLE);
        returnChangesButton.setProperties(this, width / NUM_BUTTONS, BUTTON_HEIGHT);
        buttonPanel.add(returnChangesButton, BorderLayout.CENTER);


        selectBeverageButton = new MyButton(SELECT_BEVERAGE_BUTTON_TITLE);
        selectBeverageButton.setProperties(this, width / NUM_BUTTONS, BUTTON_HEIGHT);
        buttonPanel.add(selectBeverageButton, BorderLayout.SOUTH);

        panel.add(buttonPanel, BorderLayout.NORTH);
        balanceLabel.setPreferredSize(new Dimension(width, (HEIGHT - BUTTON_HEIGHT) / 2));
        panel.add(balanceLabel, BorderLayout.CENTER);
        msgLabel.setPreferredSize(new Dimension(width, (HEIGHT - BUTTON_HEIGHT) / 2));
        panel.add(msgLabel, BorderLayout.SOUTH);
        setBalanceText(); // 투입 금액 0
        return panel;
    }

    public void setBalanceText() {
        balanceLabel.setText("현재 투입 금액: " + balance + "원");
    }

    public void setMsgText(String msg) {
        msgLabel.setText(msg);
    }

    public void addHundred() {
      status.addHundred();
    }

    public void addFiveHundred() {
     status.addFiveHundred();
    }

    public void addThousand() {
     status.addThousand();
    }

    public void returnChanges() {
        status.returnChanges();
    }

    public void selectBeverage() {
      status.selectBeverage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hundredButton) {
            addHundred();
        }
        else if (e.getSource() == fiveHundredButton) {
            addFiveHundred();
        }
        else if (e.getSource() == thousandButton) {
            addThousand();
        }
        else if (e.getSource() == returnChangesButton) {
            returnChanges();
        }
        else if (e.getSource() == selectBeverageButton) {
            selectBeverage();
        }
    }
}


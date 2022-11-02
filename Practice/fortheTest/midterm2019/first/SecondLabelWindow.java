package fortheTest.midterm2019.first;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class SecondLabelWindow extends FrameWindow implements Observer {
    private LocalTime localTime;
    private JLabel label;

    public SecondLabelWindow(String title, int x, int y, int width, int height) {
        super(title, x, y, width, height);

    }

    public void updateText(String msg){
        label.setText(msg);
        label.validate();
    }

    @Override
    public void update(LocalTime localTime) {
        this.localTime = localTime;
        updateText(localTime.toString());
    }


    @Override
    public JPanel createPanel(int width, int height) {

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        label = new JLabel();
        panel.add(label);
        panel.setPreferredSize(new Dimension(width,height));
        return panel;
    }

}

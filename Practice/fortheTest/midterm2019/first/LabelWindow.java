package fortheTest.midterm2019.first;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class LabelWindow extends FrameWindow implements Observer{

    private JLabel jLabel;
    private LocalTime localTime;



    public LabelWindow(String title, int x, int y, int width, int height) {
        super(title, x, y, width, height);

    }

    public void updateText(String msg){
        jLabel.setText(msg);
        jLabel.validate();
    }


    @Override
    public JPanel createPanel(int width, int height) {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jLabel = new JLabel();
        jPanel.add(jLabel);
        jPanel.setPreferredSize(new Dimension(width,height));
        return jPanel;
    }

    @Override
    public void update(LocalTime localTime) {
        this.localTime = localTime;
        updateText(localTime.toString());
    }
}

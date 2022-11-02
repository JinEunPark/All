package fortheTest.midterm2019.first;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends FrameWindow{
    private static final String MAIN_TITLE = "Main Window";
    private static final String TEXTFIELD_WINDOW_TITLE = "TextField Window";
    private static final String LABEL_WINDOW_TITLE = "Label Window";

    private static final String TEXTFIELD_OBSERVER_BUTTON_TITLE = "Update TextField Window Observer";
    private static final String TEXTFIELD_OBSERVER_REMOVE_BUTTON_TITLE = "Remove TextField Window Observer";
    private static final String LABEL_OBSERVER_BUTTON_TITLE = "Update Label Window Observer";
    private static final String LABEL_OBSERVER_BUTTON_REMOVE_TITLE = "Remove Label Window Observer";
    private static final String STOP_THREAD_BUTTON_TITLE = "Stop Generating Prime Number";

    private static final int X = 250;
    private static final int Y = 100;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 200;
    private static final int GAP = 50;
    private static final int NUM_BUTTONS = 3;



    private CurrentTimeThread currentTimeThread;
    private LabelWindow secondLabelWindow;
    private LabelWindow labelWindow;
    private JLabel label;

    public MainWindow(String title) {
        super(title, X, Y, WIDTH, HEIGHT);

        currentTimeThread = new CurrentTimeThread();
        labelWindow = new LabelWindow(LABEL_WINDOW_TITLE,X,Y+(HEIGHT + GAP) * 1,WIDTH,HEIGHT);
        secondLabelWindow = new LabelWindow(LABEL_WINDOW_TITLE,X,Y+(HEIGHT + GAP) * 2,WIDTH,HEIGHT);
        currentTimeThread.registerObserver(labelWindow);
        currentTimeThread.registerObserver(secondLabelWindow);
        currentTimeThread.run();
    }

    @Override
    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setPreferredSize(new Dimension(width, height));
        return panel;
    }


    public static void main(String[]args){
        MainWindow mainWindow = new MainWindow(MAIN_TITLE);

    }
}

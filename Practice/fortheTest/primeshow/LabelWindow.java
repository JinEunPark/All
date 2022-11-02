package fortheTest.primeshow;
import javax.swing.*;
import java.awt.*;

public class LabelWindow extends FrameWindow implements Observer{
    private JLabel label;
    private PrimeObservableThread primeObservableThread;
    private int primeNumber;
    private boolean observable = false;

    public LabelWindow(String title, int x, int y, int width, int height, PrimeObservableThread primeObservableThread) {

        super(title, x, y, width, height);
        this.primeObservableThread = primeObservableThread;

    }

    public void updateText(String msg) {
        label.setText(msg);
        label.validate();
    }

    public JPanel createPanel(int width, int height) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        label = new JLabel();
        panel.add(label);
        panel.setPreferredSize(new Dimension(width, height));
        return panel;
    }

    @Override
    public boolean getObserverState() {
        return observable;
    }

    @Override
    public void removeObserverSelf(){
        primeObservableThread.removeObserver(this);
        observable = false;
    }

    @Override
    public void registerObserverSelf(){
        primeObservableThread.registerObserver(this);
        observable = true;
    }

    @Override
    public void update(int primeNumber){
        this.primeNumber = primeNumber;
        updateText(""+primeNumber);
        //subject class에서 넘어온 값을 해당 객체에 저장함.
    }
}


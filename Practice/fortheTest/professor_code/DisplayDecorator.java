package fortheTest.professor_code;

import fortheTest.professor_code.Display;
import javax.swing.*;

public abstract class DisplayDecorator extends Display {
    DisplayDecorator(Display display, int width, int height) {
        super(width, height);
    }
}


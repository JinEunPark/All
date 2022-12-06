package lastTest.TemplatePattern;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class ImageConvertFrameWork {


    public void imageConvert(String house, String prefix){

        try {
            BufferedImage image = ImageIO.read(new File(house));

            for(int y = 0; y < image.getHeight(); y++) {
                for(int x = 0; x < image.getWidth(); x++) {
                    Color color = new Color(image.getRGB(x, y));
                    color = convertRGB(color);
                    image.setRGB(x, y, color.getRGB());
                }
            }

            ImageIO.write(image, "png", new File(prefix + house));
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    abstract Color convertRGB(Color color);


}

package lastTest.TemplatePattern;

public class Main {
    public static void main(String[]args){
          String house = "house.png";
          String prefix[]  = {"g_","inv_","s_"};

        ImageConvertFrameWork imageConvertFrameWorks[] =
                {new GreyImageConverter(),new InverseImageConverter(), new SepiaImageConverter()};

        int i = 0;
        for(ImageConvertFrameWork imageConvertFrameWork : imageConvertFrameWorks){
            imageConvertFrameWork.imageConvert(house,prefix[i]);
            i++;
        }
    }
}

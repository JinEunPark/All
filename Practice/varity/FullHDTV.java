package varity;

public class FullHDTV extends TV{
    String processor;

    public FullHDTV(String processor) {
        this.processor = processor;
    }

    @Override
    public void showWithProcessor(){
        System.out.println("show with"+processor);
    }
}

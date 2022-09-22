package varity;

abstract class TV {

    String channel;
    int channelNo;
    int volume;

    public TV() {
        channel = "EBS";
        channelNo = 10;
        volume = 10;
    }

    public void show() {
        System.out.printf("channel = %s, channelNo = %d, volume = %d\n", channel, channelNo, volume);
        showWithProcessor();
    }
    public abstract void showWithProcessor();//반드시 구현해야하는 추상메소드 생성함.
}

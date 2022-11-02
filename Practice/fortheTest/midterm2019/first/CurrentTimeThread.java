package fortheTest.midterm2019.first;

import java.time.LocalTime;
import java.util.ArrayList;

public class CurrentTimeThread implements Runnable,Subject{

    private static final int SLEEPTIME = 1000;
    private LocalTime localTime;//로컬 타임을 저장할 객체를 생성함

    private ArrayList<Observer> observerArrayList;//observer를 저장할 객체를 만듬

    public CurrentTimeThread(){
        this.observerArrayList = new ArrayList<>();
    }

    private void makeCurrentTime(){

        while(true){
            localTime = LocalTime.now();
            notifyObserver();
            try {
                Thread.sleep(SLEEPTIME); // 1초 쉼
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run() {
        makeCurrentTime();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerArrayList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerArrayList.remove(observer);

    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observerArrayList){
            observer.update(localTime);
        }
    }
}

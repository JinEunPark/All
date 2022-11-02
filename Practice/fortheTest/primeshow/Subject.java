package fortheTest.primeshow;

public interface Subject {
    public void registerObserver(Observer observer);
    public void notifyObserver();
    public void removeObserver(Observer observer);
}

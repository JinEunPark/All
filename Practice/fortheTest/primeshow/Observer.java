package fortheTest.primeshow;

public interface Observer {
    public void update(int primeNumber);
    public void removeObserverSelf();
    public void registerObserverSelf();
    public boolean getObserverState();

}

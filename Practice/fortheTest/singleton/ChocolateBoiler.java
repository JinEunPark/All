package fortheTest.singleton;

import fortheTest.factoryPattern.simplefactoryPattern.ChicagoPizza;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static volatile ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        this.empty = true;
        this.boiled = false;
    }
    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return this.boiled;
    }

    public void fill(){
        if(this.isEmpty()){
            this.empty = false;
            this.boiled = false;
        }
    }

    public static ChocolateBoiler getInstance(){

        if(uniqueInstance == null){
            synchronized (ChocolateBoiler.class){
                if(uniqueInstance == null){
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }

        return uniqueInstance;
    }


}

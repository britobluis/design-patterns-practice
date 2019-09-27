package observer.pattern.weather;

import java.util.ArrayList;

/**
 *
 * @author Luis Brito
 */
public class SimpleWeatherStation implements Subject {

    private ArrayList<Observer> observers;
    private int temperature;
    private int windSpeed;
    private int pressure;

    public SimpleWeatherStation() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, windSpeed, pressure);
        }
    }
    
    public void setState(int temperature, int windSpeed, int pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        notifyObservers();
    }

}

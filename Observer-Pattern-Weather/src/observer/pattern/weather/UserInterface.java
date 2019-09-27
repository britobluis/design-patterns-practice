/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.pattern.weather;

/**
 *
 * @author Luis Brito
 */
public class UserInterface implements Observer {
    private int temperature;
    private int windSpeed;
    private int pressure;
    private Subject simpleSubject;

    public UserInterface(Subject simpleSubject) {
        this.simpleSubject = simpleSubject;
        simpleSubject.registerObserver(this);
    }
    
    @Override
    public void update(int temperature, int windSpeed, int pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        display();
    }
    
    public void display() {
        System.out.println("Temperature: " + temperature);
        System.out.println("Wind Speed: " + windSpeed);
        System.out.println("Pressure: " + pressure);
    }
    
}

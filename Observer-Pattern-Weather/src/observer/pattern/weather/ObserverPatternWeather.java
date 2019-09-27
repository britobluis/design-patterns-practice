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
public class ObserverPatternWeather {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SimpleWeatherStation station1 = new SimpleWeatherStation();
        
        UserInterface ui1 = new UserInterface(station1);
        Logger log1 = new Logger(station1);
        AlertSystem alert1 = new AlertSystem(station1);
        
        station1.setState(25, 50, 15);
        
    }
    
}

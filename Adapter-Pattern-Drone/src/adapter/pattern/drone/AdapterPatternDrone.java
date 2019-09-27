package adapter.pattern.drone;

/**
 *
 * @author Luis Brito
 */
public class AdapterPatternDrone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Duck Simulator
        // Test Duck
        Duck duck = new MallardDuck();
        testDuck(duck);
        
        // Test Turkey
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        testDuck(turkeyAdapter);
        
        // Test Drone
        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        testDuck(droneAdapter);
    }
    static void testDuck(Duck duck){
        duck.fly(); duck.quack();
    }
}

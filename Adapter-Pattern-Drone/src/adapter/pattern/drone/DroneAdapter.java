package adapter.pattern.drone;

/**
 *
 * @author Luis Brito
 */
public class DroneAdapter implements Duck {
    Drone drone;
    
    public DroneAdapter(Drone droneP){
        this.drone = droneP;
    }
    
    @Override
    public void quack() {
        drone.beep();
    }

    @Override
    public void fly() {
        drone.spin_rotors();
        drone.take_off();
    }  
}

package examples.state;

public class TrafficLight {
    // Context class
    private TrafficLightState currentState;

    public TrafficLight() {
        // Initial state
        this.currentState = new RedLightState(); 
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void changeState() {
        currentState.handleRequest(this);
    }
}

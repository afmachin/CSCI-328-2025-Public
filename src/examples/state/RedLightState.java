package examples.state;

public class RedLightState implements TrafficLightState {
     @Override
    public void handleRequest(TrafficLight context) {
        System.out.println("Traffic Light is RED. Stop!");
        context.setState(new GreenLightState()); // Transition to Green
    }
}

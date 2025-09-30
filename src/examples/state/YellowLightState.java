package examples.state;

public class YellowLightState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLight context) {
        System.out.println("Traffic Light is YELLOW. Prepare to stop!");
        context.setState(new RedLightState()); // Transition to Red
    }
}

package solutions.factory_method_pattern;

public class CarDealershipMessageFactory extends MessageFactory {

    protected MyMessage createMessage(String type, String name, String contactInfo){
        MyMessage message;
        // Add the others here.
        switch (type) {
            case "1":
                message = new EmailMessage();
                break;
        
            default:
                message = new EmailMessage();
                break;
        }

        return message;
    }
}

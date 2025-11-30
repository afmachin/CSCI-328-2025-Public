package solutions.factory_method_pattern;

public abstract class MessageFactory {
    public boolean sendMessage(String type, String name, String contactInfo){
        // Not implemented in the example, but the reason this returns a boolean is to get retry logic in the main
        MyMessage message = createMessage(type, name, contactInfo);
        message.setName(name);
        message.setContactInfo(contactInfo);

        boolean messageSent = false;
        if(message.verifyContactInfo() && message.verifyName()){
            message.sendMessage();
            messageSent = true;
        }

        return messageSent;
    }

    protected abstract MyMessage createMessage(String type, String name, String contactInfo);
}

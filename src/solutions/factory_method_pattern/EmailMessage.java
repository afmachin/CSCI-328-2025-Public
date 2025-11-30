package solutions.factory_method_pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailMessage implements MyMessage {

    String contactInfo;
    String name;

    public void setName(String name){
        this.name = name;
    }

    public void setContactInfo(String contactInfo){
        this.contactInfo = contactInfo;
    }
    
    public boolean verifyContactInfo(){
        // Formats
        // something@somplace.dotcom
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern regexPattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = regexPattern.matcher(contactInfo);

        return matcher.matches();
    }

    public boolean verifyName(){
        name = name.equals("") ? "Customer" : name;
        return true;
    }

    public void sendMessage(){
        System.out.println("We are sending an email to " + name + " at " + contactInfo);
    }
}

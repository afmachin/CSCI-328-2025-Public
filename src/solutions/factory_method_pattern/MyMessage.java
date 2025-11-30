package solutions.factory_method_pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface MyMessage {
    public boolean verifyContactInfo();
    public boolean verifyName();
    public void sendMessage();
    public void setName(String name);
    public void setContactInfo(String contactInfo);
}

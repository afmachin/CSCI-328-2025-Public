package solutions.factory_method_pattern;

import java.util.Scanner;

public class MessageCenter {
    public static void main(String[] args) {
        String contactInformation;
        String name;
        String product = "car";
        String choice = "0";
        Scanner scnr = new Scanner(System.in);
        MessageFactory factory = new CarDealershipMessageFactory();

        System.out.println("Hello what is your name?");
        name = scnr.nextLine();

        System.out.printf("How would you like to be contacted about deals on our %ss?\n", product);
        System.out.println("1) Email \n2) SMS \n3) Mail");
        choice = scnr.nextLine();
        System.out.println("What is your contact information for your choice?");
        contactInformation = scnr.nextLine();
        factory.sendMessage(choice, name, contactInformation);
    }
}

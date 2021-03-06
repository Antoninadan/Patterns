package ua.i.mail100.template;

import ua.i.mail100.template.abstractclass.Network;
import ua.i.mail100.template.concreteclass.Facebook;
import ua.i.mail100.template.concreteclass.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://refactoring.guru/uk/design-patterns/template-method/java/example
public class TemplateRunner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}

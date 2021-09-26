package ir.maktab.service.front.menu;

import ir.maktab.service.front.input.InputString;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstMenu extends Menu implements RunnableMenu<Void> {

    public FirstMenu() {
        super(new ArrayList<>(Arrays.asList("Log In", "Sign Up", "Exit")));
    }

    @Override
    public Void runMenu(){
        while (true) {
            switch (getItemFromConsole()) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    if (new CheckMenu("Are you sure you want to exit?").runMenu()) return null;
                    else break;
            }
        }
    }

    private String getPassword() {
        return new InputString("Enter your password: ").getStringInput();
    }

    private String getUsername() {
        return new InputString("Enter your username: ").getStringInput();
    }

}

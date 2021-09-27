package ir.maktab.service.front.menu;

import java.util.ArrayList;
import java.util.Arrays;

public class AirlineMenu extends Menu implements RunnableMenu<Void> {

    public AirlineMenu() {
        super(new ArrayList<>(Arrays.asList("Show Flights", "Add New Flight", "Exit")));
    }

    @Override
    public Void runMenu() {
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
}

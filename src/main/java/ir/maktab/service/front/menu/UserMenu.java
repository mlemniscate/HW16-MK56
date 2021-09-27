package ir.maktab.service.front.menu;

import com.github.javafaker.Faker;
import ir.maktab.domain.AirlineFlight;
import ir.maktab.domain.User;
import ir.maktab.service.front.input.InputString;
import ir.maktab.util.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserMenu extends Menu implements RunnableMenu<Void> {

    private final User user;
    Faker faker = new Faker();

    public UserMenu(User user) {
        super(new ArrayList<>(Arrays.asList("Buy Ticket", "Chose Cities Again", "Exit")));
        this.user = user;
        showAllFlights();
    }

    @Override
    public Void runMenu() {
        while (true) {
            switch (getItemFromConsole()) {
                case 1:

                    break;
                case 2:
                    showAllFlights();
                    break;
                case 3:
                    if (new CheckMenu("Are you sure you want to exit?").runMenu()) return null;
                    else break;
            }
        }
    }

    private void showAllFlights() {
        String initialCity = getCity("From");
        String destinationCity = getCity("To");
        List<AirlineFlight> flights =  ApplicationContext.getAirlineFlightService().findByCities(initialCity, destinationCity);
        for (int i = 0; i < flights.size(); i++) {
            System.out.println("--------------------------------------------------");
            System.out.printf("#%d: %s\n", (i+1),flights.get(i));
            System.out.println("--------------------------------------------------");
        }
    }

    private String getCity(String msg) {
        return new InputString(msg + ": ").getStringInput();
    }
}

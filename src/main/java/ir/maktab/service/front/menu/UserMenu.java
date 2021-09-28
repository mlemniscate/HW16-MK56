package ir.maktab.service.front.menu;

import ir.maktab.domain.AirlineFlight;
import ir.maktab.domain.User;
import ir.maktab.service.front.input.InputString;
import ir.maktab.util.ApplicationContext;

import java.util.*;

public class UserMenu extends Menu implements RunnableMenu<Void> {

    private final User user;
    private List<AirlineFlight> flights;

    public UserMenu(User user) {
        super(new ArrayList<>(Arrays.asList("Buy Ticket", "Chose Cities Again", "Ordered By", "Exit")));
        this.user = user;
        chooseCitiesAndShow();
    }

    @Override
    public Void runMenu() {
        while (true) {
            switch (getItemFromConsole()) {
                case 1:

                    break;
                case 2:
                    chooseCitiesAndShow();
                    break;
                case 3:
                    orderedFlightsBy();
                    break;
                case 4:
                    if (new CheckMenu("Are you sure you want to exit?").runMenu()) return null;
                    else break;
            }
        }
    }

    private void orderedFlightsBy() {
        int comparatorItem = new Menu(new ArrayList<>(Arrays.asList("Price", "Airline"))).getItemFromConsole();
        int orderItem = new Menu(new ArrayList<>(Arrays.asList("Asc", "Desc"))).getItemFromConsole();
        if(comparatorItem == 1) {
            flights.sort(Comparator.comparing(AirlineFlight::getPrice));
            if(orderItem == 2) {
                Collections.reverse(flights);
            }
        } else if(comparatorItem == 2) {
            flights.sort(Comparator.comparing(flight -> flight.getAirline().getAirlineName()));
            if(orderItem == 2) {
                Collections.reverse(flights);
            }
        }
        showFlights();
    }

    private void chooseCitiesAndShow() {
        String initialCity = getCity("From");
        String destinationCity = getCity("To");
        flights =  ApplicationContext.getAirlineFlightService().findByCities(initialCity, destinationCity);
        showFlights();
    }

    private void showFlights() {
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

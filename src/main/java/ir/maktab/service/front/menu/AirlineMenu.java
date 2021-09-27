package ir.maktab.service.front.menu;

import ir.maktab.domain.Airline;
import ir.maktab.domain.AirlineFlight;
import ir.maktab.util.ApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AirlineMenu extends Menu implements RunnableMenu<Void> {

    private final Airline airline;

    public AirlineMenu(Airline airline) {
        super(new ArrayList<>(Arrays.asList("Show Flights", "Add New Flight", "Exit")));
        this.airline = airline;
        showAirlineFlights();
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

    private void showAirlineFlights() {
        List<AirlineFlight> flights = ApplicationContext.getAirlineFlightService().findAllAirlineId(airline.getId());
        for (int i = 0; i < flights.size(); i++) {
            System.out.println("--------------------------------------------------");
            System.out.printf("#%d: %s\n", (i+1),flights.get(i));
            System.out.println("--------------------------------------------------");
        }
    }
}

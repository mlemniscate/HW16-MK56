package ir.maktab.service.front.menu;

import com.github.javafaker.Faker;
import ir.maktab.domain.User;

import java.util.ArrayList;
import java.util.Arrays;

public class UserMenu extends Menu implements RunnableMenu<Void> {

    private final User user;
    Faker faker = new Faker();

    public UserMenu(User user) {
        super(new ArrayList<>(Arrays.asList("", "", "Exit")));
        this.user = user;
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

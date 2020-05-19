package ua.i.mail100.strategy.strategy;

import ua.i.mail100.strategy.model.User;

import java.util.Comparator;

public class SortByFioStrategy implements Comparator<User> {

    public int compare(User o1, User o2) {
        return o1.getFio().compareTo(o2.getFio());
    }

}
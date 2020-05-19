package ua.i.mail100.strategy.strategy;

import ua.i.mail100.strategy.model.User;

import java.util.Comparator;

public class SortByIDStrategy implements Comparator<User> {

    public int compare(User o1, User o2) {
        return Integer.valueOf(o1.getID()).compareTo(o2.getID());
    }

}
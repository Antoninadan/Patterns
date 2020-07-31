package ua.i.mail100.strategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AndreyStrategy {
    public static void main(String[] args) {

        Sortable rightSorting = new RightSorting();

        Sortable revereseSorting = new RevereseSorting();

        StrategyObject strategyObject = new StrategyObject(rightSorting);

        List<Integer> list = Arrays.asList(5, -9, 1, 0, 2);

        strategyObject.action(list);
        System.out.println(list);


        strategyObject.setSortable(revereseSorting);

        strategyObject.action(list);

        System.out.println(list);

    }
}

class StrategyObject {
    private Sortable sortable;

    public StrategyObject(Sortable sortable) {
        this.sortable = sortable;
    }

    public void setSortable(Sortable sortable) {
        this.sortable = sortable;
    }

    void action(List<Integer> list) {
        sortable.sort(list);
    }
}

interface Sortable {
    void sort(List<Integer> list);
}

class RightSorting implements Sortable {
    @Override
    public void sort(List<Integer> list) {
        Collections.sort(list);
    }
}

class RevereseSorting implements Sortable {
    @Override
    public void sort(List<Integer> list) {

        Comparator<Integer> comparator = Integer::compare;

        Collections.sort(list, comparator.reversed());
    }
}

package ua.i.mail100.strategy;

import ua.i.mail100.strategy.model.User;
import ua.i.mail100.strategy.strategy.SortByDateStrategy;
import ua.i.mail100.strategy.strategy.SortByFioStrategy;
import ua.i.mail100.strategy.strategy.SortByIDStrategy;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortStrategyRunner {
    public static void main(String[] args) {
        int mode = 0;

        try {
            mode = Integer.parseInt(args[0]);
        } catch (Exception e) {
            // Просто игнорируем оставляя значение по-умалчанию
        }

        Calendar calendar = Calendar.getInstance();

        calendar.set(1799, 6, 6);
        User Пушкин = new User(1, "Пушкин Александр", calendar.getTime());

        calendar.set(1868, 3, 28);
        User Горький = new User(3, "Горький Максим", calendar.getTime());

        calendar.set(1828, 9, 28);
        User Толстой = new User(2, "Толстой Лев", calendar.getTime());

        calendar.set(1905, 5, 11);
        User Шолохов = new User(5, "Шолохов Михаил", calendar.getTime());

        calendar.set(1821, 11, 22);
        User Некрасов = new User(4, "Некрасов Николай", calendar.getTime());

        Set<User> users = getSet(mode);
        users.add(Пушкин);
        users.add(Горький);
        users.add(Толстой);
        users.add(Шолохов);
        users.add(Некрасов);

        System.out.println(users);
    }

    /**
     * Создание множества с конкретной стратегией
     * сравнения
     *
     * @param mode - код стратегии
     * @return Пустое множество, елементы которого
     * будут сортироваться определенным образом
     */
    public static Set<User> getSet(int mode) {
        Comparator<User> sortStrategy;
        switch (mode) {
            case 2:
                System.out.println("Сортировка по дате регистрации");
                sortStrategy = new SortByDateStrategy();
                break;
            case 1:
                System.out.println("Сортировка по ФИО");
                sortStrategy = new SortByFioStrategy();
                break;
            default:
                System.out.println("Сортировка по ID-ку");
                sortStrategy = new SortByIDStrategy();
                break;
        }
        return new TreeSet<>(sortStrategy);
    }
}
package ua.i.mail100.observer.concreteobserver;

import ua.i.mail100.observer.concretesubject.Users;

import java.util.Observable;
import java.util.Observer;

public class Eye implements Observer {
    Users watching;

    public Eye(Users users) {
        this.watching = users;
        watching.addObserver(this);
    }

    public void update(Observable users, Object userName) {
        if (users != watching) {
            throw new IllegalArgumentException();
        }

        String name = (String) userName;
        if (watching.loggedIn(name)) {
            addUser(name);
        } else {
            removeUser(name);
        }

    }

    public void removeUser(String name) {
        /* ...
         * Удаляем пользователя из списка
         * присутсвующих
         * ....
         */

    }

    public void addUser(String name) {
        /* ...
         * Регистрируем пользователя в списке
         * присутсвующих
         * ...
         */
    }

}

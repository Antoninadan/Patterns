package ua.i.mail100.observer2;

import java.util.ArrayList;
import java.util.Iterator;

public class Observers<T extends Observer> extends ArrayList<T> {
    public void notifyObjectCreated(Object obj) {
        Iterator<T> iter;
        iter = (Iterator<T>) iterator();
        while (iter.hasNext()) {
            iter.next().objectCreated(obj);
        }
    }

    public void notifyObjectModified(Object obj) {
        Iterator<T> iter = (Iterator<T>) iterator();
        while (iter.hasNext())
            iter.next().objectModified(obj);
    }
}

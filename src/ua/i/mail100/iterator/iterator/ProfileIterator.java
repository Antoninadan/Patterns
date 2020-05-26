package ua.i.mail100.iterator.iterator;

import ua.i.mail100.iterator.model.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
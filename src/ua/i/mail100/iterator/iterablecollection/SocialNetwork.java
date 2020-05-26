package ua.i.mail100.iterator.iterablecollection;

import ua.i.mail100.iterator.iterator.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
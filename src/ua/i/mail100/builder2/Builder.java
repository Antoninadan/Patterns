package ua.i.mail100.builder2;

// builder
public interface Builder {
    String getFirstName(Man man);
    String getLastName(Man man);
    String getAll(Man man);

    int getAge(Man man);
    Man whereAge(int age);
    Man whereFirstName(String firstName);
}

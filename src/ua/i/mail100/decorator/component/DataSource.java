package ua.i.mail100.decorator.component;

//Компонент задає загальний інтерфейс обгорток та об’єктів, що загортаються.
public interface DataSource {
    void writeData(String data);

    String readData();
}
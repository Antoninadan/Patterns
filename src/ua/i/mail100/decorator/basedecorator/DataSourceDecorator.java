package ua.i.mail100.decorator.basedecorator;

import ua.i.mail100.decorator.component.DataSource;

//Базовий декоратор зберігає посилання на вкладений об’єкт-компонент.
//        Це може бути як конкретний компонент, так і один з конкретних декораторів.
//        Базовий декоратор делегує всі свої операції вкладеному об’єкту.
//        Додаткова поведінка житиме в конкретних декораторах.

public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
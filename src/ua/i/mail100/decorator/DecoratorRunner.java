package ua.i.mail100.decorator;

import ua.i.mail100.decorator.basedecorator.DataSourceDecorator;
import ua.i.mail100.decorator.component.DataSource;
import ua.i.mail100.decorator.concretecomponent.FileDataSource;
import ua.i.mail100.decorator.concretedecorator.CompressionDecorator;
import ua.i.mail100.decorator.concretedecorator.EncryptionDecorator;

//https://refactoring.guru/uk/design-patterns/decorator/java/example
public class DecoratorRunner {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);

        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);

        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}

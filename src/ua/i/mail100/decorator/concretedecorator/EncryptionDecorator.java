package ua.i.mail100.decorator.concretedecorator;

import ua.i.mail100.decorator.component.DataSource;
import ua.i.mail100.decorator.basedecorator.DataSourceDecorator;

import java.util.Base64;

//Конкретні декоратори — це різні варіації декораторів, що містять додаткову поведінку.
//        Вона виконується до або після виклику аналогічної поведінки загорнутого об’єкта.
public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
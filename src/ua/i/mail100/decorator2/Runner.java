package ua.i.mail100.decorator2;
/*
* Component – компонент. Класс, задает интерфейс для объектов,
  на которые могут быть динамически возложены дополнительные обязанности, ровно как задает его и для будущих декораторов.
* ConcreteComponent - конкретный компонент. Определяет объект, на который
  возлагаются дополнительные обязанности, вешаются дополнительные возможности.
* Decorator – декоратор. Хранит ссылку на объект Component и наследует реализацию его интерфейса по-умалчанию;
* ConcreteDecorator - конкретный декоратор. Возлагает дополнительные обязанности на компонент.
*/

public class Runner {
    public static void main(String[] args) {
        String text = "Hello world";

        BaseDecorator decorated = new CurlyBraces(new SquareBraces (new SlashBraces( new Printer())));

        decorated.print(text);
    }
}

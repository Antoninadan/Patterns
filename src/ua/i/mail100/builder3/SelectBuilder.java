package ua.i.mail100.builder3;

//SELECT *(or other columns) FROM table_name WHERE condition

import java.util.Collections;
import java.util.stream.IntStream;

public class SelectBuilder {
    private StringBuilder sBuilder;

    public SelectBuilder() {
        sBuilder = new StringBuilder("SELECT ");
    }

    public SelectBuilder buildSelectArgs(String... args) {

        IntStream.range(0, args.length - 1).forEach(i -> {

            sBuilder.append(args[i]).append(",");

        });

        sBuilder.append(args[args.length - 1]);

        return this;

    }

    public SelectBuilder buildTableName(String name) {
        sBuilder.append(" FROM ").append(name);

        return this;
    }

    public String build() {
        return sBuilder.toString();
    }
}


class TestBuilder {
    public static void main(String[] args) {
        String request = new SelectBuilder()
                .buildSelectArgs("age", "first_name", "last_name")
                .buildTableName("Man")
                .build();

        System.out.println(request);
    }
}
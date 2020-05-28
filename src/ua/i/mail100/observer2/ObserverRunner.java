package ua.i.mail100.observer2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//https://codelab.ru/pattern/observer/
public class ObserverRunner {
    public static void main(String[] args) {
        Subject subject1 = new Subject(1);
        Subject subject2 = new Subject(2);
        subject2.setField(45);
        System.out.println(subject2.observers);


        List<Integer> list = Arrays.asList(new Integer[] {1,2,3});


        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
//            iter.next().toString();
            System.out.println(iter.next());
        }


    }
}

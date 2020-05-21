package ua.i.mail100.observer2;

public class Subject {
    public Observers observers = new Observers();
    private int field;

    public Subject(int field) {
        this.field = field;
        observers.notifyObjectCreated(this);
    }

    public void setField(int o) {
        field = o;
        observers.notifyObjectModified(this);
    }
}
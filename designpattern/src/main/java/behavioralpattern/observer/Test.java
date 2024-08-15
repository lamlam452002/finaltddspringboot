package behavioralpattern.observer;

public class Test {
    public static void main(String[] args) {
        Subject objSubject = new Subject();
        Observer observer1 = new Observer("Observer 1");
        objSubject.attach(observer1);

        Observer observer2 = new Observer("Observer 2");
        objSubject.attach(observer2);

        objSubject.notifyChange("Test change state 1");
        objSubject.detach(observer1);
        objSubject.notifyChange("Test change state 2");
    }

}

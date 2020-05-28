package com.paro.Behaviorial_Patterns.ObserverPattern.Type1;

public class ObserverApp {
    public static void main(String[] args) {
        ObserverInterface myObserver1 = new Observer1("Roy");
        ObserverInterface myObserver2 = new Observer1("Kevin");
        ObserverInterface myObserver3 = new Observer2("Bose");
        Subject subject = new Subject();

        subject.register(myObserver1);
        subject.register(myObserver2);
        subject.register(myObserver3);
        System.out.println(" Setting Flag = 5 ");
        subject.setFlag(5);

        subject.unregister(myObserver1);

        System.out.println("\n Setting Flag = 50 ");
        subject.setFlag(50);

        subject.register(myObserver1);
        System.out.println("\n Setting Flag = 100 ");
        subject.setFlag(100);
    }
}

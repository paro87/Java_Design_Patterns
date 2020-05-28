package com.paro.Behaviorial_Patterns.IteratorPattern.Type1;

public class IteratorApp {
    public static void main(String[] args) {
        Subjects artSubjects=new Arts();
        Iterator iteratorForArts=artSubjects.createIterator();
        while (iteratorForArts.hasNext()) {
            System.out.println(iteratorForArts.next());
        }
        iteratorForArts.first();
        System.out.println(iteratorForArts.currentItem());
    }
}

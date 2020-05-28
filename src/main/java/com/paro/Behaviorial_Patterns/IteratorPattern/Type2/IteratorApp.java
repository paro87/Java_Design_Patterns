package com.paro.Behaviorial_Patterns.IteratorPattern.Type2;

public class IteratorApp {
    public static void main(String[] args) {
        Subjects artSubjects=new Arts();
        ArtsIterator iteratorForArts=artSubjects.createIterator();
        while (iteratorForArts.hasNext()) {
            System.out.println(iteratorForArts.next());
        }
        iteratorForArts.first();
        System.out.println(iteratorForArts.currentItem());
    }
}

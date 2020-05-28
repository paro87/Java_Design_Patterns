package com.paro.Behaviorial_Patterns.IteratorPattern.Type2;

public class Arts implements Subjects {
    private String[] papers;

    public Arts() {
        papers=new String[] {"English", "History", "Geography", "Psychology"};
    }
    @Override
    public ArtsIterator createIterator() {
        return new ArtsIterator(papers);
    }
}

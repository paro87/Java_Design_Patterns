package com.paro.Behaviorial_Patterns.IteratorPattern.Type1;

public class Arts implements Subjects{
    private String[] papers;

    public Arts() {
        papers=new String[] {"English", "History", "Geography", "Psychology"};
    }
    @Override
    public Iterator createIterator() {
        return new ArtsIterator(papers);
    }
}

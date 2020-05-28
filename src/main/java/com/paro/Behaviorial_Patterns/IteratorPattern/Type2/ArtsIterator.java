package com.paro.Behaviorial_Patterns.IteratorPattern.Type2;

import java.util.Iterator;

public class ArtsIterator implements Iterator<String> {
    private String[] papers;
    private int position;

    public ArtsIterator(String[] papers) {
        this.papers = papers;
        position=0;
    }

    public void first() {
        position=0;
    }

    @Override
    public String next() {
        return papers[position++];
    }

    @Override
    public void remove() {

    }

    public String currentItem() {
        return papers[position];
    }

    @Override
    public boolean hasNext() {
        if (position>=papers.length)
            return false;
        return true;
    }
}

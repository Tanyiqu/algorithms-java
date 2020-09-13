package com.tanyiqu.datastruct.linearlist.interfaces;


public interface Array<Element> {

    int size();

    boolean isEmpty();

    boolean contains(Element element);

    void add(Element element);

    Element get(int index);

    Element set(int index, Element element);

    Element remove(int index);

    int indexOf(Element element);

    void clear();

}
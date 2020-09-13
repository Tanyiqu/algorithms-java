package com.tanyiqu.datastruct.linearlist.impl;

import com.tanyiqu.datastruct.linearlist.interfaces.Array;

public class ArrayList<Element> implements Array<Element> {

    private static final long serialVersionUID = 1L;

    private static final int DEFAULT_CAPATICY = 128;

    private int size;
    private Object[] elements;

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        array.add(10);

    }

    public ArrayList() {
        elements = new Object[DEFAULT_CAPATICY];
    }

    public ArrayList(int capaticy) {
        elements = new Object[10];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Element element) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void add(Element element) {
        // TODO Auto-generated method stub

    }

    @Override
    @SuppressWarnings("unchecked")
    public Element get(int index) {
        Object obj = elements[index];
        Element e = (Element) obj;
        return e;
    }

    @Override
    public Element set(int index, Element element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Element remove(int index) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int indexOf(Element element) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

}
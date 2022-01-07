package com.tw;

public
class CustomSet {
    private boolean isEmpty = true;

    public
    boolean isEmpty() {
        return isEmpty;
    }

    public
    void add(int element) {
        isEmpty = false;
    }
}

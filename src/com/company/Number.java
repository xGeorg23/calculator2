package com.company;

class Number {
    private int value;
    private NumberType type;

    Number(int value, NumberType type) {
        this.value = value;
        this.type = type;
    }

    int getValue() {
        return this.value;
    }

    NumberType getType() {
        return this.type;
    }
}
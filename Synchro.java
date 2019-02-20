package com.company;

public class Synchro {
    public static void main(String[] args) {

        CallMe callMe = new CallMe();
        Caller obj1 = new Caller("test", callMe);
        Caller obj2 = new Caller("test2", callMe);
        Caller obj3 = new Caller("test3", callMe);
    }
}

package com.company;

public class Caller implements Runnable {

    private String msg;
    private final CallMe target;

    Caller(String msg, CallMe target) {
        this.msg = msg;
        this.target = target;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {

        synchronized (target) {
            target.call(msg);
        }

    }

}

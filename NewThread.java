package com.company;

import static com.company.ThreadColor.ANSI_GREEN;

public class NewThread implements Runnable {

    Thread t;

    public NewThread() {
        t = new Thread(this, "New Thread from runnable constructor");
        t.start();
    }

    @Override
    public void run() {
        System.out.println(ANSI_GREEN + "Thread <" + t.getName() + ">  -> start...");
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(i);
                Thread.sleep(1000);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(ANSI_GREEN + "... -> after 3 seconds");
    }

}

package com.company;

import static com.company.ThreadColor.ANSI_RED;

public class CallMe {

    void call(String msg) {
        System.out.print("[ ");
        try {
            Thread.sleep(1000);
            System.out.print(msg);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_RED + "Interrupted!");
        }
        System.out.println(" ]");
    }

}

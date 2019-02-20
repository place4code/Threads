package com.company;


import static com.company.ThreadColor.ANSI_GREEN;
import static com.company.ThreadColor.ANSI_PURPLE;
import static com.company.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println(t);


        NewThread nt1 = new NewThread();
        NewThread nt2 = new NewThread();
        NewThread nt3 = new NewThread();

        try {
            System.out.println(ANSI_RED + "I'm waiting");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        } catch (InterruptedException e) {
            System.out.println(ANSI_RED + "Main Thread interrupted - catch");
        }

        System.out.println(ANSI_RED + "Main Thread interrupted");

//        System.out.println(ANSI_PURPLE + "Main");
//
//        Thread anotherThread = new AnotherThread();
//        anotherThread.setName("AnotherThread");
//        anotherThread.start();
//
//        new Thread() {
//            public void run() {
//                System.out.println(ANSI_GREEN + "AnonymousThread");
//            }
//        }.start();
//
//        Thread myRunnableThread = new Thread(new MyRunnable());
//        myRunnableThread.start();
//
//        new Thread(new MyRunnable() {
//            @Override
//            public void run() {
//                System.out.println(ANSI_RED + "MyRunnable anonymous");
//            }
//        }).start();
//
//        System.out.println(ANSI_PURPLE + "Main");

    }
}

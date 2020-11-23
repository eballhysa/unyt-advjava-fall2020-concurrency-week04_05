/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonb.concurrency.intro.ex00;

import java.util.Date;

/**
 *
 * @author elton.ballhysa
 */
public class ThreadTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadTest t = new ThreadTest();
        try { 
            //t.testThreads();
            //t.testRunnables1();
            t.testRunnables2();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void testThreads() throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        System.out.println("Running testThreads, thread = " + threadName);
        System.out.println("Starting print threads at " + new Date());
        PrintThread thread1 = new PrintThread("doc1.txt");
        PrintThread thread2 = new PrintThread("doc2.txt");
        PrintThread thread3 = new PrintThread("doc3.txt");
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.printf("All print threads started at %s, thread = %s terminates\n", new Date(), threadName);
    }

    private void testRunnables1() {
        System.out.println("Running testRunnables1");
        Runnable run1 = () -> Utils.printDocument("doc1.txt");
        Runnable run2 = () -> Utils.printDocument("doc2.txt");
        Runnable run3 = () -> Utils.printDocument("doc3.txt");
        run1.run();
        run2.run();
        run3.run();
        System.out.println("All runnables finished at " + new Date());
    }
    
    private void testRunnables2() {
        System.out.println("Running testRunnables2");
        Thread thread1 = new Thread( () -> Utils.printDocument("doc1.txt") );
        Thread thread2 = new Thread( () -> Utils.printDocument("doc2.txt") );
        Thread thread3 = new Thread( () -> Utils.printDocument("doc3.txt") );
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("All print threads started at " + new Date());
    }

}

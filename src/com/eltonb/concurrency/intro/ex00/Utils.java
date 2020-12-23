/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonb.concurrency.intro.ex00;

import java.security.SecureRandom;
import java.util.Date;

/**
 *
 * @author elton.ballhysa
 */
public class Utils {
    
    public static void printDocument(String docName) {
        try {
            SecureRandom random = new SecureRandom();
            long sleepTime = random.nextInt(5000);
            String threadName = Thread.currentThread().getName();
            System.out.printf("printDocument [%s] for document %s started  at %s\n", threadName, docName, new Date());
            Thread.sleep(sleepTime);
            System.out.printf("printDocument [%s] for document %s finished at %s (slept %d ms)\n", threadName, docName, new Date(), sleepTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    
}

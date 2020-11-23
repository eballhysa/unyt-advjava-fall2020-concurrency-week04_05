/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonb.concurrency.intro.ex00;

/**
 *
 * @author elton.ballhysa
 */
public class PrintThread extends Thread {
    
    private final String document;
    
    public PrintThread(String document) {
        this.document = document;
    }

    @Override    
    public void run() {
        try {
            Utils.printDocument(document);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

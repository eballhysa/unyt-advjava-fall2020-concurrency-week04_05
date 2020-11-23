/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonb.concurrency.motivation.base;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author elton.ballhysa
 */
public class DateUtils {
    
    private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

    //wrong - SimpleDateFormat is not thread-safe
    public static String format1(Date date) {
        return formatter.format(date);
    }

    //correct
    public static String format2(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        return formatter.format(date);
    }
}

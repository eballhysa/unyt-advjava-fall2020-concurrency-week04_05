/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonb.concurrency.intro.ex00;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author elton.ballhysa
 */
public class DateUtils {

    public static final SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");

    private DateUtils() {
    }

    public synchronized static String formatDateAsDDMMYYYY1(Date date) {
        return formatter.format(date);
    }

    public static String formatDateAsDDMMYYYY2(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return formatter.format(date);
    }
}

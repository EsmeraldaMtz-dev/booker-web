package org.upskillher.web.utils;

public class Utils {

    public static String[] safeSplit(String str, String regex) {
        return str != null ? str.split(regex) : new String[0];
    }
}

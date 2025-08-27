package org.upskillher.web.utils;

public class ProjectUtils {

    public static String[] safeSplit(String str, String regex) {
        return str != null ? str.split(regex) : new String[0];
    }
}

package org.anywhere.master.utils;

public class BooleanUtils {

    public static boolean isBoolean(final String str) {
        return str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Validate {

    public static final String REGEX_NUMBER = "[0-9]+";
    public static final String REGEX_PHONE_NUMBER = "09[0-9]{8}";

    public static boolean checkRegex(String str, String regex) {
        return str.matches(regex);
    }

    public static boolean checkEmptyString(String str) {
        if (str.isBlank()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkPositiveNumble(int str) {
        return str > 0;
    }

    public static ArrayList<Integer> checkMutiLine(String type, String... str) {
        switch (type) {
            case "empty":
                return checkStringEmpty(str);
            case "isNumber":
                return checkIsNumber(str);
            default:
                return null;
        }
    }

    private static ArrayList<Integer> checkIsNumber(String[] str) {
        ArrayList<Integer> a = new ArrayList<>();
        int i = 1;
        for (String s : str) {
            if (!checkRegex(s,REGEX_NUMBER)) {
                a.add(i);
            }
            i++;
        }
        return a;
    }

    private static ArrayList<Integer> checkStringEmpty(String[] str) {
        ArrayList<Integer> a = new ArrayList<>();
        int i = 1;
        for (String s : str) {
            if (!checkEmptyString(s)) {
                a.add(i);
            }
            i++;
        }
        return a;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Conventer {

    private HashMap<String, Integer> rim;
    private LinkedHashMap<String, Integer> roman_num;
    public int x;
    Conventer(){
        rim = new HashMap<>();
        rim.put("I", 1);
        rim.put("II", 2);
        rim.put("III", 3);
        rim.put("IV", 4);
        rim.put("V", 5);
        rim.put("VI", 6);
        rim.put("VII", 7);
        rim.put("VIII", 8);
        rim.put("IX", 9);
        rim.put("X", 10);
        roman_num = new LinkedHashMap<String, Integer>();
        roman_num.put("C", 100);
        roman_num.put("XC", 90);
        roman_num.put("L", 50);
        roman_num.put("XL", 40);
        roman_num.put("X", 10);
        roman_num.put("IX", 9);
        roman_num.put("V", 5);
        roman_num.put("IV", 4);
        roman_num.put("I", 1);
    }

    public int romToAr(String p){
        return rim.get(p);
    }

    public String arToRoman (int numb){
        String res = "";
        for (Map.Entry<String, Integer> entry : roman_num.entrySet()) {
            int matches = numb / entry.getValue();
            res += repeat(entry.getKey(), matches);
            numb = numb % entry.getValue();
        }
        return res;
    }

    public static String repeat (String s,int n){
        if (s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
    public void stringToInt(String p, String h, ArrayList var){
        boolean n = rim.containsKey(p);
        boolean t = rim.containsKey(h);
        if (n == true & t == true){
            var.add(romToAr(p));
            var.add(romToAr(h));
            x = 1;
        }
        else {
            try {
                var.add(Integer.parseInt(p.trim()));
                var.add(Integer.parseInt(h.trim()));
            }
            catch (NumberFormatException nic){
                System.out.println("throws Exception //т.к. неверный ввод");
                int k = 0;
                System.exit(k);
            }
        }
    }
}
